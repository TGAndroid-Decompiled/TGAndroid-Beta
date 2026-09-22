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
    public final Paint f28717a;
    public final RectF f28718b;
    public final org.telegram.ui.ActionBar.f6 f28719c;
    public final ChatActivityEnterView d;

    public ue(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f28719c = f6Var;
        this.f28717a = new Paint(1);
        this.f28718b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f21970a1) {
            bf bfVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (bfVar != null && bfVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Yd);
            Paint paint = this.f28717a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f28718b;
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
        if (this.d.f22039l5) {
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
        org.telegram.ui.zn znVar = chatActivityEnterView.P2;
        af afVar = chatActivityEnterView.H3;
        ig igVar = chatActivityEnterView.K3;
        xe xeVar = chatActivityEnterView.J0;
        if (!chatActivityEnterView.f22039l5) {
            chatActivityEnterView.Y();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f22077s4) {
                    boolean z10 = chatActivityEnterView.f21996e2;
                    if (!z10 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z10 && chatActivityEnterView.f21983c1) {
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22031k1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.o1();
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f28168b;

                                    {
                                        this.f28168b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            ng ngVar = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            ngVar.k2(1, 0, i16, chatActivityEnterView.S4, 0L, true);
                            chatActivityEnterView.S4 = 0L;
                            xeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.O2;
                                long a2 = znVar.a();
                                i2 i2Var = new i2(12);
                                ai.f fVar = new ai.f(28);
                                Pattern pattern = d5.f23562a;
                                org.telegram.ui.ActionBar.f6 f6Var = this.f28719c;
                                d5.K(activity, a2, -1L, 0, false, i2Var, fVar, new b5(f6Var), f6Var);
                            }
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f21983c1) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f22031k1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.Z2.o1();
                                } else {
                                    if (chatActivityEnterView.f22077s4) {
                                        chatActivityEnterView.J3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                    chatActivityEnterView.Z2.b1(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f22031k1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f28168b;

                                    {
                                        this.f28168b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
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
                            chatActivityEnterView.Z2.b1(0);
                        }
                        chatActivityEnterView.F2 = false;
                        chatActivityEnterView.f22007g0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final ue f28454b;

                            {
                                this.f28454b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f28454b.d;
                                        chatActivityEnterView2.f22001f0 = null;
                                        chatActivityEnterView2.K1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f28454b.d;
                                        chatActivityEnterView3.f22001f0 = null;
                                        chatActivityEnterView3.K1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f22001f0 = runnable;
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
                    userFull = znVar.f40270a8;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.f21996e2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.Z2.i2();
                    return true;
                } else if (chatActivityEnterView.f21996e2) {
                    chatActivityEnterView.J3 = false;
                    chatActivityEnterView.I3 = true;
                    AndroidUtilities.runOnUIThread(igVar, 150L);
                    return true;
                } else {
                    igVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.F2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f22077s4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.l4 == -1.0f) {
                                chatActivityEnterView2.f22034k4 = y3;
                            }
                            chatActivityEnterView2.l4 = y3;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f22071r4 && chatActivityEnterView2.f22028j4 >= 0.7f && chatActivityEnterView2.f22034k4 - chatActivityEnterView2.l4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f22077s4 = true;
                                rg rgVar = chatActivityEnterView2.O1;
                                if (rgVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    rgVar.a();
                                    ci.f4 f4Var = new ci.f4(rgVar.getContext(), 2);
                                    rgVar.f27948a = f4Var;
                                    f4Var.l(1.0f, 0.0f);
                                    rgVar.f27948a.p(true);
                                    rgVar.f27948a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    rgVar.addView(rgVar.f27948a, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    ci.f4 f4Var2 = rgVar.f27948a;
                                    f4Var2.f4637l0 = new pg(rgVar, f4Var2, 3);
                                    f4Var2.u();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                                float f11 = x10 - recordCircle2.F;
                                float f12 = y3 - recordCircle2.G;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f21998e4 && chatActivityEnterView3.f22011g4 == 0.0f && f13 > recordCircle2.E) {
                                    f7 = 1.0f;
                                    chatActivityEnterView3.f22005f4 = System.currentTimeMillis();
                                } else {
                                    f7 = 1.0f;
                                }
                                if (chatActivityEnterView.D2 == -1.0f) {
                                    chatActivityEnterView.D2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f22040m1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.E2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.E2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = ueVar.getX() + x10;
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
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f22031k1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f22130r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.f21996e2 && chatActivityEnterView.f21983c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                                        ng ngVar2 = chatActivityEnterView.Z2;
                                        if (chatActivityEnterView.O) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        ngVar2.k2(2, 0, i14, chatActivityEnterView.S4, 0L, true);
                                        chatActivityEnterView.S4 = 0L;
                                        xeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Z2.b1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                                    }
                                    chatActivityEnterView.F2 = false;
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
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.F2) {
                if (chatActivityEnterView.f22028j4 < 0.7f) {
                    if (chatActivityEnterView.f21996e2 && chatActivityEnterView.f21983c1) {
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        ng ngVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        ngVar3.k2(2, 0, i13, chatActivityEnterView.S4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.b1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f22020i1 = j12;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.K1(5, true);
                    return false;
                }
                chatActivityEnterView.f22077s4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.N1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f22077s4) || ((keVar = chatActivityEnterView.f21995e1) != null && keVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.I3) {
                        AndroidUtilities.cancelRunOnUIThread(igVar);
                    }
                } else if ((((ueVar.getX() + motionEvent.getX()) - chatActivityEnterView.D2) / chatActivityEnterView.E2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.f21996e2 && chatActivityEnterView.f21983c1) {
                        CameraController.getInstance().cancelOnInitRunnable(afVar);
                        ng ngVar4 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        ngVar4.k2(2, 0, i12, chatActivityEnterView.S4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.b1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.f22020i1 = j11;
                    chatActivityEnterView.F2 = false;
                    chatActivityEnterView.K1(5, true);
                    return true;
                } else if (chatActivityEnterView.I3) {
                    AndroidUtilities.cancelRunOnUIThread(igVar);
                    if (chatActivityEnterView.f22106y0 && chatActivityEnterView.f22100x0) {
                        chatActivityEnterView.Z2.X(!chatActivityEnterView.f21983c1);
                        chatActivityEnterView.j1(!chatActivityEnterView.f21983c1, true);
                    } else {
                        chatActivityEnterView.Z2.i2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z12 = chatActivityEnterView.f21996e2;
                    if (!z12 || chatActivityEnterView.J3) {
                        chatActivityEnterView.D2 = -1.0f;
                        if (z12 && chatActivityEnterView.f21983c1) {
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f22031k1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.Z2.o1();
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f28168b;

                                    {
                                        this.f28168b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(afVar);
                            ng ngVar5 = chatActivityEnterView.Z2;
                            if (chatActivityEnterView.O) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            ngVar5.k2(1, 0, i11, chatActivityEnterView.S4, 0L, true);
                            j3 = 0;
                            chatActivityEnterView.S4 = 0L;
                            xeVar.setEffect(0L);
                        } else {
                            j3 = 0;
                            if (!chatActivityEnterView.f22106y0) {
                                chatActivityEnterView.Z2.i2();
                            } else if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                                if (chatActivityEnterView.f22077s4) {
                                    chatActivityEnterView.J3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Z2.b1(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f22031k1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new Utilities.Callback(this) {
                                    public final ue f28168b;

                                    {
                                        this.f28168b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 1:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            case 2:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                            default:
                                                this.f28168b.d.T0(0, true, 0, false, l4.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.F2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.O2;
                                    long a10 = znVar.a();
                                    i2 i2Var2 = new i2(13);
                                    ai.f fVar2 = new ai.f(29);
                                    org.telegram.ui.ActionBar.f6 f6Var2 = this.f28719c;
                                    d5.K(activity2, a10, -1L, 0, false, i2Var2, fVar2, new b5(f6Var2), f6Var2);
                                }
                                chatActivityEnterView.Z2.b1(0);
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
                        chatActivityEnterView.f22007g0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final ue f28454b;

                            {
                                this.f28454b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f28454b.d;
                                        chatActivityEnterView22.f22001f0 = null;
                                        chatActivityEnterView22.K1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f28454b.d;
                                        chatActivityEnterView32.f22001f0 = null;
                                        chatActivityEnterView32.K1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f22001f0 = runnable2;
                        if (chatActivityEnterView.f22109y4) {
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
