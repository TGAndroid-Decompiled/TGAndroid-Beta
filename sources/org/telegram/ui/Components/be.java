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
public final class be extends FrameLayout {
    public final Paint f32162a;
    public final RectF f32163b;
    public final org.telegram.ui.ActionBar.e6 f32164c;
    public final ChatActivityEnterView d;

    public be(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f32164c = e6Var;
        this.f32162a = new Paint(1);
        this.f32163b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f31092b1) {
            ie ieVar = chatActivityEnterView.T0;
            float f10 = 1.0f;
            if (ieVar != null && ieVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = org.telegram.messenger.g0.N(19.0f);
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Me);
            Paint paint = this.f32162a;
            paint.setColor(f02);
            float N2 = org.telegram.messenger.g0.N(3.0f);
            float N3 = org.telegram.messenger.g0.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.f32163b;
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
        if (this.d.f31184q5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sd sdVar;
        long j10;
        long j11;
        int i3;
        long j12;
        int i10;
        long j13;
        int i11;
        int i12;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i13;
        ChatActivityEnterView chatActivityEnterView = this.d;
        be beVar = chatActivityEnterView.f31085a1;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        he heVar = chatActivityEnterView.I3;
        pf pfVar = chatActivityEnterView.L3;
        ee eeVar = chatActivityEnterView.K0;
        if (!chatActivityEnterView.f31184q5) {
            chatActivityEnterView.U();
            int i14 = 3;
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f31202t4) {
                    boolean z10 = chatActivityEnterView.f31119f2;
                    if (!z10 || chatActivityEnterView.K3) {
                        chatActivityEnterView.E2 = -1.0f;
                        if (z10 && chatActivityEnterView.f31104d1) {
                            if (t4.c0(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31152l1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.f31087a3.Z0();
                                t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new org.telegram.messenger.u10(this) {
                                    public final be f41028b;

                                    {
                                        this.f41028b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 1:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 2:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            default:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            uf ufVar = chatActivityEnterView.f31087a3;
                            if (chatActivityEnterView.P) {
                                i13 = Integer.MAX_VALUE;
                            } else {
                                i13 = 0;
                            }
                            ufVar.d2(1, 0, i13, chatActivityEnterView.T4, 0L, true);
                            chatActivityEnterView.T4 = 0L;
                            eeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.G2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.P2;
                                long a10 = wmVar.a();
                                a3 a3Var = new a3(8);
                                org.telegram.messenger.hc hcVar = new org.telegram.messenger.hc(26);
                                Pattern pattern = t4.f38241a;
                                org.telegram.ui.ActionBar.e6 e6Var = this.f32164c;
                                t4.J(activity, a10, -1L, 0, false, a3Var, hcVar, new q4(e6Var), e6Var);
                            }
                            if (t4.c0(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                                if (chatActivityEnterView.f31104d1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f31152l1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.f31087a3.Z0();
                                } else {
                                    if (chatActivityEnterView.f31202t4) {
                                        chatActivityEnterView.K3 = true;
                                    }
                                    MediaController.B().D0(chatActivityEnterView.P);
                                    chatActivityEnterView.f31087a3.M0(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f31152l1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new org.telegram.messenger.u10(this) {
                                    public final be f41028b;

                                    {
                                        this.f41028b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 1:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 2:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            default:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
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
                            B.B0(i14, 0, true, chatActivityEnterView.P);
                            chatActivityEnterView.f31087a3.M0(0);
                        }
                        chatActivityEnterView.G2 = false;
                        chatActivityEnterView.f31129h0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final be f31819b;

                            {
                                this.f31819b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f31819b.d;
                                        chatActivityEnterView2.f31123g0 = null;
                                        chatActivityEnterView2.M1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f31819b.d;
                                        chatActivityEnterView3.f31123g0 = null;
                                        chatActivityEnterView3.M1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f31123g0 = runnable;
                        org.telegram.messenger.g0.i3(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (wmVar == null) {
                    chat = null;
                } else {
                    chat = wmVar.f51292e;
                }
                if (wmVar == null) {
                    userFull = chatActivityEnterView.L;
                } else {
                    userFull = wmVar.f51466r8;
                }
                if ((chat != null && !org.telegram.messenger.t3.v(chat) && (!org.telegram.messenger.t3.s(chat) || !chatActivityEnterView.f31119f2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.f31087a3.b2();
                    return true;
                } else if (chatActivityEnterView.f31119f2) {
                    chatActivityEnterView.K3 = false;
                    chatActivityEnterView.J3 = true;
                    org.telegram.messenger.g0.i3(pfVar, 150L);
                    return true;
                } else {
                    pfVar.run();
                    return true;
                }
            }
            float f10 = 1.0f;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.G2) {
                    float x10 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.O1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f31202t4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.f31159m4 == -1.0f) {
                                chatActivityEnterView2.f31155l4 = y9;
                            }
                            chatActivityEnterView2.f31159m4 = y9;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f31196s4 && chatActivityEnterView2.f31149k4 >= 0.7f && chatActivityEnterView2.f31155l4 - chatActivityEnterView2.f31159m4 >= org.telegram.messenger.g0.L(57.0f)) {
                                chatActivityEnterView2.f31202t4 = true;
                                yf yfVar = chatActivityEnterView2.P1;
                                if (yfVar != null && org.telegram.messenger.hp.e1().getInt("voicepausehint", 0) <= 3) {
                                    yfVar.a();
                                    gi.l3 l3Var = new gi.l3(yfVar.getContext(), 2);
                                    yfVar.f40693a = l3Var;
                                    l3Var.o(1.0f, 0.0f);
                                    yfVar.f40693a.r(true);
                                    yfVar.f40693a.u(org.telegram.messenger.bd.M0(2131743522, null));
                                    yfVar.f40698c0.setHintGlass(yfVar.f40693a);
                                    org.telegram.messenger.hp.e1().edit().putInt("voicepausehint", org.telegram.messenger.hp.e1().getInt("voicepausehint", 0) + 1).apply();
                                    yfVar.addView(yfVar.f40693a, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    gi.l3 l3Var2 = yfVar.f40693a;
                                    l3Var2.f13100r0 = new wf(yfVar, l3Var2, 3);
                                    l3Var2.w();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.O1;
                                float f11 = x10 - recordCircle2.G;
                                float f12 = y9 - recordCircle2.H;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.H = y9;
                                recordCircle2.G = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f31121f4 && chatActivityEnterView3.f31133h4 == 0.0f && f13 > recordCircle2.F) {
                                    chatActivityEnterView3.f31127g4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.E2 == -1.0f) {
                                    chatActivityEnterView.E2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f31163n1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.F2 = measuredWidth;
                                    if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                                        chatActivityEnterView.F2 = org.telegram.messenger.g0.L(140.0f);
                                    }
                                }
                                float x11 = beVar.getX() + x10;
                                float f14 = chatActivityEnterView.E2;
                                float f15 = ((x11 - f14) / chatActivityEnterView.F2) + 1.0f;
                                if (f14 != -1.0f) {
                                    if (f15 <= 1.0f) {
                                        if (f15 < 0.0f) {
                                            f10 = 0.0f;
                                        } else {
                                            f10 = f15;
                                        }
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f31152l1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f31253r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.f31119f2 && chatActivityEnterView.f31104d1) {
                                        CameraController.getInstance().cancelOnInitRunnable(heVar);
                                        uf ufVar2 = chatActivityEnterView.f31087a3;
                                        if (chatActivityEnterView.P) {
                                            i12 = Integer.MAX_VALUE;
                                        } else {
                                            i12 = 0;
                                        }
                                        ufVar2.d2(2, 0, i12, chatActivityEnterView.T4, 0L, true);
                                        chatActivityEnterView.T4 = 0L;
                                        eeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.f31087a3.M0(0);
                                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                                    }
                                    chatActivityEnterView.G2 = false;
                                    chatActivityEnterView.M1(5, true);
                                    return true;
                                }
                            }
                        }
                        chatActivityEnterView.y1();
                        return false;
                    }
                }
                return true;
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.G2) {
                if (chatActivityEnterView.f31149k4 < 0.7f) {
                    if (chatActivityEnterView.f31119f2 && chatActivityEnterView.f31104d1) {
                        CameraController.getInstance().cancelOnInitRunnable(heVar);
                        uf ufVar3 = chatActivityEnterView.f31087a3;
                        if (chatActivityEnterView.P) {
                            i11 = Integer.MAX_VALUE;
                        } else {
                            i11 = 0;
                        }
                        ufVar3.d2(2, 0, i11, chatActivityEnterView.T4, 0L, true);
                        j13 = 0;
                        chatActivityEnterView.T4 = 0L;
                        eeVar.setEffect(0L);
                    } else {
                        j13 = 0;
                        chatActivityEnterView.f31087a3.M0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.f31141j1 = j13;
                    chatActivityEnterView.G2 = false;
                    chatActivityEnterView.M1(5, true);
                    return false;
                }
                chatActivityEnterView.f31202t4 = true;
                chatActivityEnterView.y1();
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.O1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f31202t4) || ((sdVar = chatActivityEnterView.f31118f1) != null && sdVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.J3) {
                        org.telegram.messenger.g0.r(pfVar);
                    }
                } else if ((((beVar.getX() + motionEvent.getX()) - chatActivityEnterView.E2) / chatActivityEnterView.F2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f31119f2 && chatActivityEnterView.f31104d1) {
                        CameraController.getInstance().cancelOnInitRunnable(heVar);
                        uf ufVar4 = chatActivityEnterView.f31087a3;
                        if (chatActivityEnterView.P) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ufVar4.d2(2, 0, i10, chatActivityEnterView.T4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.T4 = 0L;
                        eeVar.setEffect(0L);
                    } else {
                        j12 = 0;
                        chatActivityEnterView.f31087a3.M0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.f31141j1 = j12;
                    chatActivityEnterView.G2 = false;
                    chatActivityEnterView.M1(5, true);
                    return true;
                } else if (chatActivityEnterView.J3) {
                    org.telegram.messenger.g0.r(pfVar);
                    if (chatActivityEnterView.f31231z0 && chatActivityEnterView.f31226y0) {
                        chatActivityEnterView.f31087a3.c0(!chatActivityEnterView.f31104d1);
                        chatActivityEnterView.j1(!chatActivityEnterView.f31104d1, true);
                    } else {
                        chatActivityEnterView.f31087a3.b2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f31119f2;
                    if (!z12 || chatActivityEnterView.K3) {
                        chatActivityEnterView.E2 = -1.0f;
                        if (z12 && chatActivityEnterView.f31104d1) {
                            if (t4.c0(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f31152l1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.f31087a3.Z0();
                                t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new org.telegram.messenger.u10(this) {
                                    public final be f41028b;

                                    {
                                        this.f41028b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 1:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 2:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            default:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(heVar);
                            uf ufVar5 = chatActivityEnterView.f31087a3;
                            if (chatActivityEnterView.P) {
                                i3 = Integer.MAX_VALUE;
                            } else {
                                i3 = 0;
                            }
                            ufVar5.d2(1, 0, i3, chatActivityEnterView.T4, 0L, true);
                            j10 = 0;
                            chatActivityEnterView.T4 = 0L;
                            eeVar.setEffect(0L);
                        } else {
                            j10 = 0;
                            if (!chatActivityEnterView.f31231z0) {
                                chatActivityEnterView.f31087a3.b2();
                            } else if (t4.c0(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                                if (chatActivityEnterView.f31202t4) {
                                    chatActivityEnterView.K3 = true;
                                }
                                MediaController.B().D0(chatActivityEnterView.P);
                                chatActivityEnterView.f31087a3.M0(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f31152l1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new org.telegram.messenger.u10(this) {
                                    public final be f41028b;

                                    {
                                        this.f41028b = this;
                                    }

                                    @Override
                                    public final void a(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 1:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            case 2:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                            default:
                                                this.f41028b.d.S0(true, 0, 0, l10.longValue(), false);
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.G2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.P2;
                                    long a11 = wmVar.a();
                                    a3 a3Var2 = new a3(9);
                                    org.telegram.messenger.hc hcVar2 = new org.telegram.messenger.hc(27);
                                    org.telegram.ui.ActionBar.e6 e6Var2 = this.f32164c;
                                    t4.J(activity2, a11, -1L, 0, false, a3Var2, hcVar2, new q4(e6Var2), e6Var2);
                                }
                                chatActivityEnterView.f31087a3.M0(0);
                                MediaController B2 = MediaController.B();
                                if (!chatActivityEnterView.c()) {
                                    i14 = 1;
                                }
                                B2.B0(i14, 0, true, chatActivityEnterView.P);
                            }
                        }
                        chatActivityEnterView.G2 = false;
                        chatActivityEnterView.f31129h0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final be f31819b;

                            {
                                this.f31819b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f31819b.d;
                                        chatActivityEnterView22.f31123g0 = null;
                                        chatActivityEnterView22.M1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f31819b.d;
                                        chatActivityEnterView32.f31123g0 = null;
                                        chatActivityEnterView32.M1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f31123g0 = runnable2;
                        if (chatActivityEnterView.f31235z4) {
                            j11 = 500;
                        } else {
                            j11 = j10;
                        }
                        org.telegram.messenger.g0.i3(runnable2, j11);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
