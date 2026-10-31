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
public final class yd extends FrameLayout {
    public final Paint f32695a;
    public final RectF f32696b;
    public final org.telegram.ui.ActionBar.p6 f32697c;
    public final ChatActivityEnterView d;

    public yd(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f32697c = p6Var;
        this.f32695a = new Paint(1);
        this.f32696b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f23675a1) {
            fe feVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (feVar != null && feVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float N = org.telegram.messenger.i0.N(19.0f);
            int e02 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Me);
            Paint paint = this.f32695a;
            paint.setColor(e02);
            float N2 = org.telegram.messenger.i0.N(3.0f);
            float N3 = org.telegram.messenger.i0.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.f32696b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, N, N, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d.p5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pd pdVar;
        long j10;
        long j11;
        int i10;
        long j12;
        int i11;
        long j13;
        int i12;
        int i13;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i14;
        ChatActivityEnterView chatActivityEnterView = this.d;
        yd ydVar = chatActivityEnterView.Z0;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        ee eeVar = chatActivityEnterView.H3;
        nf nfVar = chatActivityEnterView.K3;
        be beVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.p5) {
            chatActivityEnterView.U();
            int i15 = 3;
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f23787s4) {
                    boolean z10 = chatActivityEnterView.f23701e2;
                    if (!z10 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z10 && chatActivityEnterView.f23688c1) {
                            if (s4.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23737k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.X0();
                                s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.q20(this) {
                                    public final yd f32153b;

                                    {
                                        this.f32153b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            case 1:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            case 2:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            default:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            sf sfVar = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i14 = Integer.MAX_VALUE;
                            } else {
                                i14 = 0;
                            }
                            sfVar.V1(1, 0, i14, chatActivityEnterView.S4, 0L, true);
                            chatActivityEnterView.S4 = 0L;
                            beVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.O2;
                                long a2 = unVar.a();
                                v1 v1Var = new v1(25);
                                org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(13);
                                Pattern pattern = s4.f30123a;
                                org.telegram.ui.ActionBar.p6 p6Var = this.f32697c;
                                s4.J(activity, a2, -1L, 0, false, v1Var, rzVar, new p4(p6Var), p6Var);
                            }
                            if (s4.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f23688c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f23737k1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Z2.X0();
                                } else {
                                    if (chatActivityEnterView.f23787s4) {
                                        chatActivityEnterView.J3 = true;
                                    }
                                    MediaController.B().D0(chatActivityEnterView.O);
                                    chatActivityEnterView.Z2.G0(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f23737k1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.q20(this) {
                                    public final yd f32153b;

                                    {
                                        this.f32153b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            case 1:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            case 2:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            default:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            MediaController B = MediaController.B();
                            if (!chatActivityEnterView.c()) {
                                i15 = 1;
                            }
                            B.B0(i15, 0, true, chatActivityEnterView.O);
                            chatActivityEnterView.Z2.G0(0);
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f23712g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final yd f32458b;

                            {
                                this.f32458b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f32458b.d;
                                        chatActivityEnterView2.f23706f0 = null;
                                        chatActivityEnterView2.K1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f32458b.d;
                                        chatActivityEnterView3.f23706f0 = null;
                                        chatActivityEnterView3.K1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f23706f0 = runnable;
                        org.telegram.messenger.i0.h3(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (unVar == null) {
                    chat = null;
                } else {
                    chat = unVar.e;
                }
                if (unVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = unVar.f42385q8;
                }
                if ((chat != null && !org.telegram.messenger.w3.v(chat) && (!org.telegram.messenger.w3.s(chat) || !chatActivityEnterView.f23701e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Z2.T1();
                    return true;
                } else if (chatActivityEnterView.f23701e2) {
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    org.telegram.messenger.i0.h3(nfVar, 150L);
                    return true;
                } else {
                    nfVar.run();
                    return true;
                }
            }
            float f7 = 1.0f;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.F2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f23787s4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.l4 == -1.0f) {
                                chatActivityEnterView2.f23740k4 = y3;
                            }
                            chatActivityEnterView2.l4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f23780r4 && chatActivityEnterView2.f23734j4 >= 0.7f && chatActivityEnterView2.f23740k4 - chatActivityEnterView2.l4 >= org.telegram.messenger.i0.L(57.0f)) {
                                chatActivityEnterView2.f23787s4 = true;
                                wf wfVar = chatActivityEnterView2.O1;
                                if (wfVar != null && org.telegram.messenger.vp.d1().getInt("voicepausehint", 0) <= 3) {
                                    wfVar.a();
                                    vh.p2 p2Var = new vh.p2(wfVar.getContext(), 2);
                                    wfVar.f32159a = p2Var;
                                    p2Var.l(1.0f, 0.0f);
                                    wfVar.f32159a.p(true);
                                    wfVar.f32159a.s(org.telegram.messenger.cd.L0(2131743538, null));
                                    org.telegram.messenger.vp.d1().edit().putInt("voicepausehint", org.telegram.messenger.vp.d1().getInt("voicepausehint", 0) + 1).apply();
                                    wfVar.addView(wfVar.f32159a, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    vh.p2 p2Var2 = wfVar.f32159a;
                                    p2Var2.f51740l0 = new uf(wfVar, p2Var2, 3);
                                    p2Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f10 = x10 - recordCircle2.F;
                                float f11 = y3 - recordCircle2.G;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f23703e4 && chatActivityEnterView3.f23716g4 == 0.0f && f12 > recordCircle2.E) {
                                    chatActivityEnterView3.f23710f4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f23746m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > org.telegram.messenger.i0.L(140.0f)) {
                                        chatActivityEnterView.E2 = org.telegram.messenger.i0.L(140.0f);
                                    }
                                }
                                float x11 = ydVar.getX() + x10;
                                float f13 = chatActivityEnterView.D2;
                                float f14 = ((x11 - f13) / chatActivityEnterView.E2) + 1.0f;
                                if (f13 != -1.0f) {
                                    if (f14 <= 1.0f) {
                                        if (f14 < 0.0f) {
                                            f7 = 0.0f;
                                        } else {
                                            f7 = f14;
                                        }
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f23737k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f23840r = f7;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f7);
                                    f14 = f7;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.f23701e2 && chatActivityEnterView.f23688c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(eeVar);
                                        sf sfVar2 = chatActivityEnterView.Z2;
                                        if (chatActivityEnterView.O) {
                                            i13 = Integer.MAX_VALUE;
                                        } else {
                                            i13 = 0;
                                        }
                                        sfVar2.V1(2, 0, i13, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        beVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.G0(0);
                                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                                    }
                                    chatActivityEnterView.F2 = false;
                                    chatActivityEnterView.K1(5, true);
                                    return true;
                                }
                            }
                        }
                        chatActivityEnterView.w1();
                        return false;
                    }
                }
                return true;
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.f23734j4 < 0.7f) {
                    if (chatActivityEnterView.f23701e2 && chatActivityEnterView.f23688c1) {
                        CameraController.getInstance().cancelOnInitRunnable(eeVar);
                        sf sfVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        sfVar3.V1(2, 0, i12, chatActivityEnterView.S4, 0L, true);
                        j13 = 0;
                        chatActivityEnterView.S4 = 0L;
                        beVar.setEffect(0L);
                    } else {
                        j13 = 0;
                        chatActivityEnterView.Z2.G0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                    }
                    chatActivityEnterView.f23725i1 = j13;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.K1(5, true);
                    return false;
                }
                chatActivityEnterView.f23787s4 = true;
                chatActivityEnterView.w1();
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f23787s4) || ((pdVar = chatActivityEnterView.f23700e1) != null && pdVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.I3) {
                        org.telegram.messenger.i0.r(nfVar);
                    }
                } else if ((((ydVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f23701e2 && chatActivityEnterView.f23688c1) {
                        CameraController.getInstance().cancelOnInitRunnable(eeVar);
                        sf sfVar4 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i11 = Integer.MAX_VALUE;
                        } else {
                            i11 = 0;
                        }
                        sfVar4.V1(2, 0, i11, chatActivityEnterView.S4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.S4 = 0L;
                        beVar.setEffect(0L);
                    } else {
                        j12 = 0;
                        chatActivityEnterView.Z2.G0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                    }
                    chatActivityEnterView.f23725i1 = j12;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.K1(5, true);
                    return true;
                } else if (chatActivityEnterView.I3) {
                    org.telegram.messenger.i0.r(nfVar);
                    if (chatActivityEnterView.f23816y0 && chatActivityEnterView.f23810x0) {
                        chatActivityEnterView.Z2.V(!chatActivityEnterView.f23688c1);
                        chatActivityEnterView.i1(!chatActivityEnterView.f23688c1, true);
                    } else {
                        chatActivityEnterView.Z2.T1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f23701e2;
                    if (!z12 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z12 && chatActivityEnterView.f23688c1) {
                            if (s4.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f23737k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.X0();
                                s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.q20(this) {
                                    public final yd f32153b;

                                    {
                                        this.f32153b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            case 1:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            case 2:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            default:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(eeVar);
                            sf sfVar5 = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i10 = Integer.MAX_VALUE;
                            } else {
                                i10 = 0;
                            }
                            sfVar5.V1(1, 0, i10, chatActivityEnterView.S4, 0L, true);
                            j10 = 0;
                            chatActivityEnterView.S4 = 0L;
                            beVar.setEffect(0L);
                        } else {
                            j10 = 0;
                            if (!chatActivityEnterView.f23816y0) {
                                chatActivityEnterView.Z2.T1();
                            } else if (s4.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f23787s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.G0(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f23737k1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.q20(this) {
                                    public final yd f32153b;

                                    {
                                        this.f32153b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            case 1:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            case 2:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                            default:
                                                this.f32153b.d.R0(true, 0, 0, l4.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.O2;
                                    long a10 = unVar.a();
                                    v1 v1Var2 = new v1(26);
                                    org.telegram.messenger.rz rzVar2 = new org.telegram.messenger.rz(14);
                                    org.telegram.ui.ActionBar.p6 p6Var2 = this.f32697c;
                                    s4.J(activity2, a10, -1L, 0, false, v1Var2, rzVar2, new p4(p6Var2), p6Var2);
                                }
                                chatActivityEnterView.Z2.G0(0);
                                MediaController B2 = MediaController.B();
                                if (!chatActivityEnterView.c()) {
                                    i15 = 1;
                                }
                                B2.B0(i15, 0, true, chatActivityEnterView.O);
                            }
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f23712g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final yd f32458b;

                            {
                                this.f32458b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f32458b.d;
                                        chatActivityEnterView22.f23706f0 = null;
                                        chatActivityEnterView22.K1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f32458b.d;
                                        chatActivityEnterView32.f23706f0 = null;
                                        chatActivityEnterView32.K1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f23706f0 = runnable2;
                        if (chatActivityEnterView.f23819y4) {
                            j11 = 500;
                        } else {
                            j11 = j10;
                        }
                        org.telegram.messenger.i0.h3(runnable2, j11);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
