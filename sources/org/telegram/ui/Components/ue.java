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
    public final Paint f28649a;
    public final RectF f28650b;
    public final org.telegram.ui.ActionBar.f6 f28651c;
    public final ChatActivityEnterView d;

    public ue(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f28651c = f6Var;
        this.f28649a = new Paint(1);
        this.f28650b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f21955a1) {
            bf bfVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (bfVar != null && bfVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Yd);
            Paint paint = this.f28649a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f28650b;
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
        if (this.d.f22020k5) {
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
        float f7;
        int i14;
        float f10;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i15;
        int i16;
        ChatActivityEnterView chatActivityEnterView = this.d;
        ue ueVar = chatActivityEnterView.Z0;
        org.telegram.ui.zn znVar = chatActivityEnterView.O2;
        af afVar = chatActivityEnterView.G3;
        ig igVar = chatActivityEnterView.J3;
        xe xeVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f22020k5) {
            chatActivityEnterView.Y();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f22055r4) {
                    boolean z10 = chatActivityEnterView.f21975d2;
                    if (!z10 || chatActivityEnterView.I3) {
                        chatActivityEnterView.C2 = -1.0f;
                        if (z10 && chatActivityEnterView.f21968c1) {
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22011j1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Y2.o1();
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ue f28099b;

                                    {
                                        this.f28099b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            ng ngVar = chatActivityEnterView.Y2;
                            if (chatActivityEnterView.O) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            ngVar.k2(1, 0, i16, chatActivityEnterView.R4, 0L, true);
                            chatActivityEnterView.R4 = 0L;
                            xeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.N2;
                                long a2 = znVar.a();
                                i2 i2Var = new i2(12);
                                ai.f fVar = new ai.f(28);
                                Pattern pattern = d5.f23492a;
                                org.telegram.ui.ActionBar.f6 f6Var = this.f28651c;
                                d5.K(activity, a2, -1L, 0, false, i2Var, fVar, new b5(f6Var), f6Var);
                            }
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                if (chatActivityEnterView.f21968c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f22011j1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Y2.o1();
                                } else {
                                    if (chatActivityEnterView.f22055r4) {
                                        chatActivityEnterView.I3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Y2.b1(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f22011j1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ue f28099b;

                                    {
                                        this.f28099b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
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
                            chatActivityEnterView.Y2.b1(0);
                        }
                        chatActivityEnterView.E2 = false;
                        chatActivityEnterView.f21992g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final ue f28364b;

                            {
                                this.f28364b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f28364b.d;
                                        chatActivityEnterView2.f21986f0 = null;
                                        chatActivityEnterView2.K1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f28364b.d;
                                        chatActivityEnterView3.f21986f0 = null;
                                        chatActivityEnterView3.K1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f21986f0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (znVar == null) {
                    chat = null;
                } else {
                    chat = znVar.e;
                }
                if (znVar == null) {
                    userFull = chatActivityEnterView.K;
                } else {
                    userFull = znVar.f40249a8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f21975d2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Y2.i2();
                    return true;
                } else if (chatActivityEnterView.f21975d2) {
                    chatActivityEnterView.I3 = false;
                    chatActivityEnterView.H3 = true;
                    AndroidUtilities.runOnUIThread(igVar, 150L);
                    return true;
                } else {
                    igVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.E2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f22055r4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.f22019k4 == -1.0f) {
                                chatActivityEnterView2.f22013j4 = y3;
                            }
                            chatActivityEnterView2.f22019k4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f22049q4 && chatActivityEnterView2.f22008i4 >= 0.7f && chatActivityEnterView2.f22013j4 - chatActivityEnterView2.f22019k4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f22055r4 = true;
                                rg rgVar = chatActivityEnterView2.N1;
                                if (rgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    rgVar.a();
                                    ci.f4 f4Var = new ci.f4(rgVar.getContext(), 2);
                                    rgVar.f27891a = f4Var;
                                    f4Var.l(1.0f, 0.0f);
                                    rgVar.f27891a.p(true);
                                    rgVar.f27891a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    rgVar.addView(rgVar.f27891a, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    ci.f4 f4Var2 = rgVar.f27891a;
                                    f4Var2.f4639l0 = new pg(rgVar, f4Var2, 3);
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
                                if (chatActivityEnterView3.f21977d4 && chatActivityEnterView3.f21990f4 == 0.0f && f13 > recordCircle2.E) {
                                    f7 = 1.0f;
                                    chatActivityEnterView3.f21983e4 = System.currentTimeMillis();
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
                                float x11 = ueVar.getX() + x10;
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
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f22011j1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f22114r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.f21975d2 && chatActivityEnterView.f21968c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                                        ng ngVar2 = chatActivityEnterView.Y2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        ngVar2.k2(2, 0, i14, chatActivityEnterView.R4, 0L, true);
                                        chatActivityEnterView.R4 = 0L;
                                        xeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Y2.b1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                                    }
                                    chatActivityEnterView.E2 = false;
                                    chatActivityEnterView.K1(5, true);
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
                if (chatActivityEnterView.f22008i4 < 0.7f) {
                    if (chatActivityEnterView.f21975d2 && chatActivityEnterView.f21968c1) {
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        ng ngVar3 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        ngVar3.k2(2, 0, i13, chatActivityEnterView.R4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.R4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.b1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f22005i1 = j12;
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.K1(5, true);
                    return false;
                }
                chatActivityEnterView.f22055r4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.M1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f22055r4) || ((keVar = chatActivityEnterView.f21980e1) != null && keVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.H3) {
                        AndroidUtilities.cancelRunOnUIThread(igVar);
                    }
                } else if ((((ueVar.getX() + motionEvent.getX()) - chatActivityEnterView.C2) / chatActivityEnterView.D2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f21975d2 && chatActivityEnterView.f21968c1) {
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        ng ngVar4 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        ngVar4.k2(2, 0, i12, chatActivityEnterView.R4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.R4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.b1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.f22005i1 = j11;
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.K1(5, true);
                    return true;
                } else if (chatActivityEnterView.H3) {
                    AndroidUtilities.cancelRunOnUIThread(igVar);
                    if (chatActivityEnterView.f22090y0 && chatActivityEnterView.f22084x0) {
                        chatActivityEnterView.Y2.X(!chatActivityEnterView.f21968c1);
                        chatActivityEnterView.j1(!chatActivityEnterView.f21968c1, true);
                    } else {
                        chatActivityEnterView.Y2.i2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f21975d2;
                    if (!z12 || chatActivityEnterView.I3) {
                        chatActivityEnterView.C2 = -1.0f;
                        if (z12 && chatActivityEnterView.f21968c1) {
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f22011j1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Y2.o1();
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ue f28099b;

                                    {
                                        this.f28099b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(afVar);
                            ng ngVar5 = chatActivityEnterView.Y2;
                            if (chatActivityEnterView.O) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            ngVar5.k2(1, 0, i11, chatActivityEnterView.R4, 0L, true);
                            j3 = 0;
                            chatActivityEnterView.R4 = 0L;
                            xeVar.setEffect(0L);
                        } else {
                            j3 = 0;
                            if (!chatActivityEnterView.f22090y0) {
                                chatActivityEnterView.Y2.i2();
                            } else if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                if (chatActivityEnterView.f22055r4) {
                                    chatActivityEnterView.I3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Y2.b1(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f22011j1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) {
                                    public final ue f28099b;

                                    {
                                        this.f28099b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28099b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.N2;
                                    long a10 = znVar.a();
                                    i2 i2Var2 = new i2(13);
                                    ai.f fVar2 = new ai.f(29);
                                    org.telegram.ui.ActionBar.f6 f6Var2 = this.f28651c;
                                    d5.K(activity2, a10, -1L, 0, false, i2Var2, fVar2, new b5(f6Var2), f6Var2);
                                }
                                chatActivityEnterView.Y2.b1(0);
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
                        chatActivityEnterView.f21992g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final ue f28364b;

                            {
                                this.f28364b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f28364b.d;
                                        chatActivityEnterView22.f21986f0 = null;
                                        chatActivityEnterView22.K1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f28364b.d;
                                        chatActivityEnterView32.f21986f0 = null;
                                        chatActivityEnterView32.K1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f21986f0 = runnable2;
                        if (chatActivityEnterView.f22088x4) {
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
