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
public final class ve extends FrameLayout {
    public final Paint f29116a;
    public final RectF f29117b;
    public final org.telegram.ui.ActionBar.d6 f29118c;
    public final ChatActivityEnterView d;

    public ve(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f29118c = d6Var;
        this.f29116a = new Paint(1);
        this.f29117b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f21941a1) {
            cf cfVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (cfVar != null && cfVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.Yd);
            Paint paint = this.f29116a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f29117b;
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
        if (this.d.f22010l5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        le leVar;
        long j3;
        int i10;
        long j10;
        int i11;
        long j11;
        int i12;
        long j12;
        int i13;
        float f7;
        int i14;
        float f10;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i15;
        int i16;
        ChatActivityEnterView chatActivityEnterView = this.d;
        ve veVar = chatActivityEnterView.Z0;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        bf bfVar = chatActivityEnterView.H3;
        jg jgVar = chatActivityEnterView.K3;
        ye yeVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f22010l5) {
            chatActivityEnterView.Y();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f22048s4) {
                    boolean z10 = chatActivityEnterView.f21967e2;
                    if (!z10 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z10 && chatActivityEnterView.f21954c1) {
                            if (e5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22002k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.n1();
                                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ve f28472b;

                                    {
                                        this.f28472b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
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
                            ogVar.k2(1, 0, i16, chatActivityEnterView.S4, 0L, true);
                            chatActivityEnterView.S4 = 0L;
                            yeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.O2;
                                long a2 = wnVar.a();
                                x1 x1Var = new x1(23);
                                ai.f fVar = new ai.f(28);
                                Pattern pattern = e5.f23809a;
                                org.telegram.ui.ActionBar.d6 d6Var = this.f29118c;
                                e5.K(activity, a2, -1L, 0, false, x1Var, fVar, new c5(d6Var), d6Var);
                            }
                            if (e5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f21954c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f22002k1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Z2.n1();
                                } else {
                                    if (chatActivityEnterView.f22048s4) {
                                        chatActivityEnterView.J3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Z2.a1(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f22002k1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ve f28472b;

                                    {
                                        this.f28472b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
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
                            chatActivityEnterView.Z2.a1(0);
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f21978g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final ve f28763b;

                            {
                                this.f28763b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f28763b.d;
                                        chatActivityEnterView2.f21972f0 = null;
                                        chatActivityEnterView2.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f28763b.d;
                                        chatActivityEnterView3.f21972f0 = null;
                                        chatActivityEnterView3.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f21972f0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (wnVar == null) {
                    chat = null;
                } else {
                    chat = wnVar.e;
                }
                if (wnVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = wnVar.f39400a8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f21967e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Z2.i2();
                    return true;
                } else if (chatActivityEnterView.f21967e2) {
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    AndroidUtilities.runOnUIThread(jgVar, 150L);
                    return true;
                } else {
                    jgVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.F2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f22048s4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.l4 == -1.0f) {
                                chatActivityEnterView2.f22005k4 = y3;
                            }
                            chatActivityEnterView2.l4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f22042r4 && chatActivityEnterView2.f21999j4 >= 0.7f && chatActivityEnterView2.f22005k4 - chatActivityEnterView2.l4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f22048s4 = true;
                                sg sgVar = chatActivityEnterView2.O1;
                                if (sgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    sgVar.a();
                                    ci.e4 e4Var = new ci.e4(sgVar.getContext(), 2);
                                    sgVar.f28234a = e4Var;
                                    e4Var.l(1.0f, 0.0f);
                                    sgVar.f28234a.p(true);
                                    sgVar.f28234a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    sgVar.addView(sgVar.f28234a, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    ci.e4 e4Var2 = sgVar.f28234a;
                                    e4Var2.f4615l0 = new qg(sgVar, e4Var2, 3);
                                    e4Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f11 = x10 - recordCircle2.F;
                                float f12 = y3 - recordCircle2.G;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f21969e4 && chatActivityEnterView3.f21982g4 == 0.0f && f13 > recordCircle2.E) {
                                    f7 = 1.0f;
                                    chatActivityEnterView3.f21976f4 = System.currentTimeMillis();
                                } else {
                                    f7 = 1.0f;
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f22011m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.E2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = veVar.getX() + x10;
                                float f14 = chatActivityEnterView.D2;
                                float f15 = ((x11 - f14) / chatActivityEnterView.E2) + f7;
                                if (f14 != -1.0f) {
                                    if (f15 > f7) {
                                        f10 = 1.0f;
                                    } else if (f15 < 0.0f) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = f15;
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f22002k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f22101r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.f21967e2 && chatActivityEnterView.f21954c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                                        og ogVar2 = chatActivityEnterView.Z2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        ogVar2.k2(2, 0, i14, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        yeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.a1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                                    }
                                    chatActivityEnterView.F2 = false;
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
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.f21999j4 < 0.7f) {
                    if (chatActivityEnterView.f21967e2 && chatActivityEnterView.f21954c1) {
                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                        og ogVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        ogVar3.k2(2, 0, i13, chatActivityEnterView.S4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.S4 = 0L;
                        yeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f21991i1 = j12;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.L1(5, true);
                    return false;
                }
                chatActivityEnterView.f22048s4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f22048s4) || ((leVar = chatActivityEnterView.f21966e1) != null && leVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.I3) {
                        AndroidUtilities.cancelRunOnUIThread(jgVar);
                    }
                } else if ((((veVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f21967e2 && chatActivityEnterView.f21954c1) {
                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                        og ogVar4 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        ogVar4.k2(2, 0, i12, chatActivityEnterView.S4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.S4 = 0L;
                        yeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.f21991i1 = j11;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                } else if (chatActivityEnterView.I3) {
                    AndroidUtilities.cancelRunOnUIThread(jgVar);
                    if (chatActivityEnterView.f22077y0 && chatActivityEnterView.f22071x0) {
                        chatActivityEnterView.Z2.X(!chatActivityEnterView.f21954c1);
                        chatActivityEnterView.k1(!chatActivityEnterView.f21954c1, true);
                    } else {
                        chatActivityEnterView.Z2.i2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f21967e2;
                    if (!z12 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z12 && chatActivityEnterView.f21954c1) {
                            if (e5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f22002k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.n1();
                                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ve f28472b;

                                    {
                                        this.f28472b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(bfVar);
                            og ogVar5 = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            ogVar5.k2(1, 0, i11, chatActivityEnterView.S4, 0L, true);
                            j3 = 0;
                            chatActivityEnterView.S4 = 0L;
                            yeVar.setEffect(0L);
                        } else {
                            j3 = 0;
                            if (!chatActivityEnterView.f22077y0) {
                                chatActivityEnterView.Z2.i2();
                            } else if (e5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f22048s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f22002k1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ve f28472b;

                                    {
                                        this.f28472b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28472b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.O2;
                                    long a10 = wnVar.a();
                                    x1 x1Var2 = new x1(24);
                                    ai.f fVar2 = new ai.f(29);
                                    org.telegram.ui.ActionBar.d6 d6Var2 = this.f29118c;
                                    e5.K(activity2, a10, -1L, 0, false, x1Var2, fVar2, new c5(d6Var2), d6Var2);
                                }
                                chatActivityEnterView.Z2.a1(0);
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
                        chatActivityEnterView.f21978g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final ve f28763b;

                            {
                                this.f28763b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f28763b.d;
                                        chatActivityEnterView22.f21972f0 = null;
                                        chatActivityEnterView22.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f28763b.d;
                                        chatActivityEnterView32.f21972f0 = null;
                                        chatActivityEnterView32.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f21972f0 = runnable2;
                        if (chatActivityEnterView.f22080y4) {
                            j10 = 500;
                        } else {
                            j10 = j3;
                        }
                        AndroidUtilities.runOnUIThread(runnable2, j10);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
