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
    public final Paint f27925a;
    public final RectF f27926b;
    public final org.telegram.ui.ActionBar.f6 f27927c;
    public final ChatActivityEnterView d;

    public ve(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f27927c = f6Var;
        this.f27925a = new Paint(1);
        this.f27926b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f20819a1) {
            cf cfVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (cfVar != null && cfVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Yd);
            Paint paint = this.f27925a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f27926b;
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
        if (this.d.f20884k5) {
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
        org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
        bf bfVar = chatActivityEnterView.G3;
        lg lgVar = chatActivityEnterView.J3;
        ye yeVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f20884k5) {
            chatActivityEnterView.Y();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f20919r4) {
                    boolean z10 = chatActivityEnterView.f20839d2;
                    if (!z10 || chatActivityEnterView.I3) {
                        chatActivityEnterView.C2 = -1.0f;
                        if (z10 && chatActivityEnterView.f20832c1) {
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f20875j1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Y2.m1();
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ve f27396b;

                                    {
                                        this.f27396b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            qg qgVar = chatActivityEnterView.Y2;
                            if (chatActivityEnterView.O) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            qgVar.i2(1, 0, i16, chatActivityEnterView.R4, 0L, true);
                            chatActivityEnterView.R4 = 0L;
                            yeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.N2;
                                long a2 = eoVar.a();
                                q2 q2Var = new q2(6);
                                bi.f0 f0Var = new bi.f0(23);
                                Pattern pattern = d5.f22289a;
                                org.telegram.ui.ActionBar.f6 f6Var = this.f27927c;
                                d5.K(activity, a2, -1L, 0, false, q2Var, f0Var, new b5(f6Var), f6Var);
                            }
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                if (chatActivityEnterView.f20832c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f20875j1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Y2.m1();
                                } else {
                                    if (chatActivityEnterView.f20919r4) {
                                        chatActivityEnterView.I3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Y2.a1(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f20875j1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ve f27396b;

                                    {
                                        this.f27396b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
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
                            chatActivityEnterView.Y2.a1(0);
                        }
                        chatActivityEnterView.E2 = false;
                        chatActivityEnterView.f20856g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final ve f27656b;

                            {
                                this.f27656b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f27656b.d;
                                        chatActivityEnterView2.f20850f0 = null;
                                        chatActivityEnterView2.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f27656b.d;
                                        chatActivityEnterView3.f20850f0 = null;
                                        chatActivityEnterView3.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f20850f0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (eoVar == null) {
                    chat = null;
                } else {
                    chat = eoVar.e;
                }
                if (eoVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = eoVar.f32262a8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f20839d2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Y2.g2();
                    return true;
                } else if (chatActivityEnterView.f20839d2) {
                    chatActivityEnterView.I3 = false;
                    chatActivityEnterView.H3 = true;
                    AndroidUtilities.runOnUIThread(lgVar, 150L);
                    return true;
                } else {
                    lgVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.E2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f20919r4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.f20883k4 == -1.0f) {
                                chatActivityEnterView2.f20877j4 = y3;
                            }
                            chatActivityEnterView2.f20883k4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f20913q4 && chatActivityEnterView2.f20872i4 >= 0.7f && chatActivityEnterView2.f20877j4 - chatActivityEnterView2.f20883k4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f20919r4 = true;
                                ug ugVar = chatActivityEnterView2.N1;
                                if (ugVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    ugVar.a();
                                    bi.x4 x4Var = new bi.x4(ugVar.getContext(), 2);
                                    ugVar.f27662a = x4Var;
                                    x4Var.l(1.0f, 0.0f);
                                    ugVar.f27662a.p(true);
                                    ugVar.f27662a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    ugVar.addView(ugVar.f27662a, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    bi.x4 x4Var2 = ugVar.f27662a;
                                    x4Var2.f3890l0 = new sg(ugVar, x4Var2, 3);
                                    x4Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.M1;
                                float f11 = x10 - recordCircle2.F;
                                float f12 = y3 - recordCircle2.G;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f20841d4 && chatActivityEnterView3.f20854f4 == 0.0f && f13 > recordCircle2.E) {
                                    f7 = 1.0f;
                                    chatActivityEnterView3.f20847e4 = System.currentTimeMillis();
                                } else {
                                    f7 = 1.0f;
                                }
                                if (chatActivityEnterView.C2 == -1.0f) {
                                    chatActivityEnterView.C2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.l1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.D2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.D2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = veVar.getX() + x10;
                                float f14 = chatActivityEnterView.C2;
                                float f15 = ((x11 - f14) / chatActivityEnterView.D2) + f7;
                                if (f14 != -1.0f) {
                                    if (f15 > f7) {
                                        f10 = 1.0f;
                                    } else if (f15 < 0.0f) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = f15;
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f20875j1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f20978r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.f20839d2 && chatActivityEnterView.f20832c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                                        qg qgVar2 = chatActivityEnterView.Y2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        qgVar2.i2(2, 0, i14, chatActivityEnterView.R4, 0L, true);
                                        chatActivityEnterView.R4 = 0L;
                                        yeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Y2.a1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                                    }
                                    chatActivityEnterView.E2 = false;
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
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.E2) {
                if (chatActivityEnterView.f20872i4 < 0.7f) {
                    if (chatActivityEnterView.f20839d2 && chatActivityEnterView.f20832c1) {
                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                        qg qgVar3 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        qgVar3.i2(2, 0, i13, chatActivityEnterView.R4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.R4 = 0L;
                        yeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f20869i1 = j12;
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.L1(5, true);
                    return false;
                }
                chatActivityEnterView.f20919r4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.M1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f20919r4) || ((leVar = chatActivityEnterView.f20844e1) != null && leVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.H3) {
                        AndroidUtilities.cancelRunOnUIThread(lgVar);
                    }
                } else if ((((veVar.getX() + motionEvent.getX()) - chatActivityEnterView.C2) / chatActivityEnterView.D2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f20839d2 && chatActivityEnterView.f20832c1) {
                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                        qg qgVar4 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        qgVar4.i2(2, 0, i12, chatActivityEnterView.R4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.R4 = 0L;
                        yeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.f20869i1 = j11;
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                } else if (chatActivityEnterView.H3) {
                    AndroidUtilities.cancelRunOnUIThread(lgVar);
                    if (chatActivityEnterView.f20954y0 && chatActivityEnterView.f20948x0) {
                        chatActivityEnterView.Y2.Z(!chatActivityEnterView.f20832c1);
                        chatActivityEnterView.k1(!chatActivityEnterView.f20832c1, true);
                    } else {
                        chatActivityEnterView.Y2.g2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f20839d2;
                    if (!z12 || chatActivityEnterView.I3) {
                        chatActivityEnterView.C2 = -1.0f;
                        if (z12 && chatActivityEnterView.f20832c1) {
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f20875j1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Y2.m1();
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ve f27396b;

                                    {
                                        this.f27396b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(bfVar);
                            qg qgVar5 = chatActivityEnterView.Y2;
                            if (chatActivityEnterView.O) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            qgVar5.i2(1, 0, i11, chatActivityEnterView.R4, 0L, true);
                            j3 = 0;
                            chatActivityEnterView.R4 = 0L;
                            yeVar.setEffect(0L);
                        } else {
                            j3 = 0;
                            if (!chatActivityEnterView.f20954y0) {
                                chatActivityEnterView.Y2.g2();
                            } else if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                if (chatActivityEnterView.f20919r4) {
                                    chatActivityEnterView.I3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Y2.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f20875j1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ve f27396b;

                                    {
                                        this.f27396b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f27396b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.N2;
                                    long a10 = eoVar.a();
                                    q2 q2Var2 = new q2(7);
                                    bi.f0 f0Var2 = new bi.f0(24);
                                    org.telegram.ui.ActionBar.f6 f6Var2 = this.f27927c;
                                    d5.K(activity2, a10, -1L, 0, false, q2Var2, f0Var2, new b5(f6Var2), f6Var2);
                                }
                                chatActivityEnterView.Y2.a1(0);
                                MediaController mediaController2 = MediaController.getInstance();
                                if (chatActivityEnterView.c()) {
                                    i10 = 3;
                                } else {
                                    i10 = 1;
                                }
                                mediaController2.stopRecording(i10, true, 0, chatActivityEnterView.O, 0L);
                            }
                        }
                        chatActivityEnterView.E2 = false;
                        chatActivityEnterView.f20856g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final ve f27656b;

                            {
                                this.f27656b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f27656b.d;
                                        chatActivityEnterView22.f20850f0 = null;
                                        chatActivityEnterView22.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f27656b.d;
                                        chatActivityEnterView32.f20850f0 = null;
                                        chatActivityEnterView32.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f20850f0 = runnable2;
                        if (chatActivityEnterView.f20952x4) {
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
