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
    public final Paint f31233a;
    public final RectF f31234b;
    public final org.telegram.ui.ActionBar.f6 f31235c;
    public final ChatActivityEnterView d;

    public ve(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f31235c = f6Var;
        this.f31233a = new Paint(1);
        this.f31234b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f23691a1) {
            cf cfVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (cfVar != null && cfVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Yd);
            Paint paint = this.f31233a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f31234b;
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
        if (this.d.f23757k5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ke keVar;
        long j3;
        int i10;
        long j10;
        int i11;
        long j11;
        int i12;
        long j12;
        int i13;
        int i14;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i15;
        int i16;
        ChatActivityEnterView chatActivityEnterView = this.d;
        ve veVar = chatActivityEnterView.Z0;
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        bf bfVar = chatActivityEnterView.G3;
        jg jgVar = chatActivityEnterView.J3;
        ye yeVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f23757k5) {
            chatActivityEnterView.Y();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f23792r4) {
                    boolean z10 = chatActivityEnterView.f23711d2;
                    if (!z10 || chatActivityEnterView.I3) {
                        chatActivityEnterView.C2 = -1.0f;
                        if (z10 && chatActivityEnterView.f23704c1) {
                            if (e5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23748j1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Y2.h1();
                                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ve f30294b;

                                    {
                                        this.f30294b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            og ogVar = chatActivityEnterView.Y2;
                            if (chatActivityEnterView.O) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            ogVar.c2(1, 0, i16, chatActivityEnterView.R4, 0L, true);
                            chatActivityEnterView.R4 = 0L;
                            yeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.N2;
                                long a2 = coVar.a();
                                p2 p2Var = new p2(5);
                                ah.j jVar = new ah.j(29);
                                Pattern pattern = e5.f25584a;
                                org.telegram.ui.ActionBar.f6 f6Var = this.f31235c;
                                e5.K(activity, a2, -1L, 0, false, p2Var, jVar, new c5(f6Var), f6Var);
                            }
                            if (e5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                if (chatActivityEnterView.f23704c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f23748j1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Y2.h1();
                                } else {
                                    if (chatActivityEnterView.f23792r4) {
                                        chatActivityEnterView.I3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Y2.V0(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f23748j1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ve f30294b;

                                    {
                                        this.f30294b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
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
                            chatActivityEnterView.Y2.V0(0);
                        }
                        chatActivityEnterView.E2 = false;
                        chatActivityEnterView.f23729g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final ve f30621b;

                            {
                                this.f30621b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f30621b.d;
                                        chatActivityEnterView2.f23723f0 = null;
                                        chatActivityEnterView2.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f30621b.d;
                                        chatActivityEnterView3.f23723f0 = null;
                                        chatActivityEnterView3.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f23723f0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (coVar == null) {
                    chat = null;
                } else {
                    chat = coVar.f35264e;
                }
                if (coVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = coVar.f35219a8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f23711d2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Y2.a2();
                    return true;
                } else if (chatActivityEnterView.f23711d2) {
                    chatActivityEnterView.I3 = false;
                    chatActivityEnterView.H3 = true;
                    AndroidUtilities.runOnUIThread(jgVar, 150L);
                    return true;
                } else {
                    jgVar.run();
                    return true;
                }
            }
            float f7 = 1.0f;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.E2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f23792r4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.f23756k4 == -1.0f) {
                                chatActivityEnterView2.f23750j4 = y3;
                            }
                            chatActivityEnterView2.f23756k4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f23786q4 && chatActivityEnterView2.f23745i4 >= 0.7f && chatActivityEnterView2.f23750j4 - chatActivityEnterView2.f23756k4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f23792r4 = true;
                                sg sgVar = chatActivityEnterView2.N1;
                                if (sgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    sgVar.a();
                                    di.f4 f4Var = new di.f4(sgVar.getContext(), 2);
                                    sgVar.f30305a = f4Var;
                                    f4Var.l(1.0f, 0.0f);
                                    sgVar.f30305a.p(true);
                                    sgVar.f30305a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    sgVar.addView(sgVar.f30305a, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    di.f4 f4Var2 = sgVar.f30305a;
                                    f4Var2.f7238l0 = new qg(sgVar, f4Var2, 3);
                                    f4Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.M1;
                                float f10 = x10 - recordCircle2.F;
                                float f11 = y3 - recordCircle2.G;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f23713d4 && chatActivityEnterView3.f23727f4 == 0.0f && f12 > recordCircle2.E) {
                                    chatActivityEnterView3.f23720e4 = System.currentTimeMillis();
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
                                float f13 = chatActivityEnterView.C2;
                                float f14 = ((x11 - f13) / chatActivityEnterView.D2) + 1.0f;
                                if (f13 != -1.0f) {
                                    if (f14 <= 1.0f) {
                                        if (f14 < 0.0f) {
                                            f7 = 0.0f;
                                        } else {
                                            f7 = f14;
                                        }
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f23748j1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f23853r = f7;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f7);
                                    f14 = f7;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.f23711d2 && chatActivityEnterView.f23704c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                                        og ogVar2 = chatActivityEnterView.Y2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        ogVar2.c2(2, 0, i14, chatActivityEnterView.R4, 0L, true);
                                        chatActivityEnterView.R4 = 0L;
                                        yeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Y2.V0(0);
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
                if (chatActivityEnterView.f23745i4 < 0.7f) {
                    if (chatActivityEnterView.f23711d2 && chatActivityEnterView.f23704c1) {
                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                        og ogVar3 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        ogVar3.c2(2, 0, i13, chatActivityEnterView.R4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.R4 = 0L;
                        yeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.V0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f23742i1 = j12;
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.L1(5, true);
                    return false;
                }
                chatActivityEnterView.f23792r4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.M1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f23792r4) || ((keVar = chatActivityEnterView.f23717e1) != null && keVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.H3) {
                        AndroidUtilities.cancelRunOnUIThread(jgVar);
                    }
                } else if ((((veVar.getX() + motionEvent.getX()) - chatActivityEnterView.C2) / chatActivityEnterView.D2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f23711d2 && chatActivityEnterView.f23704c1) {
                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                        og ogVar4 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        ogVar4.c2(2, 0, i12, chatActivityEnterView.R4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.R4 = 0L;
                        yeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.V0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.f23742i1 = j11;
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                } else if (chatActivityEnterView.H3) {
                    AndroidUtilities.cancelRunOnUIThread(jgVar);
                    if (chatActivityEnterView.f23827y0 && chatActivityEnterView.f23821x0) {
                        chatActivityEnterView.Y2.W(!chatActivityEnterView.f23704c1);
                        chatActivityEnterView.k1(!chatActivityEnterView.f23704c1, true);
                    } else {
                        chatActivityEnterView.Y2.a2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f23711d2;
                    if (!z12 || chatActivityEnterView.I3) {
                        chatActivityEnterView.C2 = -1.0f;
                        if (z12 && chatActivityEnterView.f23704c1) {
                            if (e5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f23748j1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Y2.h1();
                                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ve f30294b;

                                    {
                                        this.f30294b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(bfVar);
                            og ogVar5 = chatActivityEnterView.Y2;
                            if (chatActivityEnterView.O) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            ogVar5.c2(1, 0, i11, chatActivityEnterView.R4, 0L, true);
                            j3 = 0;
                            chatActivityEnterView.R4 = 0L;
                            yeVar.setEffect(0L);
                        } else {
                            j3 = 0;
                            if (!chatActivityEnterView.f23827y0) {
                                chatActivityEnterView.Y2.a2();
                            } else if (e5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                if (chatActivityEnterView.f23792r4) {
                                    chatActivityEnterView.I3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Y2.V0(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f23748j1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ve f30294b;

                                    {
                                        this.f30294b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f30294b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.N2;
                                    long a10 = coVar.a();
                                    p2 p2Var2 = new p2(6);
                                    ue ueVar = new ue(0);
                                    org.telegram.ui.ActionBar.f6 f6Var2 = this.f31235c;
                                    e5.K(activity2, a10, -1L, 0, false, p2Var2, ueVar, new c5(f6Var2), f6Var2);
                                }
                                chatActivityEnterView.Y2.V0(0);
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
                        chatActivityEnterView.f23729g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final ve f30621b;

                            {
                                this.f30621b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f30621b.d;
                                        chatActivityEnterView22.f23723f0 = null;
                                        chatActivityEnterView22.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f30621b.d;
                                        chatActivityEnterView32.f23723f0 = null;
                                        chatActivityEnterView32.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f23723f0 = runnable2;
                        if (chatActivityEnterView.f23825x4) {
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
