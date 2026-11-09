package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class de extends FrameLayout {
    public final Paint f32937a;
    public final RectF f32938b;
    public final org.telegram.ui.ActionBar.g6 f32939c;
    public final ChatActivityEnterView d;

    public de(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f32939c = g6Var;
        this.f32937a = new Paint(1);
        this.f32938b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f31020a1) {
            ke keVar = chatActivityEnterView.S0;
            float f10 = 1.0f;
            if (keVar != null && keVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float N = org.telegram.messenger.g0.N(19.0f);
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.l6.Me);
            Paint paint = this.f32937a;
            paint.setColor(f02);
            float N2 = org.telegram.messenger.g0.N(3.0f);
            float N3 = org.telegram.messenger.g0.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.f32938b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, N, N, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d.f31113p5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ud udVar;
        long j3;
        long j10;
        int i7;
        long j11;
        int i10;
        long j12;
        int i11;
        int i12;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i13;
        ChatActivityEnterView chatActivityEnterView = this.d;
        de deVar = chatActivityEnterView.Z0;
        org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
        je jeVar = chatActivityEnterView.H3;
        rf rfVar = chatActivityEnterView.K3;
        ge geVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f31113p5) {
            chatActivityEnterView.U();
            int i14 = 3;
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f31132s4) {
                    boolean z9 = chatActivityEnterView.f31047e2;
                    if (!z9 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z9 && chatActivityEnterView.f31034c1) {
                            if (v4.a0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31082k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.c1();
                                v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.c20(this) {
                                    public final de f32237b;

                                    {
                                        this.f32237b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 1:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 2:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            default:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            wf wfVar = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i13 = Integer.MAX_VALUE;
                            } else {
                                i13 = 0;
                            }
                            wfVar.Z1(1, 0, i13, chatActivityEnterView.S4, 0L, true);
                            chatActivityEnterView.S4 = 0L;
                            geVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.O2;
                                long a10 = cnVar.a();
                                k2 k2Var = new k2(11);
                                org.telegram.messenger.rc rcVar = new org.telegram.messenger.rc(24);
                                Pattern pattern = v4.f38913a;
                                org.telegram.ui.ActionBar.g6 g6Var = this.f32939c;
                                v4.H(activity, a10, -1L, 0, false, k2Var, rcVar, new s4(g6Var), g6Var);
                            }
                            if (v4.a0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f31034c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f31082k1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Z2.c1();
                                } else {
                                    if (chatActivityEnterView.f31132s4) {
                                        chatActivityEnterView.J3 = true;
                                    }
                                    MediaController.B().D0(chatActivityEnterView.O);
                                    chatActivityEnterView.Z2.R0(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f31082k1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.c20(this) {
                                    public final de f32237b;

                                    {
                                        this.f32237b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 1:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 2:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            default:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            MediaController B = MediaController.B();
                            if (!chatActivityEnterView.c()) {
                                i14 = 1;
                            }
                            B.B0(i14, 0, true, chatActivityEnterView.O);
                            chatActivityEnterView.Z2.R0(0);
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f31058g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final de f32648b;

                            {
                                this.f32648b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f32648b.d;
                                        chatActivityEnterView2.f31052f0 = null;
                                        chatActivityEnterView2.N1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f32648b.d;
                                        chatActivityEnterView3.f31052f0 = null;
                                        chatActivityEnterView3.N1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f31052f0 = runnable;
                        org.telegram.messenger.g0.i3(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (cnVar == null) {
                    chat = null;
                } else {
                    chat = cnVar.f44432e;
                }
                if (cnVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = cnVar.f44592q8;
                }
                if ((chat != null && !org.telegram.messenger.t3.v(chat) && (!org.telegram.messenger.t3.s(chat) || !chatActivityEnterView.f31047e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Z2.X1();
                    return true;
                } else if (chatActivityEnterView.f31047e2) {
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    org.telegram.messenger.g0.i3(rfVar, 150L);
                    return true;
                } else {
                    rfVar.run();
                    return true;
                }
            }
            float f10 = 1.0f;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.F2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f31132s4;
                    if (!z10) {
                        if (!z10) {
                            if (chatActivityEnterView2.f31090l4 == -1.0f) {
                                chatActivityEnterView2.f31085k4 = y10;
                            }
                            chatActivityEnterView2.f31090l4 = y10;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f31125r4 && chatActivityEnterView2.f31079j4 >= 0.7f && chatActivityEnterView2.f31085k4 - chatActivityEnterView2.f31090l4 >= org.telegram.messenger.g0.L(57.0f)) {
                                chatActivityEnterView2.f31132s4 = true;
                                ag agVar = chatActivityEnterView2.O1;
                                if (agVar != null && org.telegram.messenger.qp.e1().getInt("voicepausehint", 0) <= 3) {
                                    agVar.a();
                                    fi.m3 m3Var = new fi.m3(agVar.getContext(), 2);
                                    agVar.f31790a = m3Var;
                                    m3Var.o(1.0f, 0.0f);
                                    agVar.f31790a.r(true);
                                    agVar.f31790a.u(org.telegram.messenger.id.M0(2131743512, null));
                                    agVar.f31793b0.setHintGlass(agVar.f31790a);
                                    org.telegram.messenger.qp.e1().edit().putInt("voicepausehint", org.telegram.messenger.qp.e1().getInt("voicepausehint", 0) + 1).apply();
                                    agVar.addView(agVar.f31790a, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    fi.m3 m3Var2 = agVar.f31790a;
                                    m3Var2.f12437q0 = new yf(agVar, m3Var2, 3);
                                    m3Var2.w();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f11 = x10 - recordCircle2.F;
                                float f12 = y10 - recordCircle2.G;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.G = y10;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f31049e4 && chatActivityEnterView3.f31062g4 == 0.0f && f13 > recordCircle2.E) {
                                    chatActivityEnterView3.f31056f4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f31092m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                                        chatActivityEnterView.E2 = org.telegram.messenger.g0.L(140.0f);
                                    }
                                }
                                float x11 = deVar.getX() + x10;
                                float f14 = chatActivityEnterView.D2;
                                float f15 = ((x11 - f14) / chatActivityEnterView.E2) + 1.0f;
                                if (f14 != -1.0f) {
                                    if (f15 <= 1.0f) {
                                        if (f15 < 0.0f) {
                                            f10 = 0.0f;
                                        } else {
                                            f10 = f15;
                                        }
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f31082k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f31188r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.f31047e2 && chatActivityEnterView.f31034c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(jeVar);
                                        wf wfVar2 = chatActivityEnterView.Z2;
                                        if (chatActivityEnterView.O) {
                                            i12 = Integer.MAX_VALUE;
                                        } else {
                                            i12 = 0;
                                        }
                                        wfVar2.Z1(2, 0, i12, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        geVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.R0(0);
                                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                                    }
                                    chatActivityEnterView.F2 = false;
                                    chatActivityEnterView.N1(5, true);
                                    return true;
                                }
                            }
                        }
                        chatActivityEnterView.z1();
                        return false;
                    }
                }
                return true;
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.f31079j4 < 0.7f) {
                    if (chatActivityEnterView.f31047e2 && chatActivityEnterView.f31034c1) {
                        CameraController.getInstance().cancelOnInitRunnable(jeVar);
                        wf wfVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i11 = Integer.MAX_VALUE;
                        } else {
                            i11 = 0;
                        }
                        wfVar3.Z1(2, 0, i11, chatActivityEnterView.S4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.S4 = 0L;
                        geVar.setEffect(0L);
                    } else {
                        j12 = 0;
                        chatActivityEnterView.Z2.R0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                    }
                    chatActivityEnterView.f31071i1 = j12;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.N1(5, true);
                    return false;
                }
                chatActivityEnterView.f31132s4 = true;
                chatActivityEnterView.z1();
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f31132s4) || ((udVar = chatActivityEnterView.f31046e1) != null && udVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.I3) {
                        org.telegram.messenger.g0.r(rfVar);
                    }
                } else if ((((deVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f31047e2 && chatActivityEnterView.f31034c1) {
                        CameraController.getInstance().cancelOnInitRunnable(jeVar);
                        wf wfVar4 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        wfVar4.Z1(2, 0, i10, chatActivityEnterView.S4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.S4 = 0L;
                        geVar.setEffect(0L);
                    } else {
                        j11 = 0;
                        chatActivityEnterView.Z2.R0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                    }
                    chatActivityEnterView.f31071i1 = j11;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.N1(5, true);
                    return true;
                } else if (chatActivityEnterView.I3) {
                    org.telegram.messenger.g0.r(rfVar);
                    if (chatActivityEnterView.f31161y0 && chatActivityEnterView.f31155x0) {
                        chatActivityEnterView.Z2.Y(!chatActivityEnterView.f31034c1);
                        chatActivityEnterView.k1(!chatActivityEnterView.f31034c1, true);
                    } else {
                        chatActivityEnterView.Z2.X1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z11 = chatActivityEnterView.f31047e2;
                    if (!z11 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z11 && chatActivityEnterView.f31034c1) {
                            if (v4.a0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f31082k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.c1();
                                v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.c20(this) {
                                    public final de f32237b;

                                    {
                                        this.f32237b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 1:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 2:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            default:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(jeVar);
                            wf wfVar5 = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i7 = Integer.MAX_VALUE;
                            } else {
                                i7 = 0;
                            }
                            wfVar5.Z1(1, 0, i7, chatActivityEnterView.S4, 0L, true);
                            j3 = 0;
                            chatActivityEnterView.S4 = 0L;
                            geVar.setEffect(0L);
                        } else {
                            j3 = 0;
                            if (!chatActivityEnterView.f31161y0) {
                                chatActivityEnterView.Z2.X1();
                            } else if (v4.a0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f31132s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.R0(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f31082k1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.c20(this) {
                                    public final de f32237b;

                                    {
                                        this.f32237b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 1:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 2:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            default:
                                                this.f32237b.d.T0(true, 0, 0, l10.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.O2;
                                    long a11 = cnVar.a();
                                    k2 k2Var2 = new k2(12);
                                    org.telegram.messenger.rc rcVar2 = new org.telegram.messenger.rc(25);
                                    org.telegram.ui.ActionBar.g6 g6Var2 = this.f32939c;
                                    v4.H(activity2, a11, -1L, 0, false, k2Var2, rcVar2, new s4(g6Var2), g6Var2);
                                }
                                chatActivityEnterView.Z2.R0(0);
                                MediaController B2 = MediaController.B();
                                if (!chatActivityEnterView.c()) {
                                    i14 = 1;
                                }
                                B2.B0(i14, 0, true, chatActivityEnterView.O);
                            }
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f31058g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final de f32648b;

                            {
                                this.f32648b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f32648b.d;
                                        chatActivityEnterView22.f31052f0 = null;
                                        chatActivityEnterView22.N1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f32648b.d;
                                        chatActivityEnterView32.f31052f0 = null;
                                        chatActivityEnterView32.N1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f31052f0 = runnable2;
                        if (chatActivityEnterView.f31165y4) {
                            j10 = 500;
                        } else {
                            j10 = j3;
                        }
                        org.telegram.messenger.g0.i3(runnable2, j10);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
