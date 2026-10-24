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
public final class se extends FrameLayout {
    public final Paint f30482a;
    public final RectF f30483b;
    public final org.telegram.ui.ActionBar.g6 f30484c;
    public final ChatActivityEnterView d;

    public se(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f30484c = g6Var;
        this.f30482a = new Paint(1);
        this.f30483b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f24054a1) {
            ze zeVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (zeVar != null && zeVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Yd);
            Paint paint = this.f30482a;
            paint.setColor(f02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f30483b;
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
        if (this.d.p5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ie ieVar;
        long j10;
        int i10;
        long j11;
        int i11;
        long j12;
        int i12;
        long j13;
        int i13;
        float f7;
        int i14;
        float f10;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i15;
        int i16;
        ChatActivityEnterView chatActivityEnterView = this.d;
        se seVar = chatActivityEnterView.Z0;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        ye yeVar = chatActivityEnterView.H3;
        gg ggVar = chatActivityEnterView.K3;
        ve veVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.p5) {
            chatActivityEnterView.V();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f24165s4) {
                    boolean z10 = chatActivityEnterView.f24080e2;
                    if (!z10 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z10 && chatActivityEnterView.f24067c1) {
                            if (d5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f24116k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.i1();
                                d5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final se f29896b;

                                    {
                                        this.f29896b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            mg mgVar = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            mgVar.a2(1, 0, i16, chatActivityEnterView.S4, 0L, true);
                            chatActivityEnterView.S4 = 0L;
                            veVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.O2;
                                long a2 = snVar.a();
                                d2 d2Var = new d2(16);
                                pc pcVar = new pc(3);
                                Pattern pattern = d5.f25562a;
                                org.telegram.ui.ActionBar.g6 g6Var = this.f30484c;
                                d5.J(activity, a2, -1L, 0, false, d2Var, pcVar, new a5(g6Var), g6Var);
                            }
                            if (d5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f24067c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f24116k1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Z2.i1();
                                } else {
                                    if (chatActivityEnterView.f24165s4) {
                                        chatActivityEnterView.J3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Z2.X0(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f24116k1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                d5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final se f29896b;

                                    {
                                        this.f29896b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
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
                            chatActivityEnterView.Z2.X0(0);
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f24091g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final se f30119b;

                            {
                                this.f30119b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f30119b.d;
                                        chatActivityEnterView2.f24085f0 = null;
                                        chatActivityEnterView2.I1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f30119b.d;
                                        chatActivityEnterView3.f24085f0 = null;
                                        chatActivityEnterView3.I1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f24085f0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (snVar == null) {
                    chat = null;
                } else {
                    chat = snVar.e;
                }
                if (snVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = snVar.f41601m8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f24080e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Z2.Y1();
                    return true;
                } else if (chatActivityEnterView.f24080e2) {
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    AndroidUtilities.runOnUIThread(ggVar, 150L);
                    return true;
                } else {
                    ggVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.F2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f24165s4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.l4 == -1.0f) {
                                chatActivityEnterView2.f24119k4 = y3;
                            }
                            chatActivityEnterView2.l4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f24159r4 && chatActivityEnterView2.f24113j4 >= 0.7f && chatActivityEnterView2.f24119k4 - chatActivityEnterView2.l4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f24165s4 = true;
                                qg qgVar = chatActivityEnterView2.O1;
                                if (qgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    qgVar.a();
                                    ei.x3 x3Var = new ei.x3(qgVar.getContext(), 2);
                                    qgVar.f29912a = x3Var;
                                    x3Var.l(1.0f, 0.0f);
                                    qgVar.f29912a.p(true);
                                    qgVar.f29912a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    qgVar.addView(qgVar.f29912a, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    ei.x3 x3Var2 = qgVar.f29912a;
                                    x3Var2.f10097l0 = new og(qgVar, x3Var2, 3);
                                    x3Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f11 = x10 - recordCircle2.F;
                                float f12 = y3 - recordCircle2.G;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f24082e4 && chatActivityEnterView3.f24095g4 == 0.0f && f13 > recordCircle2.E) {
                                    f7 = 1.0f;
                                    chatActivityEnterView3.f24089f4 = System.currentTimeMillis();
                                } else {
                                    f7 = 1.0f;
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f24125m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.E2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = seVar.getX() + x10;
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
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f24116k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f24218r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.f24080e2 && chatActivityEnterView.f24067c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(yeVar);
                                        mg mgVar2 = chatActivityEnterView.Z2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        mgVar2.a2(2, 0, i14, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        veVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.X0(0);
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
                if (chatActivityEnterView.f24113j4 < 0.7f) {
                    if (chatActivityEnterView.f24080e2 && chatActivityEnterView.f24067c1) {
                        CameraController.getInstance().cancelOnInitRunnable(yeVar);
                        mg mgVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        mgVar3.a2(2, 0, i13, chatActivityEnterView.S4, 0L, true);
                        j13 = 0;
                        chatActivityEnterView.S4 = 0L;
                        veVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.X0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j13 = 0;
                    }
                    chatActivityEnterView.f24104i1 = j13;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.I1(5, true);
                    return false;
                }
                chatActivityEnterView.f24165s4 = true;
                ChatActivityEnterView.j(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f24165s4) || ((ieVar = chatActivityEnterView.f24079e1) != null && ieVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.I3) {
                        AndroidUtilities.cancelRunOnUIThread(ggVar);
                    }
                } else if ((((seVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f24080e2 && chatActivityEnterView.f24067c1) {
                        CameraController.getInstance().cancelOnInitRunnable(yeVar);
                        mg mgVar4 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        mgVar4.a2(2, 0, i12, chatActivityEnterView.S4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.S4 = 0L;
                        veVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.X0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f24104i1 = j12;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.I1(5, true);
                    return true;
                } else if (chatActivityEnterView.I3) {
                    AndroidUtilities.cancelRunOnUIThread(ggVar);
                    if (chatActivityEnterView.f24194y0 && chatActivityEnterView.f24188x0) {
                        chatActivityEnterView.Z2.a0(!chatActivityEnterView.f24067c1);
                        chatActivityEnterView.h1(!chatActivityEnterView.f24067c1, true);
                    } else {
                        chatActivityEnterView.Z2.Y1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f24080e2;
                    if (!z12 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z12 && chatActivityEnterView.f24067c1) {
                            if (d5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f24116k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.i1();
                                d5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final se f29896b;

                                    {
                                        this.f29896b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(yeVar);
                            mg mgVar5 = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            mgVar5.a2(1, 0, i11, chatActivityEnterView.S4, 0L, true);
                            j10 = 0;
                            chatActivityEnterView.S4 = 0L;
                            veVar.setEffect(0L);
                        } else {
                            j10 = 0;
                            if (!chatActivityEnterView.f24194y0) {
                                chatActivityEnterView.Z2.Y1();
                            } else if (d5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f24165s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.X0(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f24116k1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                d5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final se f29896b;

                                    {
                                        this.f29896b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f29896b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.O2;
                                    long a10 = snVar.a();
                                    d2 d2Var2 = new d2(17);
                                    pc pcVar2 = new pc(4);
                                    org.telegram.ui.ActionBar.g6 g6Var2 = this.f30484c;
                                    d5.J(activity2, a10, -1L, 0, false, d2Var2, pcVar2, new a5(g6Var2), g6Var2);
                                }
                                chatActivityEnterView.Z2.X0(0);
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
                        chatActivityEnterView.f24091g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final se f30119b;

                            {
                                this.f30119b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f30119b.d;
                                        chatActivityEnterView22.f24085f0 = null;
                                        chatActivityEnterView22.I1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f30119b.d;
                                        chatActivityEnterView32.f24085f0 = null;
                                        chatActivityEnterView32.I1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f24085f0 = runnable2;
                        if (chatActivityEnterView.f24197y4) {
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
