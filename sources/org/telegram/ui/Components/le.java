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
public final class le extends FrameLayout {
    public final Paint f26622a;
    public final RectF f26623b;
    public final org.telegram.ui.ActionBar.f6 f26624c;
    public final ChatActivityEnterView d;

    public le(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f26624c = f6Var;
        this.f26622a = new Paint(1);
        this.f26623b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.X0) {
            se seVar = chatActivityEnterView.P0;
            float f10 = 1.0f;
            if (seVar != null && seVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.P0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Yd);
            Paint paint = this.f26622a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.f26623b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d.f22779h5) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ae aeVar;
        long j10;
        int i10;
        long j11;
        int i11;
        long j12;
        int i12;
        long j13;
        int i13;
        float f10;
        int i14;
        float f11;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull;
        int i15;
        int i16;
        ChatActivityEnterView chatActivityEnterView = this.d;
        le leVar = chatActivityEnterView.W0;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        re reVar = chatActivityEnterView.D3;
        zf zfVar = chatActivityEnterView.G3;
        oe oeVar = chatActivityEnterView.G0;
        if (!chatActivityEnterView.f22779h5) {
            chatActivityEnterView.Y();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.f22814o4) {
                    boolean z4 = chatActivityEnterView.a2;
                    if (!z4 || chatActivityEnterView.F3) {
                        chatActivityEnterView.f22872z2 = -1.0f;
                        if (z4 && chatActivityEnterView.Z0) {
                            if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22769g1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.V2.p1();
                                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) {
                                    public final le f25964b;

                                    {
                                        this.f25964b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            eg egVar = chatActivityEnterView.V2;
                            if (chatActivityEnterView.L) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = 0;
                            }
                            egVar.o2(1, 0, i16, chatActivityEnterView.O4, 0L, true);
                            chatActivityEnterView.O4 = 0L;
                            oeVar.setEffect(0L);
                        } else {
                            if (chatActivityEnterView.B2 && chatActivityEnterView.c()) {
                                Activity activity = chatActivityEnterView.K2;
                                long a2 = xnVar.a();
                                k2 k2Var = new k2(9);
                                mc mcVar = new mc(1);
                                Pattern pattern = z4.f31230a;
                                org.telegram.ui.ActionBar.f6 f6Var = this.f26624c;
                                z4.K(activity, a2, -1L, 0, false, k2Var, mcVar, new x4(f6Var), f6Var);
                            }
                            if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                                if (chatActivityEnterView.Z0) {
                                    ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f22769g1;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                    chatActivityEnterView.V2.p1();
                                } else {
                                    if (chatActivityEnterView.f22814o4) {
                                        chatActivityEnterView.F3 = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                                    chatActivityEnterView.V2.b1(0);
                                    ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f22769g1;
                                    if (slideTextView3 != null) {
                                        slideTextView3.setEnabled(false);
                                    }
                                }
                                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) {
                                    public final le f25964b;

                                    {
                                        this.f25964b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
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
                            mediaController.stopRecording(i15, true, 0, chatActivityEnterView.L, 0L);
                            chatActivityEnterView.V2.b1(0);
                        }
                        chatActivityEnterView.B2 = false;
                        chatActivityEnterView.f22749d0 = false;
                        Runnable runnable = new Runnable(this) {
                            public final le f26259b;

                            {
                                this.f26259b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f26259b.d;
                                        chatActivityEnterView2.f22744c0 = null;
                                        chatActivityEnterView2.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = this.f26259b.d;
                                        chatActivityEnterView3.f22744c0 = null;
                                        chatActivityEnterView3.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f22744c0 = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                if (xnVar == null) {
                    chat = null;
                } else {
                    chat = xnVar.e;
                }
                if (xnVar == null) {
                    userFull = chatActivityEnterView.H;
                } else {
                    userFull = xnVar.X7;
                }
                if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.a2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                    chatActivityEnterView.V2.m2();
                    return true;
                } else if (chatActivityEnterView.a2) {
                    chatActivityEnterView.F3 = false;
                    chatActivityEnterView.E3 = true;
                    AndroidUtilities.runOnUIThread(zfVar, 150L);
                    return true;
                } else {
                    zfVar.run();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.B2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f22814o4;
                    if (!z10) {
                        if (!z10) {
                            if (chatActivityEnterView2.f22778h4 == -1.0f) {
                                chatActivityEnterView2.f22772g4 = y10;
                            }
                            chatActivityEnterView2.f22778h4 = y10;
                            recordCircle.invalidate();
                            if (!chatActivityEnterView2.f22809n4 && chatActivityEnterView2.f22766f4 >= 0.7f && chatActivityEnterView2.f22772g4 - chatActivityEnterView2.f22778h4 >= AndroidUtilities.dp(57.0f)) {
                                chatActivityEnterView2.f22814o4 = true;
                                ig igVar = chatActivityEnterView2.K1;
                                if (igVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    igVar.a();
                                    ph.f3 f3Var = new ph.f3(igVar.getContext(), 2);
                                    igVar.f25704a = f3Var;
                                    f3Var.m(1.0f, 0.0f);
                                    igVar.f25704a.q(true);
                                    igVar.f25704a.t(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    igVar.addView(igVar.f25704a, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    ph.f3 f3Var2 = igVar.f25704a;
                                    f3Var2.f41617i0 = new gg(igVar, f3Var2, 3);
                                    f3Var2.v();
                                }
                            } else {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.J1;
                                float f12 = x10 - recordCircle2.C;
                                float f13 = y10 - recordCircle2.D;
                                float f14 = (f13 * f13) + (f12 * f12);
                                recordCircle2.D = y10;
                                recordCircle2.C = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.f22734a4 && chatActivityEnterView3.f22747c4 == 0.0f && f14 > recordCircle2.B) {
                                    f10 = 1.0f;
                                    chatActivityEnterView3.f22741b4 = System.currentTimeMillis();
                                } else {
                                    f10 = 1.0f;
                                }
                                if (chatActivityEnterView.f22872z2 == -1.0f) {
                                    chatActivityEnterView.f22872z2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.f22781i1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.A2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.A2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = leVar.getX() + x10;
                                float f15 = chatActivityEnterView.f22872z2;
                                float f16 = ((x11 - f15) / chatActivityEnterView.A2) + f10;
                                if (f15 != -1.0f) {
                                    if (f16 > f10) {
                                        f11 = 1.0f;
                                    } else if (f16 < 0.0f) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = f16;
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f22769g1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f22889r = f11;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f11);
                                    f16 = f11;
                                }
                                if (f16 == 0.0f) {
                                    if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                                        eg egVar2 = chatActivityEnterView.V2;
                                        if (chatActivityEnterView.L) {
                                            i14 = Integer.MAX_VALUE;
                                        } else {
                                            i14 = 0;
                                        }
                                        egVar2.o2(2, 0, i14, chatActivityEnterView.O4, 0L, true);
                                        chatActivityEnterView.O4 = 0L;
                                        oeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.V2.b1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                                    }
                                    chatActivityEnterView.B2 = false;
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
            } else if (motionEvent.getAction() == 3 && chatActivityEnterView.B2) {
                if (chatActivityEnterView.f22766f4 < 0.7f) {
                    if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        eg egVar3 = chatActivityEnterView.V2;
                        if (chatActivityEnterView.L) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        egVar3.o2(2, 0, i13, chatActivityEnterView.O4, 0L, true);
                        j13 = 0;
                        chatActivityEnterView.O4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.V2.b1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                        j13 = 0;
                    }
                    chatActivityEnterView.f22763f1 = j13;
                    chatActivityEnterView.B2 = false;
                    chatActivityEnterView.L1(5, true);
                    return false;
                }
                chatActivityEnterView.f22814o4 = true;
                ChatActivityEnterView.m(chatActivityEnterView);
                return false;
            } else {
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.J1;
                if ((recordCircle3 != null && ChatActivityEnterView.this.f22814o4) || ((aeVar = chatActivityEnterView.f22738b1) != null && aeVar.getVisibility() == 0)) {
                    if (chatActivityEnterView.E3) {
                        AndroidUtilities.cancelRunOnUIThread(zfVar);
                    }
                } else if ((((leVar.getX() + motionEvent.getX()) - chatActivityEnterView.f22872z2) / chatActivityEnterView.A2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                        CameraController.getInstance().cancelOnInitRunnable(reVar);
                        eg egVar4 = chatActivityEnterView.V2;
                        if (chatActivityEnterView.L) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        egVar4.o2(2, 0, i12, chatActivityEnterView.O4, 0L, true);
                        j12 = 0;
                        chatActivityEnterView.O4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.V2.b1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                        j12 = 0;
                    }
                    chatActivityEnterView.f22763f1 = j12;
                    chatActivityEnterView.B2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                } else if (chatActivityEnterView.E3) {
                    AndroidUtilities.cancelRunOnUIThread(zfVar);
                    if (chatActivityEnterView.f22847v0 && chatActivityEnterView.f22842u0) {
                        chatActivityEnterView.V2.b0(!chatActivityEnterView.Z0);
                        chatActivityEnterView.k1(!chatActivityEnterView.Z0, true);
                    } else {
                        chatActivityEnterView.V2.m2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                } else {
                    boolean z11 = chatActivityEnterView.a2;
                    if (!z11 || chatActivityEnterView.F3) {
                        chatActivityEnterView.f22872z2 = -1.0f;
                        if (z11 && chatActivityEnterView.Z0) {
                            if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f22769g1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                chatActivityEnterView.V2.p1();
                                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) {
                                    public final le f25964b;

                                    {
                                        this.f25964b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(reVar);
                            eg egVar5 = chatActivityEnterView.V2;
                            if (chatActivityEnterView.L) {
                                i11 = Integer.MAX_VALUE;
                            } else {
                                i11 = 0;
                            }
                            egVar5.o2(1, 0, i11, chatActivityEnterView.O4, 0L, true);
                            j10 = 0;
                            chatActivityEnterView.O4 = 0L;
                            oeVar.setEffect(0L);
                        } else {
                            j10 = 0;
                            if (!chatActivityEnterView.f22847v0) {
                                chatActivityEnterView.V2.m2();
                            } else if (z4.d0(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                                if (chatActivityEnterView.f22814o4) {
                                    chatActivityEnterView.F3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                                chatActivityEnterView.V2.b1(0);
                                ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f22769g1;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new Utilities.Callback(this) {
                                    public final le f25964b;

                                    {
                                        this.f25964b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (r2) {
                                            case 0:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 1:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            case 2:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                            default:
                                                this.f25964b.d.T0(0, true, 0, false, l10.longValue());
                                                return;
                                        }
                                    }
                                });
                                return true;
                            } else {
                                if (chatActivityEnterView.B2 && chatActivityEnterView.c()) {
                                    Activity activity2 = chatActivityEnterView.K2;
                                    long a10 = xnVar.a();
                                    k2 k2Var2 = new k2(10);
                                    mc mcVar2 = new mc(2);
                                    org.telegram.ui.ActionBar.f6 f6Var2 = this.f26624c;
                                    z4.K(activity2, a10, -1L, 0, false, k2Var2, mcVar2, new x4(f6Var2), f6Var2);
                                }
                                chatActivityEnterView.V2.b1(0);
                                MediaController mediaController2 = MediaController.getInstance();
                                if (chatActivityEnterView.c()) {
                                    i10 = 3;
                                } else {
                                    i10 = 1;
                                }
                                mediaController2.stopRecording(i10, true, 0, chatActivityEnterView.L, 0L);
                            }
                        }
                        chatActivityEnterView.B2 = false;
                        chatActivityEnterView.f22749d0 = false;
                        Runnable runnable2 = new Runnable(this) {
                            public final le f26259b;

                            {
                                this.f26259b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView22 = this.f26259b.d;
                                        chatActivityEnterView22.f22744c0 = null;
                                        chatActivityEnterView22.L1(1, true);
                                        return;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView32 = this.f26259b.d;
                                        chatActivityEnterView32.f22744c0 = null;
                                        chatActivityEnterView32.L1(1, true);
                                        return;
                                }
                            }
                        };
                        chatActivityEnterView.f22744c0 = runnable2;
                        if (chatActivityEnterView.f22846u4) {
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
