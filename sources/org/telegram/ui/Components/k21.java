package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.StateSet;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public abstract class k21 {
    public static final int[] N = {16842910, 16842919};
    public static HashMap O;
    public static HashMap P;
    public static ArrayList Q;
    public Path C;
    public int D;
    public int E;
    public float F;
    public float G;
    public Paint H;
    public Paint I;
    public Paint J;
    public float K;
    public Path L;
    public float[] M;

    public int f29906a;

    public int f29907b;

    public int f29908c;
    public int d;

    public float f29909e;

    public Paint f29910f;

    public Paint f29911g;
    public Path h;

    public boolean f29912i;

    public final y5 f29913j;

    public boolean f29914k;

    public final y5 f29915l;

    public int f29916m;

    public final oi0 f29917n;

    public int f29918o;

    public final oi0 f29919p;

    public org.telegram.ui.Cells.z f29920q;

    public final org.telegram.ui.Cells.s1 f29921r;

    public final sn0 f29922s;

    public final Rect f29924u;
    public final Rect v;

    public final boolean f29926x;

    public boolean f29927y;

    public boolean f29928z;

    public boolean f29925w = false;
    public boolean A = false;
    public final u1.a B = new u1.a();

    public long f29923t = SystemClock.elapsedRealtime();

    public k21(org.telegram.ui.Cells.s1 s1Var, sn0 sn0Var) {
        boolean z10 = false;
        this.f29921r = s1Var;
        this.f29922s = sn0Var;
        Rect rect = new Rect(0, 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        this.f29924u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        oi0 oi0Var = new oi0(R.raw.transcribe_out, AndroidUtilities.dp(26.0f), "transcribe_out", AndroidUtilities.dp(26.0f));
        this.f29919p = oi0Var;
        oi0Var.K(0);
        oi0Var.setCallback(s1Var);
        final int i10 = 0;
        oi0Var.P(19, new Runnable(this) {

            public final k21 f29211b;

            {
                this.f29211b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        k21 k21Var = this.f29211b;
                        k21Var.f29919p.stop();
                        oi0 oi0Var2 = k21Var.f29917n;
                        oi0Var2.stop();
                        k21Var.f29928z = true;
                        k21Var.f29927y = true;
                        oi0Var2.K(0);
                        break;
                    default:
                        k21 k21Var2 = this.f29211b;
                        k21Var2.f29917n.stop();
                        oi0 oi0Var3 = k21Var2.f29919p;
                        oi0Var3.stop();
                        k21Var2.f29928z = false;
                        k21Var2.f29927y = false;
                        oi0Var3.K(0);
                        break;
                }
            }
        });
        oi0Var.H(true);
        oi0 oi0Var2 = new oi0(R.raw.transcribe_in, AndroidUtilities.dp(26.0f), "transcribe_in", AndroidUtilities.dp(26.0f));
        this.f29917n = oi0Var2;
        oi0Var2.K(0);
        oi0Var2.setCallback(s1Var);
        oi0Var2.f31328r0 = s1Var;
        final int i11 = 1;
        oi0Var2.P(19, new Runnable(this) {

            public final k21 f29211b;

            {
                this.f29211b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        k21 k21Var = this.f29211b;
                        k21Var.f29919p.stop();
                        oi0 oi0Var3 = k21Var.f29917n;
                        oi0Var3.stop();
                        k21Var.f29928z = true;
                        k21Var.f29927y = true;
                        oi0Var3.K(0);
                        break;
                    default:
                        k21 k21Var2 = this.f29211b;
                        k21Var2.f29917n.stop();
                        oi0 oi0Var4 = k21Var2.f29919p;
                        oi0Var4.stop();
                        k21Var2.f29928z = false;
                        k21Var2.f29927y = false;
                        oi0Var4.K(0);
                        break;
                }
            }
        });
        oi0Var2.H(true);
        this.f29927y = false;
        this.f29928z = false;
        if (s1Var.getMessageObject() != null && UserConfig.getInstance(s1Var.getMessageObject().currentAccount).isPremium()) {
            z10 = true;
        }
        this.f29926x = z10;
        er erVar = er.h;
        this.f29915l = new y5(s1Var, 250L, erVar);
        this.f29913j = new y5(s1Var, 250L, erVar);
    }

    public static void a(Path path, int i10, int i11, int i12, int i13, float f10, float f11) {
        float fA = h7.n.a(f10, 0.0f, 1.0f);
        float fA2 = h7.n.a(f11, 0.0f, 1.0f) - fA;
        if (fA2 <= 0.0f) {
            return;
        }
        if (i13 == 1) {
            AndroidUtilities.rectTmp.set(i10 - i12, i11, i10, i11 + i12);
        } else if (i13 == 2) {
            AndroidUtilities.rectTmp.set(i10 - i12, i11 - i12, i10, i11);
        } else if (i13 == 3) {
            AndroidUtilities.rectTmp.set(i10, i11 - i12, i10 + i12, i11);
        } else if (i13 == 4) {
            AndroidUtilities.rectTmp.set(i10, i11, i10 + i12, i11 + i12);
        }
        path.addArc(AndroidUtilities.rectTmp, (fA * 90.0f) + ((i13 * 90) - 180), fA2 * 90.0f);
    }

    public static void b(Path path, int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
        if (f10 <= f11) {
            float f14 = f13 - f12;
            a(path, i10, i11, i12, i13, Math.max(0.0f, f10 - f12) / f14, (Math.min(f11, f13) - f12) / f14);
        } else {
            float f15 = f13 - f12;
            a(path, i10, i11, i12, i13, (f10 - f12) / f15, 1.0f);
            a(path, i10, i11, i12, i13, 0.0f, (f11 - f12) / f15);
        }
    }

    public static void c(Path path, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float fA = h7.n.a(f10, 0.0f, 1.0f);
        float fA2 = h7.n.a(f11, 0.0f, 1.0f);
        if (fA2 - fA <= 0.0f) {
            return;
        }
        path.moveTo(AndroidUtilities.lerp(i10, i12, fA), AndroidUtilities.lerp(i11, i13, fA));
        path.lineTo(AndroidUtilities.lerp(i10, i12, fA2), AndroidUtilities.lerp(i11, i13, fA2));
    }

    public static void d(Path path, int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        if (f10 <= f11) {
            float f14 = f13 - f12;
            c(path, i10, i11, i12, i13, Math.max(0.0f, f10 - f12) / f14, (Math.min(f11, f13) - f12) / f14);
        } else {
            float f15 = f13 - f12;
            c(path, i10, i11, i12, i13, (f10 - f12) / f15, 1.0f);
            c(path, i10, i11, i12, i13, 0.0f, (f11 - f12) / f15);
        }
    }

    public static boolean e(MessageObject messageObject) {
        if (messageObject != null && messageObject.messageOwner != null) {
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(messageObject.currentAccount);
            MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
            if (j(messageObject)) {
                return true;
            }
            if (messagesController.transcribeAudioTrialWeeklyNumber > 0 && messageObject.getDuration() <= messagesController.transcribeAudioTrialDurationMax) {
                return messagesController.transcribeAudioTrialCooldownUntil == 0 || connectionsManager.getCurrentTime() > messagesController.transcribeAudioTrialCooldownUntil || messagesController.transcribeAudioTrialCurrentNumber > 0;
            }
        }
        return false;
    }

    public static boolean g(MessageObject messageObject, long j10, String str) {
        try {
            HashMap map = O;
            MessageObject messageObject2 = messageObject == null ? (map == null || !map.containsKey(Long.valueOf(j10))) ? null : (MessageObject) O.remove(Long.valueOf(j10)) : messageObject;
            if (messageObject2 != null && messageObject2.messageOwner != null) {
                HashMap map2 = P;
                if (map2 != null) {
                    map2.remove(Integer.valueOf(o(messageObject2)));
                }
                messageObject2.messageOwner.voiceTranscriptionFinal = true;
                MessagesStorage.getInstance(messageObject2.currentAccount).updateMessageVoiceTranscription(messageObject2.getDialogId(), messageObject2.getId(), str, messageObject2.messageOwner);
                AndroidUtilities.runOnUIThread(new f21(str, messageObject2, j10, 0));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int h(int i10) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        MessagesController messagesController = MessagesController.getInstance(i10);
        if (messagesController.transcribeAudioTrialWeeklyNumber <= 0) {
            return 0;
        }
        return (messagesController.transcribeAudioTrialCooldownUntil == 0 || connectionsManager.getCurrentTime() > messagesController.transcribeAudioTrialCooldownUntil) ? messagesController.transcribeAudioTrialWeeklyNumber : messagesController.transcribeAudioTrialCurrentNumber;
    }

    public static boolean j(MessageObject messageObject) {
        if (messageObject != null && messageObject.messageOwner != null) {
            MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
            if (ChatObject.isMegagroup(chat) && chat.level >= messagesController.groupTranscribeLevelMin) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(MessageObject messageObject) {
        TLRPC.Message message;
        HashMap map = P;
        if (map != null && (map.containsValue(messageObject) || P.containsKey(Integer.valueOf(o(messageObject))))) {
            return true;
        }
        HashMap map2 = O;
        return (map2 == null || messageObject == null || (message = messageObject.messageOwner) == null || !map2.containsKey(Long.valueOf(message.voiceTranscriptionId))) ? false : true;
    }

    public static boolean l(MessageObject messageObject) {
        if (Q != null) {
            return !messageObject.isRoundVideo() || Q.contains(Integer.valueOf(o(messageObject)));
        }
        return false;
    }

    public static void n(MessageObject messageObject) {
        if (messageObject == null || l(messageObject)) {
            return;
        }
        if (Q == null) {
            Q = new ArrayList(1);
        }
        Q.add(Integer.valueOf(o(messageObject)));
    }

    public static int o(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(messageObject.currentAccount), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    public static void u(MessageObject messageObject, boolean z10) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return;
        }
        message.voiceTranscriptionForce = true;
        MessagesStorage.getInstance(messageObject.currentAccount).updateMessageVoiceTranscriptionOpen(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner);
        if (z10) {
            AndroidUtilities.runOnUIThread(new up0(messageObject, 20));
        }
    }

    public static boolean v(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null || j(messageObject) || !TextUtils.isEmpty(messageObject.messageOwner.voiceTranscription)) {
            return false;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(messageObject.currentAccount);
        MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
        return !UserConfig.getInstance(messageObject.currentAccount).isPremium() && messagesController.transcribeAudioTrialCooldownUntil != 0 && connectionsManager.getCurrentTime() <= messagesController.transcribeAudioTrialCooldownUntil && messagesController.transcribeAudioTrialCurrentNumber <= 0;
    }

    public static void w(final MessageObject messageObject, boolean z10, final org.telegram.ui.Cells.j1 j1Var) {
        if (messageObject == null || messageObject.messageOwner == null || !messageObject.isSent()) {
            return;
        }
        final int i10 = messageObject.currentAccount;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(messageObject.messageOwner.peer_id);
        final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        TLRPC.Message message = messageObject.messageOwner;
        final int i11 = message.f22401id;
        if (!z10) {
            HashMap map = P;
            if (map != null) {
                map.remove(Integer.valueOf(o(messageObject)));
            }
            messageObject.messageOwner.voiceTranscriptionOpen = false;
            MessagesStorage.getInstance(i10).updateMessageVoiceTranscriptionOpen(peerDialogId, i11, messageObject.messageOwner);
            final int i12 = 1;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    int i13 = i12;
                    MessageObject messageObject2 = messageObject;
                    int i14 = i10;
                    switch (i13) {
                        case 0:
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                            int i15 = NotificationCenter.voiceTranscriptionUpdate;
                            Boolean bool = Boolean.TRUE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, messageObject2, null, null, bool, bool);
                            break;
                        default:
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
            n(messageObject);
            messageObject.messageOwner.voiceTranscriptionOpen = true;
            MessagesStorage.getInstance(i10).updateMessageVoiceTranscriptionOpen(peerDialogId, i11, messageObject.messageOwner);
            final int i13 = 0;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    int i14 = i13;
                    MessageObject messageObject2 = messageObject;
                    int i15 = i10;
                    switch (i14) {
                        case 0:
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i15);
                            int i16 = NotificationCenter.voiceTranscriptionUpdate;
                            Boolean bool = Boolean.TRUE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, messageObject2, null, null, bool, bool);
                            break;
                        default:
                            NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sending Transcription request, msg_id=" + i11 + " dialog_id=" + peerDialogId);
        }
        TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
        tL_messages_transcribeAudio.peer = inputPeer;
        tL_messages_transcribeAudio.msg_id = i11;
        if (P == null) {
            P = new HashMap();
        }
        P.put(Integer.valueOf(o(messageObject)), messageObject);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                long j10;
                boolean z11;
                String str;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                int i14 = i10;
                org.telegram.ui.Cells.j1 j1Var2 = j1Var;
                MessageObject messageObject2 = messageObject;
                String str2 = "";
                if (z12) {
                    TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                    String str3 = tL_messages_transcribedAudio.text;
                    j10 = tL_messages_transcribedAudio.transcription_id;
                    boolean z13 = tL_messages_transcribedAudio.pending;
                    z11 = !z13;
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    } else if (z13) {
                        str2 = null;
                    }
                    if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                        MessagesController.getInstance(i14).updateTranscribeAudioTrialCurrentNumber(tL_messages_transcribedAudio.trial_remains_num);
                        MessagesController.getInstance(i14).updateTranscribeAudioTrialCooldownUntil(tL_messages_transcribedAudio.trial_remains_until_date);
                        AndroidUtilities.runOnUIThread(new lg0(21, j1Var2, tL_messages_transcribedAudio));
                    }
                    if (k21.O == null) {
                        k21.O = new HashMap();
                    }
                    k21.O.put(Long.valueOf(j10), messageObject2);
                    messageObject2.messageOwner.voiceTranscriptionId = j10;
                } else {
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        MessagesController.getInstance(i14).updateTranscribeAudioTrialCurrentNumber(0);
                        MessagesController.getInstance(i14).updateTranscribeAudioTrialCooldownUntil(Utilities.parseInt((CharSequence) tL_error.text).intValue() + ConnectionsManager.getInstance(i14).getCurrentTime());
                        AndroidUtilities.runOnUIThread(new km(messageObject2, j1Var2, i14, 24));
                        return;
                    }
                    j10 = 0;
                    z11 = true;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                k21.n(messageObject2);
                TLRPC.Message message2 = messageObject2.messageOwner;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionFinal = z11;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("Transcription request sent, received final=" + z11 + " id=" + j10 + " text=" + str2);
                }
                String str4 = str2;
                MessagesStorage.getInstance(i14).updateMessageVoiceTranscription(peerDialogId, i11, str4, messageObject2.messageOwner);
                if (z11) {
                    AndroidUtilities.runOnUIThread(new f21(str4, messageObject2, j10, 1), Math.max(0L, 350 - jElapsedRealtime2));
                }
            }
        }, !UserConfig.getInstance(i10).isPremium() ? 1024 : 0);
    }

    public final void f(Canvas canvas, float f10) {
        float f11;
        Rect rect = this.f29924u;
        this.v.set(rect.left - AndroidUtilities.dp(8.0f), rect.top - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + rect.right, AndroidUtilities.dp(8.0f) + rect.bottom);
        Path path = this.C;
        if (path == null) {
            this.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        Path path2 = this.C;
        float f12 = this.D;
        path2.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.C);
        float f13 = this.f29909e * f10;
        if (f13 > 0.0f) {
            org.telegram.ui.Cells.s1 s1Var = ((org.telegram.ui.Cells.h1) this).R;
            Paint paintL2 = s1Var.f25546u7.shouldDrawWithoutBackground() ? s1Var.L2("paintChatActionBackground") : s1Var.L2("paintChatTimeBackground");
            int alpha = paintL2.getAlpha();
            paintL2.setAlpha((int) (alpha * f13));
            s1Var.o0();
            canvas.drawRect(rect, paintL2);
            if (paintL2 == s1Var.L2("paintChatActionBackground") && s1Var.Q2()) {
                int alpha2 = org.telegram.ui.ActionBar.g6.f23121h2.getAlpha();
                org.telegram.ui.ActionBar.g6.f23121h2.setAlpha((int) (alpha2 * f13));
                canvas.drawRect(rect, org.telegram.ui.ActionBar.g6.f23121h2);
                org.telegram.ui.ActionBar.g6.f23121h2.setAlpha(alpha2);
            }
            paintL2.setAlpha(alpha);
        }
        Paint paint = this.f29910f;
        if (paint != null) {
            int alpha3 = paint.getAlpha();
            this.f29910f.setAlpha((int) (alpha3 * f10));
            canvas.drawRect(rect, this.f29910f);
            this.f29910f.setAlpha(alpha3);
        }
        org.telegram.ui.Cells.z zVar = this.f29920q;
        if (zVar != null) {
            zVar.setBounds(rect);
            this.f29920q.draw(canvas);
        }
        canvas.restore();
        float fD = this.f29915l.d(this.f29914k ? 1.0f : 0.0f, false);
        if (fD > 0.0f) {
            long jElapsedRealtime = (long) ((SystemClock.elapsedRealtime() - this.f29923t) * 0.75f);
            if (this.M == null) {
                this.M = new float[2];
            }
            long j10 = jElapsedRealtime % 5400;
            float[] fArr = this.M;
            float f14 = (1520 * j10) / 5400.0f;
            fArr[0] = f14 - 20.0f;
            fArr[1] = f14;
            for (int i10 = 0; i10 < 4; i10++) {
                float[] fArr2 = this.M;
                float f15 = fArr2[1];
                int i11 = i10 * 1350;
                u1.a aVar = this.B;
                fArr2[1] = (aVar.getInterpolation((j10 - ((long) i11)) / 667.0f) * 250.0f) + f15;
                float[] fArr3 = this.M;
                fArr3[0] = (aVar.getInterpolation((j10 - ((long) (i11 + 667))) / 667.0f) * 250.0f) + fArr3[0];
            }
            f11 = 1.0f;
            float[] fArr4 = this.M;
            Path path3 = this.h;
            if (path3 == null) {
                this.h = new Path();
            } else {
                path3.rewind();
            }
            float fMax = Math.max(40.0f * fD, fArr4[1] - fArr4[0]);
            float f16 = ((1.0f - fD) * fMax * (this.f29914k ? 0.0f : 1.0f)) + fArr4[0];
            float f17 = (fMax * fD) + f16;
            float f18 = f16 % 360.0f;
            float f19 = f17 % 360.0f;
            if (f18 < 0.0f) {
                f18 += 360.0f;
            }
            float f20 = f18;
            if (f19 < 0.0f) {
                f19 += 360.0f;
            }
            float f21 = f19;
            Path path4 = this.h;
            int iCenterX = rect.centerX();
            int i12 = rect.top;
            d(path4, iCenterX, i12, rect.right - this.D, i12, f20, f21, 0.0f, this.F);
            b(this.h, rect.right, rect.top, this.E, 1, f20, f21, this.F, this.G);
            Path path5 = this.h;
            int i13 = rect.right;
            int i14 = rect.top;
            int i15 = this.D;
            int i16 = i14 + i15;
            int i17 = rect.bottom - i15;
            float f22 = this.G;
            d(path5, i13, i16, i13, i17, f20, f21, f22, 180.0f - f22);
            b(this.h, rect.right, rect.bottom, this.E, 2, f20, f21, 180.0f - this.G, 180.0f - this.F);
            Path path6 = this.h;
            int i18 = rect.right;
            int i19 = this.D;
            int i20 = i18 - i19;
            int i21 = rect.bottom;
            int i22 = rect.left + i19;
            float f23 = this.F;
            d(path6, i20, i21, i22, i21, f20, f21, 180.0f - f23, f23 + 180.0f);
            b(this.h, rect.left, rect.bottom, this.E, 3, f20, f21, this.F + 180.0f, this.G + 180.0f);
            Path path7 = this.h;
            int i23 = rect.left;
            int i24 = rect.bottom;
            int i25 = this.D;
            int i26 = i24 - i25;
            int i27 = rect.top + i25;
            float f24 = this.G;
            d(path7, i23, i26, i23, i27, f20, f21, f24 + 180.0f, 360.0f - f24);
            b(this.h, rect.left, rect.top, this.E, 4, f20, f21, 360.0f - this.G, 360.0f - this.F);
            d(this.h, rect.left + this.D, rect.top, rect.centerX(), rect.top, f20, f21, 360.0f - this.F, 360.0f);
            this.f29911g.setStrokeWidth(AndroidUtilities.dp(1.5f));
            int alpha4 = this.f29911g.getAlpha();
            this.f29911g.setAlpha((int) (alpha4 * f10));
            canvas.drawPath(this.h, this.f29911g);
            this.f29911g.setAlpha(alpha4);
            this.f29921r.invalidate();
        } else {
            f11 = 1.0f;
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-13.0f) + rect.centerX(), AndroidUtilities.dp(-13.0f) + rect.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), 255, 31);
        if (this.f29927y) {
            int i28 = (int) (this.f29916m * f10);
            oi0 oi0Var = this.f29917n;
            oi0Var.setAlpha(i28);
            oi0Var.draw(canvas);
        } else {
            int i29 = (int) (this.f29918o * f10);
            oi0 oi0Var2 = this.f29919p;
            oi0Var2.setAlpha(i29);
            oi0Var2.draw(canvas);
        }
        float fE = this.f29913j.e((!this.f29912i || this.f29927y || this.f29914k) ? false : true);
        if (fE > 0.0f) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
            if (this.H == null) {
                Paint paint2 = new Paint(1);
                this.H = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, -AndroidUtilities.dp(0.4f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.733f));
            canvas.scale(fE, fE, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.H);
            if (this.I == null) {
                this.I = new Paint(1);
            }
            this.I.setColor(this.f29908c);
            int i30 = (int) (fE * 255.0f);
            this.I.setAlpha(i30);
            rectF2.set(0.0f, AndroidUtilities.dp(3.33f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.33f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), this.I);
            if (this.L == null || Math.abs(this.K - AndroidUtilities.density) > 0.1f) {
                this.K = AndroidUtilities.density;
                Path path8 = new Path();
                this.L = path8;
                path8.moveTo(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(3.33f));
                this.L.lineTo(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(2.0f));
                rectF2.set(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(0.33f), AndroidUtilities.dp(4.99f), AndroidUtilities.dp(3.6599998f));
                this.L.arcTo(rectF2, -180.0f, 180.0f, false);
                this.L.lineTo(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.33f));
            }
            if (this.J == null) {
                Paint paint3 = new Paint(1);
                this.J = paint3;
                paint3.setStyle(Paint.Style.STROKE);
            }
            this.J.setStrokeWidth(AndroidUtilities.dp(f11));
            this.J.setColor(this.f29908c);
            this.J.setAlpha(i30);
            canvas.drawPath(this.L, this.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
    }

    public final int i() {
        return this.f29924u.height();
    }

    public final void m() {
        boolean z10;
        org.telegram.ui.Cells.s1 s1Var = this.f29921r;
        if (s1Var == null) {
            return;
        }
        this.f29925w = false;
        boolean z11 = this.f29928z;
        boolean z12 = !z11;
        boolean z13 = this.f29926x;
        if (z11) {
            t(false, true);
            r(false, true);
            z10 = true;
        } else {
            z10 = !this.f29914k;
            if ((z13 || e(s1Var.getMessageObject())) && s1Var.getMessageObject().isSent()) {
                r(true, true);
            }
        }
        org.telegram.ui.Cells.z zVar = this.f29920q;
        if (zVar != null) {
            zVar.setState(StateSet.NOTHING);
            s1Var.invalidate();
        }
        this.A = false;
        if (z10) {
            if (z13 || z11) {
                if (!z11) {
                    this.f29925w = true;
                }
                w(s1Var.getMessageObject(), z12, s1Var.getDelegate());
            } else if (e(s1Var.getMessageObject()) || !(s1Var.getMessageObject() == null || s1Var.getMessageObject().messageOwner == null || TextUtils.isEmpty(s1Var.getMessageObject().messageOwner.voiceTranscription))) {
                w(s1Var.getMessageObject(), z12, s1Var.getDelegate());
            } else if (s1Var.getDelegate() != null) {
                if (MessagesController.getInstance(s1Var.E7).transcribeAudioTrialWeeklyNumber > 0) {
                    s1Var.getDelegate().i0(3);
                } else {
                    s1Var.getDelegate().i0(0);
                }
            }
        }
    }

    public final void p(int i10, int i11, int i12, int i13, int i14) {
        Rect rect = this.f29924u;
        if (i12 != rect.width() || i13 != rect.height()) {
            float f10 = i12 / 2.0f;
            float f11 = i14;
            float f12 = i13 / 2.0f;
            this.F = (float) ((Math.atan((f10 - f11) / f12) * 180.0d) / 3.141592653589793d);
            this.G = (float) ((Math.atan(f10 / (f12 - f11)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i10, i11, i10 + i12, i11 + i13);
        int iMin = Math.min(Math.min(i12, i13) / 2, i14);
        this.D = iMin;
        this.E = iMin * 2;
    }

    public final void q(float f10, int i10) {
        boolean z10 = this.f29907b != i10;
        this.f29907b = i10;
        this.f29908c = i10;
        int iK = i0.b.k(i10, (int) (Color.alpha(i10) * 0.156f));
        this.f29906a = iK;
        this.f29909e = f10;
        this.d = org.telegram.ui.ActionBar.g6.v(iK, i0.b.k(i10, (int) (Color.alpha(i10) * (org.telegram.ui.ActionBar.g6.I.q() ? 0.3f : 0.2f))));
        if (this.f29910f == null) {
            this.f29910f = new Paint();
        }
        this.f29910f.setColor(this.f29906a);
        Paint paint = this.f29910f;
        paint.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
        if (z10 || this.f29920q == null) {
            int iDp = AndroidUtilities.dp(8.0f);
            int i11 = this.d;
            org.telegram.ui.Cells.z zVarI0 = org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, i11, i11);
            this.f29920q = zVarI0;
            zVarI0.setCallback(this.f29921r);
        }
        if (z10) {
            oi0 oi0Var = this.f29917n;
            oi0Var.W = true;
            oi0Var.O(this.f29908c, "Artboard Outlines");
            oi0Var.m();
            oi0Var.H(true);
            oi0Var.S(0L);
            int iAlpha = Color.alpha(i10);
            this.f29916m = iAlpha;
            oi0Var.setAlpha(iAlpha);
            oi0 oi0Var2 = this.f29919p;
            oi0Var2.W = true;
            oi0Var2.O(this.f29908c, "Artboard Outlines");
            oi0Var2.m();
            oi0Var2.H(true);
            oi0Var2.S(0L);
            int iAlpha2 = Color.alpha(i10);
            this.f29918o = iAlpha2;
            oi0Var2.setAlpha(iAlpha2);
        }
        if (this.f29911g == null) {
            Paint paint2 = new Paint(1);
            this.f29911g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f29911g.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f29911g.setColor(i10);
    }

    public final void r(boolean z10, boolean z11) {
        this.f29914k = z10;
        sn0 sn0Var = this.f29922s;
        if (!sn0Var.f32512z && z10 && sn0Var.B.f34812c <= 0.0f) {
            sn0Var.A = SystemClock.elapsedRealtime();
        }
        sn0Var.f32512z = z10;
        org.telegram.ui.Cells.s1 s1Var = sn0Var.f32501n;
        if (s1Var != null) {
            s1Var.invalidate();
        }
        y5 y5Var = this.f29915l;
        if (!z11) {
            y5Var.f(this.f29914k, true);
        } else if (y5Var.f34812c <= 0.0f) {
            this.f29923t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.s1 s1Var2 = this.f29921r;
        if (s1Var2 != null) {
            s1Var2.invalidate();
        }
    }

    public final void s(boolean z10, boolean z11) {
        org.telegram.ui.Cells.s1 s1Var;
        if (this.f29912i != z10 && (s1Var = this.f29921r) != null) {
            s1Var.invalidate();
        }
        this.f29912i = z10;
        if (z11) {
            return;
        }
        this.f29913j.f(z10, true);
    }

    public final void t(boolean z10, boolean z11) {
        boolean z12 = this.f29928z;
        if (!z12 && z10 && this.f29925w) {
            this.f29925w = false;
            ((org.telegram.ui.Cells.h1) this).R.C3 = true;
        }
        this.f29928z = z10;
        oi0 oi0Var = this.f29919p;
        oi0 oi0Var2 = this.f29917n;
        if (!z11) {
            this.f29927y = z10;
            oi0Var2.stop();
            oi0Var.stop();
            oi0Var2.K(0);
            oi0Var.K(0);
        } else if (z10 && !z12) {
            this.f29927y = false;
            oi0Var2.K(0);
            oi0Var.K(0);
            oi0Var.start();
        } else if (!z10 && z12) {
            this.f29927y = true;
            oi0Var.K(0);
            oi0Var2.K(0);
            oi0Var2.start();
        }
        org.telegram.ui.Cells.s1 s1Var = this.f29921r;
        if (s1Var != null) {
            s1Var.invalidate();
        }
    }

    public final int x() {
        return this.f29924u.width();
    }
}
