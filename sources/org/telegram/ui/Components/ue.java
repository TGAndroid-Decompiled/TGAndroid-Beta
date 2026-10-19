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
    public final Paint f30944a;
    public final RectF f30945b;
    public final org.telegram.ui.ActionBar.d6 f30946c;
    public final ChatActivityEnterView d;

    public ue(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f30946c = d6Var;
        this.f30944a = new Paint(1);
        this.f30945b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f23910a1) {
            bf bfVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (bfVar != null && bfVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int g02 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.Yd);
            Paint paint = this.f30944a;
            paint.setColor(g02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f30945b;
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
        if (this.d.f23980l5) {
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
        org.telegram.ui.qn qnVar = chatActivityEnterView.P2;
        af afVar = chatActivityEnterView.H3;
        ig igVar = chatActivityEnterView.K3;
        xe xeVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f23980l5) {
            chatActivityEnterView.W();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f24018s4) {
                    boolean z10 = chatActivityEnterView.f23936e2;
                    if (!z10 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z10 && chatActivityEnterView.f23923c1) {
                            if (f5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23972k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.i1();
                                f5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f30243b;

                                    {
                                        this.f30243b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
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
                            ogVar.a2(1, 0, i16, chatActivityEnterView.S4, 0L, true);
                            chatActivityEnterView.S4 = 0L;
                            xeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.O2;
                                long a2 = qnVar.a();
                                k2 k2Var = new k2(10);
                                sc scVar = new sc(2);
                                Pattern pattern = f5.f26101a;
                                org.telegram.ui.ActionBar.d6 d6Var = this.f30946c;
                                f5.J(activity, a2, -1L, 0, false, k2Var, scVar, new d5(d6Var), d6Var);
                            }
                            if (f5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f23923c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f23972k1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Z2.i1();
                                } else {
                                    if (chatActivityEnterView.f24018s4) {
                                        chatActivityEnterView.J3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Z2.X0(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f23972k1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                f5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f30243b;

                                    {
                                        this.f30243b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
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
                        chatActivityEnterView.f23947g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final ue f30488b;

                            {
                                this.f30488b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f30488b.d;
                                        chatActivityEnterView2.f23941f0 = null;
                                        chatActivityEnterView2.I1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f30488b.d;
                                        chatActivityEnterView3.f23941f0 = null;
                                        chatActivityEnterView3.I1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f23941f0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (qnVar == null) {
                    chat = null;
                } else {
                    chat = qnVar.e;
                }
                if (qnVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = qnVar.f40621a8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f23936e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Z2.Y1();
                    return true;
                } else if (chatActivityEnterView.f23936e2) {
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
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f24018s4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.l4 == -1.0f) {
                                chatActivityEnterView2.f23975k4 = y3;
                            }
                            chatActivityEnterView2.l4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f24012r4 && chatActivityEnterView2.f23969j4 >= 0.7f && chatActivityEnterView2.f23975k4 - chatActivityEnterView2.l4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f24018s4 = true;
                                sg sgVar = chatActivityEnterView2.O1;
                                if (sgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    sgVar.a();
                                    ei.x3 x3Var = new ei.x3(sgVar.getContext(), 2);
                                    sgVar.f30250a = x3Var;
                                    x3Var.l(1.0f, 0.0f);
                                    sgVar.f30250a.p(true);
                                    sgVar.f30250a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    sgVar.addView(sgVar.f30250a, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    ei.x3 x3Var2 = sgVar.f30250a;
                                    x3Var2.f10082l0 = new qg(sgVar, x3Var2, 3);
                                    x3Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f10 = x10 - recordCircle2.F;
                                float f11 = y3 - recordCircle2.G;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f23938e4 && chatActivityEnterView3.f23951g4 == 0.0f && f12 > recordCircle2.E) {
                                    chatActivityEnterView3.f23945f4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f23981m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.E2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = ueVar.getX() + x10;
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
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f23972k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f24071r = f7;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f7);
                                    f14 = f7;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.f23936e2 && chatActivityEnterView.f23923c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                                        og ogVar2 = chatActivityEnterView.Z2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        ogVar2.a2(2, 0, i14, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        xeVar.setEffect(0L);
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
                        ChatActivityEnterView.k(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.f23969j4 < 0.7f) {
                    if (chatActivityEnterView.f23936e2 && chatActivityEnterView.f23923c1) {
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        og ogVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        ogVar3.a2(2, 0, i13, chatActivityEnterView.S4, 0L, true);
                        j13 = 0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.X0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j13 = 0;
                    }
                    chatActivityEnterView.f23960i1 = j13;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.I1(5, true);
                    return false;
                }
                chatActivityEnterView.f24018s4 = true;
                ChatActivityEnterView.k(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f24018s4) || ((keVar = chatActivityEnterView.f23935e1) != null && keVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.I3) {
                        AndroidUtilities.cancelRunOnUIThread(igVar);
                    }
                } else if ((((ueVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f23936e2 && chatActivityEnterView.f23923c1) {
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        og ogVar4 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        ogVar4.a2(2, 0, i12, chatActivityEnterView.S4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.X0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f23960i1 = j12;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.I1(5, true);
                    return true;
                } else if (chatActivityEnterView.I3) {
                    AndroidUtilities.cancelRunOnUIThread(igVar);
                    if (chatActivityEnterView.f24047y0 && chatActivityEnterView.f24041x0) {
                        chatActivityEnterView.Z2.a0(!chatActivityEnterView.f23923c1);
                        chatActivityEnterView.h1(!chatActivityEnterView.f23923c1, true);
                    } else {
                        chatActivityEnterView.Z2.Y1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f23936e2;
                    if (!z12 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z12 && chatActivityEnterView.f23923c1) {
                            if (f5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f23972k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.i1();
                                f5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f30243b;

                                    {
                                        this.f30243b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
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
                            ogVar5.a2(1, 0, i11, chatActivityEnterView.S4, 0L, true);
                            j10 = 0;
                            chatActivityEnterView.S4 = 0L;
                            xeVar.setEffect(0L);
                        } else {
                            j10 = 0;
                            if (!chatActivityEnterView.f24047y0) {
                                chatActivityEnterView.Z2.Y1();
                            } else if (f5.c0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f24018s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.X0(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f23972k1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                f5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f30243b;

                                    {
                                        this.f30243b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f30243b.d.R0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.O2;
                                    long a10 = qnVar.a();
                                    k2 k2Var2 = new k2(11);
                                    sc scVar2 = new sc(3);
                                    org.telegram.ui.ActionBar.d6 d6Var2 = this.f30946c;
                                    f5.J(activity2, a10, -1L, 0, false, k2Var2, scVar2, new d5(d6Var2), d6Var2);
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
                        chatActivityEnterView.f23947g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final ue f30488b;

                            {
                                this.f30488b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f30488b.d;
                                        chatActivityEnterView22.f23941f0 = null;
                                        chatActivityEnterView22.I1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f30488b.d;
                                        chatActivityEnterView32.f23941f0 = null;
                                        chatActivityEnterView32.I1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f23941f0 = runnable2;
                        if (chatActivityEnterView.f24050y4) {
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
