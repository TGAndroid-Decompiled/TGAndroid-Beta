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
    public final Paint f28698a;
    public final RectF f28699b;
    public final org.telegram.ui.ActionBar.g6 f28700c;
    public final ChatActivityEnterView d;

    public le(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f28700c = g6Var;
        this.f28698a = new Paint(1);
        this.f28699b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.X0) {
            se seVar = chatActivityEnterView.P0;
            float f10 = 1.0f;
            if (seVar != null && seVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.P0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.k6.Yd);
            Paint paint = this.f28698a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f28699b;
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
        if (this.d.f24619h5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ae aeVar;
        long j10;
        int i10;
        long j11;
        int i11;
        long j12;
        int i12;
        long j13;
        int i13;
        float f10;
        int i14;
        float f11;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i15;
        int i16;
        ChatActivityEnterView chatActivityEnterView = this.d;
        le leVar = chatActivityEnterView.W0;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        re reVar = chatActivityEnterView.D3;
        zf zfVar = chatActivityEnterView.G3;
        oe oeVar = chatActivityEnterView.G0;
        if (!chatActivityEnterView.f24619h5) {
            chatActivityEnterView.Y();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f24654o4) {
                    boolean z4 = chatActivityEnterView.a2;
                    if (!z4 || chatActivityEnterView.F3) {
                        chatActivityEnterView.f24712z2 = -1.0f;
                        if (z4 && chatActivityEnterView.Z0) {
                            if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f24609g1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.V2.t1();
                                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) {
                                    public final le f28104b;

                                    {
                                        this.f28104b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            eg egVar = chatActivityEnterView.V2;
                            if (chatActivityEnterView.L) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            egVar.u2(1, 0, i16, chatActivityEnterView.O4, 0L, true);
                            chatActivityEnterView.O4 = 0L;
                            oeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.B2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.K2;
                                long a2 = xnVar.a();
                                k2 k2Var = new k2(9);
                                jc jcVar = new jc(3);
                                Pattern pattern = z4.f33718a;
                                org.telegram.ui.ActionBar.g6 g6Var = this.f28700c;
                                z4.K(activity, a2, -1L, 0, false, k2Var, jcVar, new x4(g6Var), g6Var);
                            }
                            if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                                if (chatActivityEnterView.Z0) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f24609g1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.V2.t1();
                                } else {
                                    if (chatActivityEnterView.f24654o4) {
                                        chatActivityEnterView.F3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                                    chatActivityEnterView.V2.e1(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f24609g1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) {
                                    public final le f28104b;

                                    {
                                        this.f28104b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
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
                            mediaController.stopRecording(i15, true, 0, chatActivityEnterView.L, 0L);
                            chatActivityEnterView.V2.e1(0);
                        }
                        chatActivityEnterView.B2 = false;
                        chatActivityEnterView.f24588d0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final le f28378b;

                            {
                                this.f28378b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f28378b.d;
                                        chatActivityEnterView2.f24583c0 = null;
                                        chatActivityEnterView2.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f28378b.d;
                                        chatActivityEnterView3.f24583c0 = null;
                                        chatActivityEnterView3.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f24583c0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (xnVar == null) {
                    chat = null;
                } else {
                    chat = xnVar.f43165e;
                }
                if (xnVar == null) {
                    userFull = chatActivityEnterView.H;
                } else {
                    userFull = xnVar.X7;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.a2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.V2.s2();
                    return true;
                } else if (chatActivityEnterView.a2) {
                    chatActivityEnterView.F3 = false;
                    chatActivityEnterView.E3 = true;
                    AndroidUtilities.runOnUIThread(zfVar, 150L);
                    return true;
                } else {
                    zfVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.B2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f24654o4;
                    if (!z10) {
                        if (!z10) {
                            if (chatActivityEnterView2.f24618h4 == -1.0f) {
                                chatActivityEnterView2.f24612g4 = y10;
                            }
                            chatActivityEnterView2.f24618h4 = y10;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f24649n4 && chatActivityEnterView2.f24606f4 >= 0.7f && chatActivityEnterView2.f24612g4 - chatActivityEnterView2.f24618h4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f24654o4 = true;
                                ig igVar = chatActivityEnterView2.K1;
                                if (igVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    igVar.a();
                                    qh.f3 f3Var = new qh.f3(igVar.getContext(), 2);
                                    igVar.f27770a = f3Var;
                                    f3Var.m(1.0f, 0.0f);
                                    igVar.f27770a.q(true);
                                    igVar.f27770a.t(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    igVar.addView(igVar.f27770a, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    qh.f3 f3Var2 = igVar.f27770a;
                                    f3Var2.f45298i0 = new gg(igVar, f3Var2, 3);
                                    f3Var2.v();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.J1;
                                float f12 = x10 - recordCircle2.C;
                                float f13 = y10 - recordCircle2.D;
                                float f14 = (f13 * f13) + (f12 * f12);
                                recordCircle2.D = y10;
                                recordCircle2.C = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f24573a4 && chatActivityEnterView3.f24586c4 == 0.0f && f14 > recordCircle2.B) {
                                    f10 = 1.0f;
                                    chatActivityEnterView3.f24580b4 = System.currentTimeMillis();
                                } else {
                                    f10 = 1.0f;
                                }
                                if (chatActivityEnterView.f24712z2 == -1.0f) {
                                    chatActivityEnterView.f24712z2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f24621i1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.A2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.A2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = leVar.getX() + x10;
                                float f15 = chatActivityEnterView.f24712z2;
                                float f16 = ((x11 - f15) / chatActivityEnterView.A2) + f10;
                                if (f15 != -1.0f) {
                                    if (f16 > f10) {
                                        f11 = 1.0f;
                                    } else if (f16 < 0.0f) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = f16;
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f24609g1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f24731r = f11;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f11);
                                    f16 = f11;
                                }
                                if (f16 == 0.0f) {
                                    if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                                        eg egVar2 = chatActivityEnterView.V2;
                                        if (chatActivityEnterView.L) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        egVar2.u2(2, 0, i14, chatActivityEnterView.O4, 0L, true);
                                        chatActivityEnterView.O4 = 0L;
                                        oeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.V2.e1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                                    }
                                    chatActivityEnterView.B2 = false;
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
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.B2) {
                if (chatActivityEnterView.f24606f4 < 0.7f) {
                    if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        eg egVar3 = chatActivityEnterView.V2;
                        if (chatActivityEnterView.L) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        egVar3.u2(2, 0, i13, chatActivityEnterView.O4, 0L, true);
                        j13 = 0;
                        chatActivityEnterView.O4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.V2.e1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                        j13 = 0;
                    }
                    chatActivityEnterView.f24603f1 = j13;
                    chatActivityEnterView.B2 = false;
                    chatActivityEnterView.L1(5, true);
                    return false;
                }
                chatActivityEnterView.f24654o4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.J1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f24654o4) || ((aeVar = chatActivityEnterView.f24577b1) != null && aeVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.E3) {
                        AndroidUtilities.cancelRunOnUIThread(zfVar);
                    }
                } else if ((((leVar.getX() + motionEvent.getX()) - chatActivityEnterView.f24712z2) / chatActivityEnterView.A2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        eg egVar4 = chatActivityEnterView.V2;
                        if (chatActivityEnterView.L) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        egVar4.u2(2, 0, i12, chatActivityEnterView.O4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.O4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.V2.e1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f24603f1 = j12;
                    chatActivityEnterView.B2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                } else if (chatActivityEnterView.E3) {
                    AndroidUtilities.cancelRunOnUIThread(zfVar);
                    if (chatActivityEnterView.f24687v0 && chatActivityEnterView.f24682u0) {
                        chatActivityEnterView.V2.Y(!chatActivityEnterView.Z0);
                        chatActivityEnterView.k1(!chatActivityEnterView.Z0, true);
                    } else {
                        chatActivityEnterView.V2.s2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z11 = chatActivityEnterView.a2;
                    if (!z11 || chatActivityEnterView.F3) {
                        chatActivityEnterView.f24712z2 = -1.0f;
                        if (z11 && chatActivityEnterView.Z0) {
                            if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f24609g1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.V2.t1();
                                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) {
                                    public final le f28104b;

                                    {
                                        this.f28104b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(reVar);
                            eg egVar5 = chatActivityEnterView.V2;
                            if (chatActivityEnterView.L) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            egVar5.u2(1, 0, i11, chatActivityEnterView.O4, 0L, true);
                            j10 = 0;
                            chatActivityEnterView.O4 = 0L;
                            oeVar.setEffect(0L);
                        } else {
                            j10 = 0;
                            if (!chatActivityEnterView.f24687v0) {
                                chatActivityEnterView.V2.s2();
                            } else if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                                if (chatActivityEnterView.f24654o4) {
                                    chatActivityEnterView.F3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                                chatActivityEnterView.V2.e1(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f24609g1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) {
                                    public final le f28104b;

                                    {
                                        this.f28104b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f28104b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.B2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.K2;
                                    long a10 = xnVar.a();
                                    k2 k2Var2 = new k2(10);
                                    jc jcVar2 = new jc(4);
                                    org.telegram.ui.ActionBar.g6 g6Var2 = this.f28700c;
                                    z4.K(activity2, a10, -1L, 0, false, k2Var2, jcVar2, new x4(g6Var2), g6Var2);
                                }
                                chatActivityEnterView.V2.e1(0);
                                MediaController mediaController2 = MediaController.getInstance();
                                if (chatActivityEnterView.c()) {
                                    i10 = 3;
                                } else {
                                    i10 = 1;
                                }
                                mediaController2.stopRecording(i10, true, 0, chatActivityEnterView.L, 0L);
                            }
                        }
                        chatActivityEnterView.B2 = false;
                        chatActivityEnterView.f24588d0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final le f28378b;

                            {
                                this.f28378b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f28378b.d;
                                        chatActivityEnterView22.f24583c0 = null;
                                        chatActivityEnterView22.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f28378b.d;
                                        chatActivityEnterView32.f24583c0 = null;
                                        chatActivityEnterView32.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f24583c0 = runnable2;
                        if (chatActivityEnterView.f24686u4) {
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
