package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oe extends FrameLayout {
    public final Paint f31337a;
    public final RectF f31338b;
    public final org.telegram.ui.ActionBar.c6 f31339c;
    public final ChatActivityEnterView d;

    public oe(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f31339c = c6Var;
        this.f31337a = new Paint(1);
        this.f31338b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.W0) {
            ve veVar = chatActivityEnterView.O0;
            float f9 = 1.0f;
            if (veVar != null && veVar.getVisibility() == 0) {
                f9 = 1.0f - chatActivityEnterView.O0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.Yd);
            Paint paint = this.f31337a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f31338b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f9, f9, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d.f26130g5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        de deVar;
        long j10;
        int i10;
        long j11;
        int i11;
        long j12;
        int i12;
        long j13;
        int i13;
        int i14;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i15;
        int i16;
        ChatActivityEnterView chatActivityEnterView = this.d;
        oe oeVar = chatActivityEnterView.V0;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        ue ueVar = chatActivityEnterView.C3;
        cg cgVar = chatActivityEnterView.F3;
        re reVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.f26130g5) {
            chatActivityEnterView.Y();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f26165n4) {
                    boolean z10 = chatActivityEnterView.Z1;
                    if (!z10 || chatActivityEnterView.E3) {
                        chatActivityEnterView.f26222y2 = -1.0f;
                        if (z10 && chatActivityEnterView.Y0) {
                            if (c5.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26120f1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.U2.n1();
                                c5.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {
                                    public final oe f30667b;

                                    {
                                        this.f30667b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            hg hgVar = chatActivityEnterView.U2;
                            if (chatActivityEnterView.K) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            hgVar.l2(1, 0, i16, chatActivityEnterView.N4, 0L, true);
                            chatActivityEnterView.N4 = 0L;
                            reVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.J2;
                                long a2 = tnVar.a();
                                r2 r2Var = new r2(4);
                                g5 g5Var = new g5(5);
                                Pattern pattern = c5.f27308a;
                                org.telegram.ui.ActionBar.c6 c6Var = this.f31339c;
                                c5.K(activity, a2, -1L, 0, false, r2Var, g5Var, new a5(c6Var), c6Var);
                            }
                            if (c5.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                if (chatActivityEnterView.Y0) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f26120f1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.U2.n1();
                                } else {
                                    if (chatActivityEnterView.f26165n4) {
                                        chatActivityEnterView.E3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                    chatActivityEnterView.U2.a1(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f26120f1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                c5.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {
                                    public final oe f30667b;

                                    {
                                        this.f30667b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            MediaController mediaController = MediaController.getInstance();
                            if (chatActivityEnterView.c()) {
                                i15 = 3;
                            } else {
                                i15 = 1;
                            }
                            mediaController.stopRecording(i15, true, 0, chatActivityEnterView.K, 0L);
                            chatActivityEnterView.U2.a1(0);
                        }
                        chatActivityEnterView.A2 = false;
                        chatActivityEnterView.f26100c0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final oe f30972b;

                            {
                                this.f30972b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f30972b.d;
                                        chatActivityEnterView2.f26093b0 = null;
                                        chatActivityEnterView2.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f30972b.d;
                                        chatActivityEnterView3.f26093b0 = null;
                                        chatActivityEnterView3.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f26093b0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (tnVar == null) {
                    chat = null;
                } else {
                    chat = tnVar.f42787e;
                }
                if (tnVar == null) {
                    userFull = chatActivityEnterView.G;
                } else {
                    userFull = tnVar.W7;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.Z1)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.U2.i2();
                    return true;
                } else if (chatActivityEnterView.Z1) {
                    chatActivityEnterView.E3 = false;
                    chatActivityEnterView.D3 = true;
                    AndroidUtilities.runOnUIThread(cgVar, 150L);
                    return true;
                } else {
                    cgVar.run();
                    return true;
                }
            }
            float f9 = 1.0f;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.A2) {
                    float x4 = motionEvent.getX();
                    float y8 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f26165n4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.f26129g4 == -1.0f) {
                                chatActivityEnterView2.f26123f4 = y8;
                            }
                            chatActivityEnterView2.f26129g4 = y8;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f26159m4 && chatActivityEnterView2.f26116e4 >= 0.7f && chatActivityEnterView2.f26123f4 - chatActivityEnterView2.f26129g4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f26165n4 = true;
                                lg lgVar = chatActivityEnterView2.J1;
                                if (lgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    lgVar.a();
                                    nh.t3 t3Var = new nh.t3(lgVar.getContext(), 2);
                                    lgVar.f30304a = t3Var;
                                    t3Var.m(1.0f, 0.0f);
                                    lgVar.f30304a.q(true);
                                    lgVar.f30304a.t(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    lgVar.addView(lgVar.f30304a, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    nh.t3 t3Var2 = lgVar.f30304a;
                                    t3Var2.f18597h0 = new jg(lgVar, t3Var2, 3);
                                    t3Var2.v();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                                float f10 = x4 - recordCircle2.B;
                                float f11 = y8 - recordCircle2.C;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.C = y8;
                                recordCircle2.B = x4;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.Z3 && chatActivityEnterView3.f26097b4 == 0.0f && f12 > recordCircle2.A) {
                                    chatActivityEnterView3.f26090a4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.f26222y2 == -1.0f) {
                                    chatActivityEnterView.f26222y2 = x4;
                                    float measuredWidth = (float) (chatActivityEnterView.f26132h1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.f26227z2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.f26227z2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x10 = oeVar.getX() + x4;
                                float f13 = chatActivityEnterView.f26222y2;
                                float f14 = ((x10 - f13) / chatActivityEnterView.f26227z2) + 1.0f;
                                if (f13 != -1.0f) {
                                    if (f14 <= 1.0f) {
                                        if (f14 < 0.0f) {
                                            f9 = 0.0f;
                                        } else {
                                            f9 = f14;
                                        }
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f26120f1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f26247r = f9;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f9);
                                    f14 = f9;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                                        CameraController.getInstance().cancelOnInitRunnable(ueVar);
                                        hg hgVar2 = chatActivityEnterView.U2;
                                        if (chatActivityEnterView.K) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        hgVar2.l2(2, 0, i14, chatActivityEnterView.N4, 0L, true);
                                        chatActivityEnterView.N4 = 0L;
                                        reVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.U2.a1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                                    }
                                    chatActivityEnterView.A2 = false;
                                    chatActivityEnterView.L1(5, true);
                                    return true;
                                }
                            }
                        }
                        ChatActivityEnterView.m(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.A2) {
                if (chatActivityEnterView.f26116e4 < 0.7f) {
                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                        CameraController.getInstance().cancelOnInitRunnable(ueVar);
                        hg hgVar3 = chatActivityEnterView.U2;
                        if (chatActivityEnterView.K) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        hgVar3.l2(2, 0, i13, chatActivityEnterView.N4, 0L, true);
                        j13 = 0;
                        chatActivityEnterView.N4 = 0L;
                        reVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.U2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                        j13 = 0;
                    }
                    chatActivityEnterView.f26113e1 = j13;
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.L1(5, true);
                    return false;
                }
                chatActivityEnterView.f26165n4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.I1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f26165n4) || ((deVar = chatActivityEnterView.f26088a1) != null && deVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.D3) {
                        AndroidUtilities.cancelRunOnUIThread(cgVar);
                    }
                } else if ((((oeVar.getX() + motionEvent.getX()) - chatActivityEnterView.f26222y2) / chatActivityEnterView.f26227z2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                        CameraController.getInstance().cancelOnInitRunnable(ueVar);
                        hg hgVar4 = chatActivityEnterView.U2;
                        if (chatActivityEnterView.K) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        hgVar4.l2(2, 0, i12, chatActivityEnterView.N4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.N4 = 0L;
                        reVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.U2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f26113e1 = j12;
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                } else if (chatActivityEnterView.D3) {
                    AndroidUtilities.cancelRunOnUIThread(cgVar);
                    if (chatActivityEnterView.f26198u0 && chatActivityEnterView.f26193t0) {
                        chatActivityEnterView.U2.U(!chatActivityEnterView.Y0);
                        chatActivityEnterView.k1(!chatActivityEnterView.Y0, true);
                    } else {
                        chatActivityEnterView.U2.i2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.Z1;
                    if (!z12 || chatActivityEnterView.E3) {
                        chatActivityEnterView.f26222y2 = -1.0f;
                        if (z12 && chatActivityEnterView.Y0) {
                            if (c5.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f26120f1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.U2.n1();
                                c5.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {
                                    public final oe f30667b;

                                    {
                                        this.f30667b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(ueVar);
                            hg hgVar5 = chatActivityEnterView.U2;
                            if (chatActivityEnterView.K) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            hgVar5.l2(1, 0, i11, chatActivityEnterView.N4, 0L, true);
                            j10 = 0;
                            chatActivityEnterView.N4 = 0L;
                            reVar.setEffect(0L);
                        } else {
                            j10 = 0;
                            if (!chatActivityEnterView.f26198u0) {
                                chatActivityEnterView.U2.i2();
                            } else if (c5.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                if (chatActivityEnterView.f26165n4) {
                                    chatActivityEnterView.E3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                chatActivityEnterView.U2.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f26120f1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                c5.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {
                                    public final oe f30667b;

                                    {
                                        this.f30667b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f30667b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.J2;
                                    long a10 = tnVar.a();
                                    r2 r2Var2 = new r2(5);
                                    g5 g5Var2 = new g5(6);
                                    org.telegram.ui.ActionBar.c6 c6Var2 = this.f31339c;
                                    c5.K(activity2, a10, -1L, 0, false, r2Var2, g5Var2, new a5(c6Var2), c6Var2);
                                }
                                chatActivityEnterView.U2.a1(0);
                                MediaController mediaController2 = MediaController.getInstance();
                                if (chatActivityEnterView.c()) {
                                    i10 = 3;
                                } else {
                                    i10 = 1;
                                }
                                mediaController2.stopRecording(i10, true, 0, chatActivityEnterView.K, 0L);
                            }
                        }
                        chatActivityEnterView.A2 = false;
                        chatActivityEnterView.f26100c0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final oe f30972b;

                            {
                                this.f30972b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f30972b.d;
                                        chatActivityEnterView22.f26093b0 = null;
                                        chatActivityEnterView22.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f30972b.d;
                                        chatActivityEnterView32.f26093b0 = null;
                                        chatActivityEnterView32.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f26093b0 = runnable2;
                        if (chatActivityEnterView.f26197t4) {
                            j11 = 500;
                        } else {
                            j11 = j10;
                        }
                        AndroidUtilities.runOnUIThread(runnable2, j11);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
