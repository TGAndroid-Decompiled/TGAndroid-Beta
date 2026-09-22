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
    public final Paint f27839a;
    public final RectF f27840b;
    public final org.telegram.ui.ActionBar.e6 f27841c;
    public final ChatActivityEnterView d;

    public se(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f27841c = e6Var;
        this.f27839a = new Paint(1);
        this.f27840b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f21730a1) {
            ze zeVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (zeVar != null && zeVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int j02 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.i6.Yd);
            Paint paint = this.f27839a;
            paint.setColor(j02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f27840b;
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
        if (this.d.f21799l5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ie ieVar;
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
        se seVar = chatActivityEnterView.Z0;
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        ye yeVar = chatActivityEnterView.G3;
        hg hgVar = chatActivityEnterView.J3;
        ve veVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f21799l5) {
            chatActivityEnterView.Z();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f21831r4) {
                    boolean z10 = chatActivityEnterView.f21750d2;
                    if (!z10 || chatActivityEnterView.I3) {
                        chatActivityEnterView.C2 = -1.0f;
                        if (z10 && chatActivityEnterView.f21743c1) {
                            if (c5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f21786j1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Y2.n1();
                                c5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final se f27311b;

                                    {
                                        this.f27311b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            mg mgVar = chatActivityEnterView.Y2;
                            if (chatActivityEnterView.O) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            mgVar.k2(1, 0, i16, chatActivityEnterView.S4, 0L, true);
                            chatActivityEnterView.S4 = 0L;
                            veVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.N2;
                                long a2 = boVar.a();
                                o2 o2Var = new o2(7);
                                ai.f fVar = new ai.f(28);
                                Pattern pattern = c5.f22944a;
                                org.telegram.ui.ActionBar.e6 e6Var = this.f27841c;
                                c5.K(activity, a2, -1L, 0, false, o2Var, fVar, new a5(e6Var), e6Var);
                            }
                            if (c5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                if (chatActivityEnterView.f21743c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f21786j1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Y2.n1();
                                } else {
                                    if (chatActivityEnterView.f21831r4) {
                                        chatActivityEnterView.I3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Y2.a1(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f21786j1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                c5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final se f27311b;

                                    {
                                        this.f27311b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
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
                        chatActivityEnterView.f21767g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final se f27622b;

                            {
                                this.f27622b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f27622b.d;
                                        chatActivityEnterView2.f21761f0 = null;
                                        chatActivityEnterView2.M1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f27622b.d;
                                        chatActivityEnterView3.f21761f0 = null;
                                        chatActivityEnterView3.M1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f21761f0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (boVar == null) {
                    chat = null;
                } else {
                    chat = boVar.e;
                }
                if (boVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = boVar.f32239a8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f21750d2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Y2.i2();
                    return true;
                } else if (chatActivityEnterView.f21750d2) {
                    chatActivityEnterView.I3 = false;
                    chatActivityEnterView.H3 = true;
                    AndroidUtilities.runOnUIThread(hgVar, 150L);
                    return true;
                } else {
                    hgVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.E2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f21831r4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.f21794k4 == -1.0f) {
                                chatActivityEnterView2.f21788j4 = y3;
                            }
                            chatActivityEnterView2.f21794k4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f21825q4 && chatActivityEnterView2.f21783i4 >= 0.7f && chatActivityEnterView2.f21788j4 - chatActivityEnterView2.f21794k4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f21831r4 = true;
                                qg qgVar = chatActivityEnterView2.N1;
                                if (qgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    qgVar.a();
                                    ci.f4 f4Var = new ci.f4(qgVar.getContext(), 2);
                                    qgVar.f27329a = f4Var;
                                    f4Var.l(1.0f, 0.0f);
                                    qgVar.f27329a.p(true);
                                    qgVar.f27329a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    qgVar.addView(qgVar.f27329a, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    ci.f4 f4Var2 = qgVar.f27329a;
                                    f4Var2.f4635l0 = new og(qgVar, f4Var2, 3);
                                    f4Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.M1;
                                float f11 = x10 - recordCircle2.F;
                                float f12 = y3 - recordCircle2.G;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f21752d4 && chatActivityEnterView3.f21765f4 == 0.0f && f13 > recordCircle2.E) {
                                    f7 = 1.0f;
                                    chatActivityEnterView3.f21758e4 = System.currentTimeMillis();
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
                                float x11 = seVar.getX() + x10;
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
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f21786j1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f21890r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.f21750d2 && chatActivityEnterView.f21743c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(yeVar);
                                        mg mgVar2 = chatActivityEnterView.Y2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        mgVar2.k2(2, 0, i14, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        veVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Y2.a1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                                    }
                                    chatActivityEnterView.E2 = false;
                                    chatActivityEnterView.M1(5, true);
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
                if (chatActivityEnterView.f21783i4 < 0.7f) {
                    if (chatActivityEnterView.f21750d2 && chatActivityEnterView.f21743c1) {
                        CameraController.getInstance().cancelOnInitRunnable(yeVar);
                        mg mgVar3 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        mgVar3.k2(2, 0, i13, chatActivityEnterView.S4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.S4 = 0L;
                        veVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f21780i1 = j12;
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.M1(5, true);
                    return false;
                }
                chatActivityEnterView.f21831r4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.M1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f21831r4) || ((ieVar = chatActivityEnterView.f21755e1) != null && ieVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.H3) {
                        AndroidUtilities.cancelRunOnUIThread(hgVar);
                    }
                } else if ((((seVar.getX() + motionEvent.getX()) - chatActivityEnterView.C2) / chatActivityEnterView.D2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f21750d2 && chatActivityEnterView.f21743c1) {
                        CameraController.getInstance().cancelOnInitRunnable(yeVar);
                        mg mgVar4 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        mgVar4.k2(2, 0, i12, chatActivityEnterView.S4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.S4 = 0L;
                        veVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.f21780i1 = j11;
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.M1(5, true);
                    return true;
                } else if (chatActivityEnterView.H3) {
                    AndroidUtilities.cancelRunOnUIThread(hgVar);
                    if (chatActivityEnterView.f21866y0 && chatActivityEnterView.f21860x0) {
                        chatActivityEnterView.Y2.X(!chatActivityEnterView.f21743c1);
                        chatActivityEnterView.l1(!chatActivityEnterView.f21743c1, true);
                    } else {
                        chatActivityEnterView.Y2.i2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f21750d2;
                    if (!z12 || chatActivityEnterView.I3) {
                        chatActivityEnterView.C2 = -1.0f;
                        if (z12 && chatActivityEnterView.f21743c1) {
                            if (c5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f21786j1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Y2.n1();
                                c5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final se f27311b;

                                    {
                                        this.f27311b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(yeVar);
                            mg mgVar5 = chatActivityEnterView.Y2;
                            if (chatActivityEnterView.O) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            mgVar5.k2(1, 0, i11, chatActivityEnterView.S4, 0L, true);
                            j3 = 0;
                            chatActivityEnterView.S4 = 0L;
                            veVar.setEffect(0L);
                        } else {
                            j3 = 0;
                            if (!chatActivityEnterView.f21866y0) {
                                chatActivityEnterView.Y2.i2();
                            } else if (c5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                if (chatActivityEnterView.f21831r4) {
                                    chatActivityEnterView.I3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Y2.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f21786j1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                c5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final se f27311b;

                                    {
                                        this.f27311b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f27311b.d.U0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.N2;
                                    long a10 = boVar.a();
                                    o2 o2Var2 = new o2(8);
                                    ai.f fVar2 = new ai.f(29);
                                    org.telegram.ui.ActionBar.e6 e6Var2 = this.f27841c;
                                    c5.K(activity2, a10, -1L, 0, false, o2Var2, fVar2, new a5(e6Var2), e6Var2);
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
                        chatActivityEnterView.f21767g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final se f27622b;

                            {
                                this.f27622b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f27622b.d;
                                        chatActivityEnterView22.f21761f0 = null;
                                        chatActivityEnterView22.M1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f27622b.d;
                                        chatActivityEnterView32.f21761f0 = null;
                                        chatActivityEnterView32.M1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f21761f0 = runnable2;
                        if (chatActivityEnterView.f21869y4) {
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
