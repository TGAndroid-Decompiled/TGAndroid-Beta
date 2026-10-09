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
public final class xe extends FrameLayout {
    public final Paint f32814a;
    public final RectF f32815b;
    public final org.telegram.ui.ActionBar.e6 f32816c;
    public final ChatActivityEnterView d;

    public xe(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f32816c = e6Var;
        this.f32814a = new Paint(1);
        this.f32815b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f23853a1) {
            ef efVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (efVar != null && efVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int g02 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.Yd);
            Paint paint = this.f32814a;
            paint.setColor(g02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f32815b;
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
        if (this.d.f23923l5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ne neVar;
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
        xe xeVar = chatActivityEnterView.Z0;
        org.telegram.ui.zn znVar = chatActivityEnterView.P2;
        df dfVar = chatActivityEnterView.H3;
        lg lgVar = chatActivityEnterView.K3;
        af afVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f23923l5) {
            chatActivityEnterView.W();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f23961s4) {
                    boolean z10 = chatActivityEnterView.f23880e2;
                    if (!z10 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z10 && chatActivityEnterView.f23866c1) {
                            if (g5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23915k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.t1();
                                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final xe f31763b;

                                    {
                                        this.f31763b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            qg qgVar = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            qgVar.q2(1, 0, i16, chatActivityEnterView.S4, 0L, true);
                            chatActivityEnterView.S4 = 0L;
                            afVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.O2;
                                long a2 = znVar.a();
                                f2 f2Var = new f2(15);
                                ai.f fVar = new ai.f(28);
                                Pattern pattern = g5.f26593a;
                                org.telegram.ui.ActionBar.e6 e6Var = this.f32816c;
                                g5.J(activity, a2, -1L, 0, false, f2Var, fVar, new e5(e6Var), e6Var);
                            }
                            if (g5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f23866c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f23915k1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Z2.t1();
                                } else {
                                    if (chatActivityEnterView.f23961s4) {
                                        chatActivityEnterView.J3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Z2.g1(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f23915k1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final xe f31763b;

                                    {
                                        this.f31763b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
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
                            chatActivityEnterView.Z2.g1(0);
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f23891g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final xe f32604b;

                            {
                                this.f32604b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f32604b.d;
                                        chatActivityEnterView2.f23885f0 = null;
                                        chatActivityEnterView2.J1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f32604b.d;
                                        chatActivityEnterView3.f23885f0 = null;
                                        chatActivityEnterView3.J1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f23885f0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (znVar == null) {
                    chat = null;
                } else {
                    chat = znVar.f44753e;
                }
                if (znVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = znVar.f44708a8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f23880e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Z2.o2();
                    return true;
                } else if (chatActivityEnterView.f23880e2) {
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    AndroidUtilities.runOnUIThread(lgVar, 150L);
                    return true;
                } else {
                    lgVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.F2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f23961s4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.l4 == -1.0f) {
                                chatActivityEnterView2.f23918k4 = y3;
                            }
                            chatActivityEnterView2.l4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f23955r4 && chatActivityEnterView2.f23912j4 >= 0.7f && chatActivityEnterView2.f23918k4 - chatActivityEnterView2.l4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f23961s4 = true;
                                ug ugVar = chatActivityEnterView2.O1;
                                if (ugVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    ugVar.a();
                                    ci.d4 d4Var = new ci.d4(ugVar.getContext(), 2);
                                    ugVar.f31485a = d4Var;
                                    d4Var.l(1.0f, 0.0f);
                                    ugVar.f31485a.p(true);
                                    ugVar.f31485a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    ugVar.addView(ugVar.f31485a, w7.x5.a(-1.0f, 0.0f, 0.0f, 54.0f, 58.0f, -1, 119));
                                    ci.d4 d4Var2 = ugVar.f31485a;
                                    d4Var2.f4918l0 = new sg(ugVar, d4Var2, 3);
                                    d4Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f11 = x10 - recordCircle2.F;
                                float f12 = y3 - recordCircle2.G;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f23882e4 && chatActivityEnterView3.f23895g4 == 0.0f && f13 > recordCircle2.E) {
                                    f7 = 1.0f;
                                    chatActivityEnterView3.f23889f4 = System.currentTimeMillis();
                                } else {
                                    f7 = 1.0f;
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f23924m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.E2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = xeVar.getX() + x10;
                                float f14 = chatActivityEnterView.D2;
                                float f15 = ((x11 - f14) / chatActivityEnterView.E2) + f7;
                                if (f14 != -1.0f) {
                                    if (f15 > f7) {
                                        f10 = f7;
                                    } else if (f15 < 0.0f) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = f15;
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f23915k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f24016r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.f23880e2 && chatActivityEnterView.f23866c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(dfVar);
                                        qg qgVar2 = chatActivityEnterView.Z2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        qgVar2.q2(2, 0, i14, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        afVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.g1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                                    }
                                    chatActivityEnterView.F2 = false;
                                    chatActivityEnterView.J1(5, true);
                                    return true;
                                }
                            }
                        }
                        ChatActivityEnterView.k(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.f23912j4 < 0.7f) {
                    if (chatActivityEnterView.f23880e2 && chatActivityEnterView.f23866c1) {
                        CameraController.getInstance().cancelOnInitRunnable(dfVar);
                        qg qgVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        qgVar3.q2(2, 0, i13, chatActivityEnterView.S4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.S4 = 0L;
                        afVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.g1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f23904i1 = j12;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.J1(5, true);
                    return false;
                }
                chatActivityEnterView.f23961s4 = true;
                ChatActivityEnterView.k(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f23961s4) || ((neVar = chatActivityEnterView.f23879e1) != null && neVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.I3) {
                        AndroidUtilities.cancelRunOnUIThread(lgVar);
                    }
                } else if ((((xeVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f23880e2 && chatActivityEnterView.f23866c1) {
                        CameraController.getInstance().cancelOnInitRunnable(dfVar);
                        qg qgVar4 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        qgVar4.q2(2, 0, i12, chatActivityEnterView.S4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.S4 = 0L;
                        afVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.g1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.f23904i1 = j11;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.J1(5, true);
                    return true;
                } else if (chatActivityEnterView.I3) {
                    AndroidUtilities.cancelRunOnUIThread(lgVar);
                    if (chatActivityEnterView.f23990y0 && chatActivityEnterView.f23984x0) {
                        chatActivityEnterView.Z2.c0(!chatActivityEnterView.f23866c1);
                        chatActivityEnterView.i1(!chatActivityEnterView.f23866c1, true);
                    } else {
                        chatActivityEnterView.Z2.o2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f23880e2;
                    if (!z12 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z12 && chatActivityEnterView.f23866c1) {
                            if (g5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f23915k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.t1();
                                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final xe f31763b;

                                    {
                                        this.f31763b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(dfVar);
                            qg qgVar5 = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            qgVar5.q2(1, 0, i11, chatActivityEnterView.S4, 0L, true);
                            j3 = 0;
                            chatActivityEnterView.S4 = 0L;
                            afVar.setEffect(0L);
                        } else {
                            j3 = 0;
                            if (!chatActivityEnterView.f23990y0) {
                                chatActivityEnterView.Z2.o2();
                            } else if (g5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f23961s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.g1(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f23915k1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final xe f31763b;

                                    {
                                        this.f31763b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f31763b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.O2;
                                    long a10 = znVar.a();
                                    f2 f2Var2 = new f2(16);
                                    ai.f fVar2 = new ai.f(29);
                                    org.telegram.ui.ActionBar.e6 e6Var2 = this.f32816c;
                                    g5.J(activity2, a10, -1L, 0, false, f2Var2, fVar2, new e5(e6Var2), e6Var2);
                                }
                                chatActivityEnterView.Z2.g1(0);
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
                        chatActivityEnterView.f23891g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final xe f32604b;

                            {
                                this.f32604b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f32604b.d;
                                        chatActivityEnterView22.f23885f0 = null;
                                        chatActivityEnterView22.J1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f32604b.d;
                                        chatActivityEnterView32.f23885f0 = null;
                                        chatActivityEnterView32.J1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f23885f0 = runnable2;
                        if (chatActivityEnterView.f23993y4) {
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
