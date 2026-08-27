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

public final class he extends FrameLayout {

    public final Paint f28982a;

    public final RectF f28983b;

    public final org.telegram.ui.ActionBar.c6 f28984c;
    public final ChatActivityEnterView d;

    public he(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f28984c = c6Var;
        this.f28982a = new Paint(1);
        this.f28983b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.W0) {
            oe oeVar = chatActivityEnterView.O0;
            float alpha = 1.0f;
            if (oeVar != null && oeVar.getVisibility() == 0) {
                alpha = 1.0f - chatActivityEnterView.O0.getAlpha();
            }
            float fDpf2 = AndroidUtilities.dpf2(19.0f);
            int iI0 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.Yd);
            Paint paint = this.f28982a;
            paint.setColor(iI0);
            float fDpf3 = AndroidUtilities.dpf2(3.0f);
            float fDpf4 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - fDpf3;
            float measuredHeight = (getMeasuredHeight() - fDpf4) - fDpf3;
            float measuredWidth2 = getMeasuredWidth() - fDpf3;
            float measuredHeight2 = getMeasuredHeight() - fDpf3;
            RectF rectF = this.f28983b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(alpha, alpha, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, fDpf2, fDpf2, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.d.f26115g5;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wd wdVar;
        long j10;
        long j11;
        long j12;
        ChatActivityEnterView chatActivityEnterView = this.d;
        he heVar = chatActivityEnterView.V0;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        ne neVar = chatActivityEnterView.C3;
        vf vfVar = chatActivityEnterView.F3;
        ke keVar = chatActivityEnterView.F0;
        final int i10 = 0;
        if (!chatActivityEnterView.f26115g5) {
            chatActivityEnterView.Y();
            final int i11 = 2;
            final int i12 = 3;
            final int i13 = 1;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.f26150n4) {
                    TLRPC.Chat chat = rnVar == null ? null : rnVar.f42026e;
                    TLRPC.UserFull userFull = rnVar == null ? chatActivityEnterView.G : rnVar.W7;
                    if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.Z1)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.U2.U1();
                        return true;
                    }
                    if (!chatActivityEnterView.Z1) {
                        vfVar.run();
                        return true;
                    }
                    chatActivityEnterView.E3 = false;
                    chatActivityEnterView.D3 = true;
                    AndroidUtilities.runOnUIThread(vfVar, 150L);
                    return true;
                }
                boolean z10 = chatActivityEnterView.Z1;
                if (!z10 || chatActivityEnterView.E3) {
                    chatActivityEnterView.f26207y2 = -1.0f;
                    if (!z10 || !chatActivityEnterView.Y0) {
                        if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.J2;
                            long jA = rnVar.a();
                            c2 c2Var = new c2(15);
                            gc gcVar = new gc(i11);
                            Pattern pattern = y4.f34802a;
                            org.telegram.ui.ActionBar.c6 c6Var = this.f28984c;
                            y4.K(activity, jA, -1L, 0, false, c2Var, gcVar, new w4(c6Var), c6Var);
                        }
                        if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                            if (chatActivityEnterView.Y0) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26105f1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.U2.f1();
                            } else {
                                if (chatActivityEnterView.f26150n4) {
                                    chatActivityEnterView.E3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                chatActivityEnterView.U2.N0(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f26105f1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {

                                public final he f28380b;

                                {
                                    this.f28380b = this;
                                }

                                @Override
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i13) {
                                        case 0:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 1:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 2:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        default:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.K, 0L);
                        chatActivityEnterView.U2.N0(0);
                    } else {
                        if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f26105f1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.U2.f1();
                            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {

                                public final he f28380b;

                                {
                                    this.f28380b = this;
                                }

                                @Override
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 1:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 2:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        default:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.U2.X1(1, 0, chatActivityEnterView.K ? Integer.MAX_VALUE : 0, chatActivityEnterView.N4, 0L, true);
                        chatActivityEnterView.N4 = 0L;
                        keVar.setEffect(0L);
                    }
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.f26084c0 = false;
                    Runnable runnable = new Runnable(this) {

                        public final he f28600b;

                        {
                            this.f28600b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.f28600b.d;
                                    chatActivityEnterView2.f26077b0 = null;
                                    chatActivityEnterView2.K1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.f28600b.d;
                                    chatActivityEnterView3.f26077b0 = null;
                                    chatActivityEnterView3.K1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f26077b0 = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            float f10 = 1.0f;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.A2) {
                    float x8 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.f26150n4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.f26114g4 == -1.0f) {
                                chatActivityEnterView2.f26108f4 = y10;
                            }
                            chatActivityEnterView2.f26114g4 = y10;
                            recordCircle.invalidate();
                            if (chatActivityEnterView2.f26144m4 || chatActivityEnterView2.f26101e4 < 0.7f || chatActivityEnterView2.f26108f4 - chatActivityEnterView2.f26114g4 < AndroidUtilities.dp(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                                float f11 = x8 - recordCircle2.B;
                                float f12 = y10 - recordCircle2.C;
                                float f13 = (f12 * f12) + (f11 * f11);
                                recordCircle2.C = y10;
                                recordCircle2.B = x8;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.Z3 && chatActivityEnterView3.f26081b4 == 0.0f && f13 > recordCircle2.A) {
                                    chatActivityEnterView3.f26074a4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.f26207y2 == -1.0f) {
                                    chatActivityEnterView.f26207y2 = x8;
                                    float measuredWidth = (float) (((double) chatActivityEnterView.f26117h1.getMeasuredWidth()) * 0.35d);
                                    chatActivityEnterView.f26212z2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.f26212z2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x10 = heVar.getX() + x8;
                                float f14 = chatActivityEnterView.f26207y2;
                                float f15 = ((x10 - f14) / chatActivityEnterView.f26212z2) + 1.0f;
                                if (f14 != -1.0f) {
                                    if (f15 <= 1.0f) {
                                        f10 = f15 < 0.0f ? 0.0f : f15;
                                    }
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f26105f1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.f26232r = f10;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f10);
                                    f15 = f10;
                                }
                                if (f15 == 0.0f) {
                                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                                        CameraController.getInstance().cancelOnInitRunnable(neVar);
                                        chatActivityEnterView.U2.X1(2, 0, chatActivityEnterView.K ? Integer.MAX_VALUE : 0, chatActivityEnterView.N4, 0L, true);
                                        chatActivityEnterView.N4 = 0L;
                                        keVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.U2.N0(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                                    }
                                    chatActivityEnterView.A2 = false;
                                    chatActivityEnterView.K1(5, true);
                                    return true;
                                }
                            } else {
                                chatActivityEnterView2.f26150n4 = true;
                                eg egVar = chatActivityEnterView2.J1;
                                if (egVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    egVar.a();
                                    lh.w3 w3Var = new lh.w3(egVar.getContext(), 2);
                                    egVar.f28041a = w3Var;
                                    w3Var.m(1.0f, 0.0f);
                                    egVar.f28041a.q(true);
                                    egVar.f28041a.t(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    egVar.addView(egVar.f28041a, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    lh.w3 w3Var2 = egVar.f28041a;
                                    w3Var2.f16984h0 = new cg(egVar, w3Var2, 3);
                                    w3Var2.v();
                                }
                            }
                        }
                        ChatActivityEnterView.m(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            }
            if (motionEvent.getAction() == 3 && chatActivityEnterView.A2) {
                if (chatActivityEnterView.f26101e4 >= 0.7f) {
                    chatActivityEnterView.f26150n4 = true;
                    ChatActivityEnterView.m(chatActivityEnterView);
                    return false;
                }
                if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                    CameraController.getInstance().cancelOnInitRunnable(neVar);
                    chatActivityEnterView.U2.X1(2, 0, chatActivityEnterView.K ? Integer.MAX_VALUE : 0, chatActivityEnterView.N4, 0L, true);
                    j12 = 0;
                    chatActivityEnterView.N4 = 0L;
                    keVar.setEffect(0L);
                } else {
                    chatActivityEnterView.U2.N0(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                    j12 = 0;
                }
                chatActivityEnterView.f26098e1 = j12;
                chatActivityEnterView.A2 = false;
                chatActivityEnterView.K1(5, true);
                return false;
            }
            ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.I1;
            if ((recordCircle3 == null || !ChatActivityEnterView.this.f26150n4) && ((wdVar = chatActivityEnterView.f26073a1) == null || wdVar.getVisibility() != 0)) {
                if ((((heVar.getX() + motionEvent.getX()) - chatActivityEnterView.f26207y2) / chatActivityEnterView.f26212z2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                        CameraController.getInstance().cancelOnInitRunnable(neVar);
                        chatActivityEnterView.U2.X1(2, 0, chatActivityEnterView.K ? Integer.MAX_VALUE : 0, chatActivityEnterView.N4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.N4 = 0L;
                        keVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.U2.N0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.f26098e1 = j11;
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.K1(5, true);
                    return true;
                }
                if (chatActivityEnterView.D3) {
                    AndroidUtilities.cancelRunOnUIThread(vfVar);
                    if (chatActivityEnterView.f26183u0 && chatActivityEnterView.f26178t0) {
                        chatActivityEnterView.U2.G(!chatActivityEnterView.Y0);
                        chatActivityEnterView.j1(!chatActivityEnterView.Y0, true);
                    } else {
                        chatActivityEnterView.U2.U1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z12 = chatActivityEnterView.Z1;
                if (!z12 || chatActivityEnterView.E3) {
                    chatActivityEnterView.f26207y2 = -1.0f;
                    if (!z12 || !chatActivityEnterView.Y0) {
                        j10 = 0;
                        if (!chatActivityEnterView.f26183u0) {
                            chatActivityEnterView.U2.U1();
                        } else {
                            if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                if (chatActivityEnterView.f26150n4) {
                                    chatActivityEnterView.E3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                chatActivityEnterView.U2.N0(0);
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f26105f1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {

                                    public final he f28380b;

                                    {
                                        this.f28380b = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (i12) {
                                            case 0:
                                                this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                            case 1:
                                                this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                            case 2:
                                                this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                            default:
                                                this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.J2;
                                long jA2 = rnVar.a();
                                c2 c2Var2 = new c2(16);
                                gc gcVar2 = new gc(i12);
                                org.telegram.ui.ActionBar.c6 c6Var2 = this.f28984c;
                                y4.K(activity2, jA2, -1L, 0, false, c2Var2, gcVar2, new w4(c6Var2), c6Var2);
                            }
                            chatActivityEnterView.U2.N0(0);
                            MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.K, 0L);
                        }
                    } else {
                        if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                            ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f26105f1;
                            if (slideTextView6 != null) {
                                slideTextView6.setEnabled(false);
                            }
                            chatActivityEnterView.U2.f1();
                            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) {

                                public final he f28380b;

                                {
                                    this.f28380b = this;
                                }

                                @Override
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i11) {
                                        case 0:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 1:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 2:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        default:
                                            this.f28380b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(neVar);
                        chatActivityEnterView.U2.X1(1, 0, chatActivityEnterView.K ? Integer.MAX_VALUE : 0, chatActivityEnterView.N4, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.N4 = 0L;
                        keVar.setEffect(0L);
                    }
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.f26084c0 = false;
                    Runnable runnable2 = new Runnable(this) {

                        public final he f28600b;

                        {
                            this.f28600b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView4 = this.f28600b.d;
                                    chatActivityEnterView4.f26077b0 = null;
                                    chatActivityEnterView4.K1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView5 = this.f28600b.d;
                                    chatActivityEnterView5.f26077b0 = null;
                                    chatActivityEnterView5.K1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f26077b0 = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, chatActivityEnterView.f26182t4 ? 500L : j10);
                    return true;
                }
                return true;
            }
            if (chatActivityEnterView.D3) {
                AndroidUtilities.cancelRunOnUIThread(vfVar);
            }
        }
        return false;
    }
}
