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
public final class ue extends FrameLayout {
    public final Paint f33378a;
    public final RectF f33379b;
    public final org.telegram.ui.ActionBar.u6 f33380c;
    public final ChatActivityEnterView d;

    public ue(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f33380c = u6Var;
        this.f33378a = new Paint(1);
        this.f33379b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f25844a1) {
            bf bfVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (bfVar != null && bfVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.Yd);
            Paint paint = this.f33378a;
            paint.setColor(f02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f33379b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d.f25938p5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ke keVar;
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
        ue ueVar = chatActivityEnterView.Z0;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        af afVar = chatActivityEnterView.H3;
        ig igVar = chatActivityEnterView.K3;
        xe xeVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f25938p5) {
            chatActivityEnterView.V();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f25955s4) {
                    boolean z10 = chatActivityEnterView.f25870e2;
                    if (!z10 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z10 && chatActivityEnterView.f25857c1) {
                            if (g5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f25906k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.X0();
                                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f32522b;

                                    {
                                        this.f32522b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            og ogVar = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            ogVar.P1(1, 0, i16, chatActivityEnterView.S4, 0L, true);
                            chatActivityEnterView.S4 = 0L;
                            xeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.O2;
                                long a2 = unVar.a();
                                f2 f2Var = new f2(20);
                                k5 k5Var = new k5(5);
                                Pattern pattern = g5.f28418a;
                                org.telegram.ui.ActionBar.u6 u6Var = this.f33380c;
                                g5.J(activity, a2, -1L, 0, false, f2Var, k5Var, new d5(u6Var), u6Var);
                            }
                            if (g5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f25857c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f25906k1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Z2.X0();
                                } else {
                                    if (chatActivityEnterView.f25955s4) {
                                        chatActivityEnterView.J3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Z2.M0(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f25906k1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f32522b;

                                    {
                                        this.f32522b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
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
                            mediaController.stopRecording(i15, true, 0, chatActivityEnterView.O, 0L);
                            chatActivityEnterView.Z2.M0(0);
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f25881g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final ue f32978b;

                            {
                                this.f32978b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f32978b.d;
                                        chatActivityEnterView2.f25875f0 = null;
                                        chatActivityEnterView2.I1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f32978b.d;
                                        chatActivityEnterView3.f25875f0 = null;
                                        chatActivityEnterView3.I1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f25875f0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
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
                    userFull = unVar.f44334m8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f25870e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Z2.N1();
                    return true;
                } else if (chatActivityEnterView.f25870e2) {
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    AndroidUtilities.runOnUIThread(igVar, 150L);
                    return true;
                } else {
                    igVar.run();
                    return true;
                }
            }
            float f7 = 1.0f;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.F2) {
                    float x9 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f25955s4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.l4 == -1.0f) {
                                chatActivityEnterView2.f25909k4 = y3;
                            }
                            chatActivityEnterView2.l4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f25949r4 && chatActivityEnterView2.f25903j4 >= 0.7f && chatActivityEnterView2.f25909k4 - chatActivityEnterView2.l4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f25955s4 = true;
                                sg sgVar = chatActivityEnterView2.O1;
                                if (sgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    sgVar.a();
                                    fi.v3 v3Var = new fi.v3(sgVar.getContext(), 2);
                                    sgVar.f32539a = v3Var;
                                    v3Var.l(1.0f, 0.0f);
                                    sgVar.f32539a.p(true);
                                    sgVar.f32539a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    sgVar.addView(sgVar.f32539a, gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    fi.v3 v3Var2 = sgVar.f32539a;
                                    v3Var2.f11798l0 = new qg(sgVar, v3Var2, 3);
                                    v3Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f10 = x9 - recordCircle2.F;
                                float f11 = y3 - recordCircle2.G;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.G = y3;
                                recordCircle2.F = x9;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f25872e4 && chatActivityEnterView3.f25885g4 == 0.0f && f12 > recordCircle2.E) {
                                    chatActivityEnterView3.f25879f4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x9;
                                    float measuredWidth = (float) (chatActivityEnterView.f25915m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.E2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x10 = ueVar.getX() + x9;
                                float f13 = chatActivityEnterView.D2;
                                float f14 = ((x10 - f13) / chatActivityEnterView.E2) + 1.0f;
                                if (f13 != -1.0f) {
                                    if (f14 <= 1.0f) {
                                        if (f14 < 0.0f) {
                                            f7 = 0.0f;
                                        } else {
                                            f7 = f14;
                                        }
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f25906k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f26008r = f7;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f7);
                                    f14 = f7;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.f25870e2 && chatActivityEnterView.f25857c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                                        og ogVar2 = chatActivityEnterView.Z2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        ogVar2.P1(2, 0, i14, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        xeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.M0(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                                    }
                                    chatActivityEnterView.F2 = false;
                                    chatActivityEnterView.I1(5, true);
                                    return true;
                                }
                            }
                        }
                        ChatActivityEnterView.j(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.f25903j4 < 0.7f) {
                    if (chatActivityEnterView.f25870e2 && chatActivityEnterView.f25857c1) {
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        og ogVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        ogVar3.P1(2, 0, i13, chatActivityEnterView.S4, 0L, true);
                        j13 = 0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.M0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j13 = 0;
                    }
                    chatActivityEnterView.f25894i1 = j13;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.I1(5, true);
                    return false;
                }
                chatActivityEnterView.f25955s4 = true;
                ChatActivityEnterView.j(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f25955s4) || ((keVar = chatActivityEnterView.f25869e1) != null && keVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.I3) {
                        AndroidUtilities.cancelRunOnUIThread(igVar);
                    }
                } else if ((((ueVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f25870e2 && chatActivityEnterView.f25857c1) {
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        og ogVar4 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        ogVar4.P1(2, 0, i12, chatActivityEnterView.S4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.M0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f25894i1 = j12;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.I1(5, true);
                    return true;
                } else if (chatActivityEnterView.I3) {
                    AndroidUtilities.cancelRunOnUIThread(igVar);
                    if (chatActivityEnterView.f25984y0 && chatActivityEnterView.f25978x0) {
                        chatActivityEnterView.Z2.R(!chatActivityEnterView.f25857c1);
                        chatActivityEnterView.h1(!chatActivityEnterView.f25857c1, true);
                    } else {
                        chatActivityEnterView.Z2.N1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f25870e2;
                    if (!z12 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z12 && chatActivityEnterView.f25857c1) {
                            if (g5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f25906k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.X0();
                                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f32522b;

                                    {
                                        this.f32522b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(afVar);
                            og ogVar5 = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            ogVar5.P1(1, 0, i11, chatActivityEnterView.S4, 0L, true);
                            j10 = 0;
                            chatActivityEnterView.S4 = 0L;
                            xeVar.setEffect(0L);
                        } else {
                            j10 = 0;
                            if (!chatActivityEnterView.f25984y0) {
                                chatActivityEnterView.Z2.N1();
                            } else if (g5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f25955s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.M0(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f25906k1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f32522b;

                                    {
                                        this.f32522b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f32522b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.O2;
                                    long a10 = unVar.a();
                                    f2 f2Var2 = new f2(21);
                                    k5 k5Var2 = new k5(6);
                                    org.telegram.ui.ActionBar.u6 u6Var2 = this.f33380c;
                                    g5.J(activity2, a10, -1L, 0, false, f2Var2, k5Var2, new d5(u6Var2), u6Var2);
                                }
                                chatActivityEnterView.Z2.M0(0);
                                MediaController mediaController2 = MediaController.getInstance();
                                if (chatActivityEnterView.c()) {
                                    i10 = 3;
                                } else {
                                    i10 = 1;
                                }
                                mediaController2.stopRecording(i10, true, 0, chatActivityEnterView.O, 0L);
                            }
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f25881g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final ue f32978b;

                            {
                                this.f32978b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f32978b.d;
                                        chatActivityEnterView22.f25875f0 = null;
                                        chatActivityEnterView22.I1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f32978b.d;
                                        chatActivityEnterView32.f25875f0 = null;
                                        chatActivityEnterView32.I1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f25875f0 = runnable2;
                        if (chatActivityEnterView.f25987y4) {
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
