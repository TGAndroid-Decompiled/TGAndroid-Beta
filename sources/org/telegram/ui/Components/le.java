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
public final class le extends FrameLayout {
    public final Paint f30421a;
    public final RectF f30422b;
    public final org.telegram.ui.ActionBar.b6 f30423c;
    public final ChatActivityEnterView d;

    public le(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f30423c = b6Var;
        this.f30421a = new Paint(1);
        this.f30422b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.W0) {
            se seVar = chatActivityEnterView.O0;
            float f10 = 1.0f;
            if (seVar != null && seVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.O0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int h02 = chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.Yd);
            Paint paint = this.f30421a;
            paint.setColor(h02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f30422b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d.f26119g5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ae aeVar;
        long j10;
        int i9;
        long j11;
        int i10;
        long j12;
        int i11;
        long j13;
        int i12;
        float f10;
        int i13;
        float f11;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i14;
        int i15;
        ChatActivityEnterView chatActivityEnterView = this.d;
        le leVar = chatActivityEnterView.V0;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        re reVar = chatActivityEnterView.C3;
        zf zfVar = chatActivityEnterView.F3;
        oe oeVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.f26119g5) {
            chatActivityEnterView.X();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f26154n4) {
                    boolean z10 = chatActivityEnterView.Z1;
                    if (!z10 || chatActivityEnterView.E3) {
                        chatActivityEnterView.f26211y2 = -1.0f;
                        if (z10 && chatActivityEnterView.Y0) {
                            if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26109f1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.U2.c1();
                                y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {
                                    public final le f29723b;

                                    {
                                        this.f29723b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            eg egVar = chatActivityEnterView.U2;
                            if (chatActivityEnterView.K) {
                                i15 = Integer.MAX_VALUE;
                            } else {
                                i15 = 0;
                            }
                            egVar.U1(1, 0, i15, chatActivityEnterView.N4, 0L, true);
                            chatActivityEnterView.N4 = 0L;
                            oeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.J2;
                                long a2 = qnVar.a();
                                g2 g2Var = new g2(10);
                                hc hcVar = new hc(3);
                                Pattern pattern = y4.f34847a;
                                org.telegram.ui.ActionBar.b6 b6Var = this.f30423c;
                                y4.K(activity, a2, -1L, 0, false, g2Var, hcVar, new w4(b6Var), b6Var);
                            }
                            if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                if (chatActivityEnterView.Y0) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f26109f1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.U2.c1();
                                } else {
                                    if (chatActivityEnterView.f26154n4) {
                                        chatActivityEnterView.E3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                    chatActivityEnterView.U2.L0(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f26109f1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {
                                    public final le f29723b;

                                    {
                                        this.f29723b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            MediaController mediaController = MediaController.getInstance();
                            if (chatActivityEnterView.c()) {
                                i14 = 3;
                            } else {
                                i14 = 1;
                            }
                            mediaController.stopRecording(i14, true, 0, chatActivityEnterView.K, 0L);
                            chatActivityEnterView.U2.L0(0);
                        }
                        chatActivityEnterView.A2 = false;
                        chatActivityEnterView.f26088c0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final le f30066b;

                            {
                                this.f30066b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f30066b.d;
                                        chatActivityEnterView2.f26081b0 = null;
                                        chatActivityEnterView2.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f30066b.d;
                                        chatActivityEnterView3.f26081b0 = null;
                                        chatActivityEnterView3.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f26081b0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (qnVar == null) {
                    chat = null;
                } else {
                    chat = qnVar.f41890e;
                }
                if (qnVar == null) {
                    userFull = chatActivityEnterView.G;
                } else {
                    userFull = qnVar.W7;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.Z1)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.U2.Q1();
                    return true;
                } else if (chatActivityEnterView.Z1) {
                    chatActivityEnterView.E3 = false;
                    chatActivityEnterView.D3 = true;
                    AndroidUtilities.runOnUIThread(zfVar, 150L);
                    return true;
                } else {
                    zfVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.A2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f26154n4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.f26118g4 == -1.0f) {
                                chatActivityEnterView2.f26112f4 = y10;
                            }
                            chatActivityEnterView2.f26118g4 = y10;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f26148m4 && chatActivityEnterView2.f26105e4 >= 0.7f && chatActivityEnterView2.f26112f4 - chatActivityEnterView2.f26118g4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f26154n4 = true;
                                ig igVar = chatActivityEnterView2.J1;
                                if (igVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    igVar.a();
                                    kh.x3 x3Var = new kh.x3(igVar.getContext(), 2);
                                    igVar.f29424a = x3Var;
                                    x3Var.m(1.0f, 0.0f);
                                    igVar.f29424a.q(true);
                                    igVar.f29424a.t(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    igVar.addView(igVar.f29424a, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    kh.x3 x3Var2 = igVar.f29424a;
                                    x3Var2.f16352h0 = new gg(igVar, x3Var2, 3);
                                    x3Var2.v();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                                float f12 = x10 - recordCircle2.B;
                                float f13 = y10 - recordCircle2.C;
                                float f14 = (f13 * f13) + (f12 * f12);
                                recordCircle2.C = y10;
                                recordCircle2.B = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.Z3 && chatActivityEnterView3.f26085b4 == 0.0f && f14 > recordCircle2.A) {
                                    f10 = 1.0f;
                                    chatActivityEnterView3.f26078a4 = System.currentTimeMillis();
                                } else {
                                    f10 = 1.0f;
                                }
                                if (chatActivityEnterView.f26211y2 == -1.0f) {
                                    chatActivityEnterView.f26211y2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f26121h1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.f26216z2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.f26216z2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = leVar.getX() + x10;
                                float f15 = chatActivityEnterView.f26211y2;
                                float f16 = ((x11 - f15) / chatActivityEnterView.f26216z2) + f10;
                                if (f15 != -1.0f) {
                                    if (f16 > f10) {
                                        f11 = 1.0f;
                                    } else if (f16 < 0.0f) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = f16;
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f26109f1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f26236r = f11;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f11);
                                    f16 = f11;
                                }
                                if (f16 == 0.0f) {
                                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                                        eg egVar2 = chatActivityEnterView.U2;
                                        if (chatActivityEnterView.K) {
                                            i13 = Integer.MAX_VALUE;
                                        } else {
                                            i13 = 0;
                                        }
                                        egVar2.U1(2, 0, i13, chatActivityEnterView.N4, 0L, true);
                                        chatActivityEnterView.N4 = 0L;
                                        oeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.U2.L0(0);
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
                if (chatActivityEnterView.f26105e4 < 0.7f) {
                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        eg egVar3 = chatActivityEnterView.U2;
                        if (chatActivityEnterView.K) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        egVar3.U1(2, 0, i12, chatActivityEnterView.N4, 0L, true);
                        j13 = 0;
                        chatActivityEnterView.N4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.U2.L0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                        j13 = 0;
                    }
                    chatActivityEnterView.f26102e1 = j13;
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.L1(5, true);
                    return false;
                }
                chatActivityEnterView.f26154n4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.I1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f26154n4) || ((aeVar = chatActivityEnterView.f26077a1) != null && aeVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.D3) {
                        AndroidUtilities.cancelRunOnUIThread(zfVar);
                    }
                } else if ((((leVar.getX() + motionEvent.getX()) - chatActivityEnterView.f26211y2) / chatActivityEnterView.f26216z2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        eg egVar4 = chatActivityEnterView.U2;
                        if (chatActivityEnterView.K) {
                            i11 = Integer.MAX_VALUE;
                        } else {
                            i11 = 0;
                        }
                        egVar4.U1(2, 0, i11, chatActivityEnterView.N4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.N4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.U2.L0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f26102e1 = j12;
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                } else if (chatActivityEnterView.D3) {
                    AndroidUtilities.cancelRunOnUIThread(zfVar);
                    if (chatActivityEnterView.f26187u0 && chatActivityEnterView.f26182t0) {
                        chatActivityEnterView.U2.H(!chatActivityEnterView.Y0);
                        chatActivityEnterView.k1(!chatActivityEnterView.Y0, true);
                    } else {
                        chatActivityEnterView.U2.Q1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.Z1;
                    if (!z12 || chatActivityEnterView.E3) {
                        chatActivityEnterView.f26211y2 = -1.0f;
                        if (z12 && chatActivityEnterView.Y0) {
                            if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f26109f1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.U2.c1();
                                y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {
                                    public final le f29723b;

                                    {
                                        this.f29723b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(reVar);
                            eg egVar5 = chatActivityEnterView.U2;
                            if (chatActivityEnterView.K) {
                                i10 = Integer.MAX_VALUE;
                            } else {
                                i10 = 0;
                            }
                            egVar5.U1(1, 0, i10, chatActivityEnterView.N4, 0L, true);
                            j10 = 0;
                            chatActivityEnterView.N4 = 0L;
                            oeVar.setEffect(0L);
                        } else {
                            j10 = 0;
                            if (!chatActivityEnterView.f26187u0) {
                                chatActivityEnterView.U2.Q1();
                            } else if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                if (chatActivityEnterView.f26154n4) {
                                    chatActivityEnterView.E3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                chatActivityEnterView.U2.L0(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f26109f1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {
                                    public final le f29723b;

                                    {
                                        this.f29723b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f29723b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.J2;
                                    long a3 = qnVar.a();
                                    g2 g2Var2 = new g2(11);
                                    hc hcVar2 = new hc(4);
                                    org.telegram.ui.ActionBar.b6 b6Var2 = this.f30423c;
                                    y4.K(activity2, a3, -1L, 0, false, g2Var2, hcVar2, new w4(b6Var2), b6Var2);
                                }
                                chatActivityEnterView.U2.L0(0);
                                MediaController mediaController2 = MediaController.getInstance();
                                if (chatActivityEnterView.c()) {
                                    i9 = 3;
                                } else {
                                    i9 = 1;
                                }
                                mediaController2.stopRecording(i9, true, 0, chatActivityEnterView.K, 0L);
                            }
                        }
                        chatActivityEnterView.A2 = false;
                        chatActivityEnterView.f26088c0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final le f30066b;

                            {
                                this.f30066b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f30066b.d;
                                        chatActivityEnterView22.f26081b0 = null;
                                        chatActivityEnterView22.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f30066b.d;
                                        chatActivityEnterView32.f26081b0 = null;
                                        chatActivityEnterView32.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f26081b0 = runnable2;
                        if (chatActivityEnterView.f26186t4) {
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
