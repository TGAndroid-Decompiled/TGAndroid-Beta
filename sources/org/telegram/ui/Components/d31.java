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
public abstract class d31 {
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
    public int f24123a;
    public int f24124b;
    public int f24125c;
    public int d;
    public float e;
    public Paint f24126f;
    public Paint f24127g;
    public Path h;
    public boolean f24128i;
    public final z5 f24129j;
    public boolean f24130k;
    public final z5 f24131l;
    public int f24132m;
    public final gj0 f24133n;
    public int f24134o;
    public final gj0 f24135p;
    public org.telegram.ui.Cells.z f24136q;
    public final org.telegram.ui.Cells.t1 f24137r;
    public final mo0 f24138s;
    public final Rect f24140u;
    public final Rect v;
    public final boolean f24142x;
    public boolean f24143y;
    public boolean f24144z;
    public boolean f24141w = false;
    public boolean A = false;
    public final u1.a B = new u1.a();
    public long f24139t = SystemClock.elapsedRealtime();

    public d31(org.telegram.ui.Cells.t1 t1Var, mo0 mo0Var) {
        boolean z4 = false;
        this.f24137r = t1Var;
        this.f24138s = mo0Var;
        Rect rect = new Rect(0, 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        this.f24140u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        gj0 gj0Var = new gj0(R.raw.transcribe_out, AndroidUtilities.dp(26.0f), "transcribe_out", AndroidUtilities.dp(26.0f));
        this.f24135p = gj0Var;
        gj0Var.K(0);
        gj0Var.setCallback(t1Var);
        gj0Var.P(19, new Runnable(this) {
            public final d31 f23555b;

            {
                this.f23555b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        d31 d31Var = this.f23555b;
                        d31Var.f24135p.stop();
                        gj0 gj0Var2 = d31Var.f24133n;
                        gj0Var2.stop();
                        d31Var.f24144z = true;
                        d31Var.f24143y = true;
                        gj0Var2.K(0);
                        return;
                    default:
                        d31 d31Var2 = this.f23555b;
                        d31Var2.f24133n.stop();
                        gj0 gj0Var3 = d31Var2.f24135p;
                        gj0Var3.stop();
                        d31Var2.f24144z = false;
                        d31Var2.f24143y = false;
                        gj0Var3.K(0);
                        return;
                }
            }
        });
        gj0Var.H(true);
        gj0 gj0Var2 = new gj0(R.raw.transcribe_in, AndroidUtilities.dp(26.0f), "transcribe_in", AndroidUtilities.dp(26.0f));
        this.f24133n = gj0Var2;
        gj0Var2.K(0);
        gj0Var2.setCallback(t1Var);
        gj0Var2.f25170s0 = t1Var;
        gj0Var2.P(19, new Runnable(this) {
            public final d31 f23555b;

            {
                this.f23555b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        d31 d31Var = this.f23555b;
                        d31Var.f24135p.stop();
                        gj0 gj0Var22 = d31Var.f24133n;
                        gj0Var22.stop();
                        d31Var.f24144z = true;
                        d31Var.f24143y = true;
                        gj0Var22.K(0);
                        return;
                    default:
                        d31 d31Var2 = this.f23555b;
                        d31Var2.f24133n.stop();
                        gj0 gj0Var3 = d31Var2.f24135p;
                        gj0Var3.stop();
                        d31Var2.f24144z = false;
                        d31Var2.f24143y = false;
                        gj0Var3.K(0);
                        return;
                }
            }
        });
        gj0Var2.H(true);
        this.f24143y = false;
        this.f24144z = false;
        if (t1Var.getMessageObject() != null && UserConfig.getInstance(t1Var.getMessageObject().currentAccount).isPremium()) {
            z4 = true;
        }
        this.f24142x = z4;
        nr nrVar = nr.h;
        this.f24131l = new z5(t1Var, 250L, nrVar);
        this.f24129j = new z5(t1Var, 250L, nrVar);
    }

    public static void a(Path path, int i10, int i11, int i12, int i13, float f10, float f11) {
        float a2 = k7.n.a(f10, 0.0f, 1.0f);
        float a10 = k7.n.a(f11, 0.0f, 1.0f) - a2;
        if (a10 <= 0.0f) {
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
        path.addArc(AndroidUtilities.rectTmp, (a2 * 90.0f) + ((i13 * 90) - 180), a10 * 90.0f);
    }

    public static void b(Path path, int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
        if (f10 > f11) {
            float f14 = f13 - f12;
            a(path, i10, i11, i12, i13, (f10 - f12) / f14, 1.0f);
            a(path, i10, i11, i12, i13, 0.0f, (f11 - f12) / f14);
            return;
        }
        float f15 = f13 - f12;
        a(path, i10, i11, i12, i13, Math.max(0.0f, f10 - f12) / f15, (Math.min(f11, f13) - f12) / f15);
    }

    public static void c(Path path, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (i10 != i12 || i11 != i13) {
            float a2 = k7.n.a(f10, 0.0f, 1.0f);
            float a10 = k7.n.a(f11, 0.0f, 1.0f);
            if (a10 - a2 <= 0.0f) {
                return;
            }
            path.moveTo(AndroidUtilities.lerp(i10, i12, a2), AndroidUtilities.lerp(i11, i13, a2));
            path.lineTo(AndroidUtilities.lerp(i10, i12, a10), AndroidUtilities.lerp(i11, i13, a10));
        }
    }

    public static void d(Path path, int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        if (f10 > f11) {
            float f14 = f13 - f12;
            c(path, i10, i11, i12, i13, (f10 - f12) / f14, 1.0f);
            c(path, i10, i11, i12, i13, 0.0f, (f11 - f12) / f14);
            return;
        }
        float f15 = f13 - f12;
        c(path, i10, i11, i12, i13, Math.max(0.0f, f10 - f12) / f15, (Math.min(f11, f13) - f12) / f15);
    }

    public static boolean e(MessageObject messageObject) {
        if (messageObject != null && messageObject.messageOwner != null) {
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(messageObject.currentAccount);
            MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
            if (j(messageObject)) {
                return true;
            }
            if (messagesController.transcribeAudioTrialWeeklyNumber > 0 && messageObject.getDuration() <= messagesController.transcribeAudioTrialDurationMax) {
                if (messagesController.transcribeAudioTrialCooldownUntil != 0 && connectionsManager.getCurrentTime() <= messagesController.transcribeAudioTrialCooldownUntil && messagesController.transcribeAudioTrialCurrentNumber <= 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean g(MessageObject messageObject, long j10, String str) {
        MessageObject messageObject2;
        MessageObject messageObject3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j10))) {
                messageObject2 = (MessageObject) O.remove(Long.valueOf(j10));
            } else {
                messageObject2 = null;
            }
            if (messageObject == null) {
                messageObject3 = messageObject2;
            } else {
                messageObject3 = messageObject;
            }
            if (messageObject3 != null && messageObject3.messageOwner != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(o(messageObject3)));
                }
                messageObject3.messageOwner.voiceTranscriptionFinal = true;
                MessagesStorage.getInstance(messageObject3.currentAccount).updateMessageVoiceTranscription(messageObject3.getDialogId(), messageObject3.getId(), str, messageObject3.messageOwner);
                AndroidUtilities.runOnUIThread(new y21(str, messageObject3, j10, 0));
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
        if (messagesController.transcribeAudioTrialCooldownUntil != 0 && connectionsManager.getCurrentTime() <= messagesController.transcribeAudioTrialCooldownUntil) {
            return messagesController.transcribeAudioTrialCurrentNumber;
        }
        return messagesController.transcribeAudioTrialWeeklyNumber;
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
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(messageObject) && !P.containsKey(Integer.valueOf(o(messageObject))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && messageObject != null && (message = messageObject.messageOwner) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean l(MessageObject messageObject) {
        if (Q != null) {
            if (!messageObject.isRoundVideo() || Q.contains(Integer.valueOf(o(messageObject)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void n(MessageObject messageObject) {
        if (messageObject != null && !l(messageObject)) {
            if (Q == null) {
                Q = new ArrayList(1);
            }
            Q.add(Integer.valueOf(o(messageObject)));
        }
    }

    public static int o(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(messageObject.currentAccount), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    public static void u(MessageObject messageObject, boolean z4) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            MessagesStorage.getInstance(messageObject.currentAccount).updateMessageVoiceTranscriptionOpen(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner);
            if (z4) {
                AndroidUtilities.runOnUIThread(new nq0(messageObject, 20));
            }
        }
    }

    public static boolean v(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null || j(messageObject) || !TextUtils.isEmpty(messageObject.messageOwner.voiceTranscription)) {
            return false;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(messageObject.currentAccount);
        MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
        if (UserConfig.getInstance(messageObject.currentAccount).isPremium() || messagesController.transcribeAudioTrialCooldownUntil == 0 || connectionsManager.getCurrentTime() > messagesController.transcribeAudioTrialCooldownUntil || messagesController.transcribeAudioTrialCurrentNumber > 0) {
            return false;
        }
        return true;
    }

    public static void w(final MessageObject messageObject, boolean z4, final org.telegram.ui.Cells.k1 k1Var) {
        int i10;
        if (messageObject != null && messageObject.messageOwner != null && messageObject.isSent()) {
            final int i11 = messageObject.currentAccount;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i11).getInputPeer(messageObject.messageOwner.peer_id);
            final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
            TLRPC.Message message = messageObject.messageOwner;
            final int i12 = message.f19205id;
            if (z4) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
                    n(messageObject);
                    messageObject.messageOwner.voiceTranscriptionOpen = true;
                    MessagesStorage.getInstance(i11).updateMessageVoiceTranscriptionOpen(peerDialogId, i12, messageObject.messageOwner);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            int i13 = r2;
                            MessageObject messageObject2 = messageObject;
                            int i14 = i11;
                            switch (i13) {
                                case 0:
                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                                    int i15 = NotificationCenter.voiceTranscriptionUpdate;
                                    Boolean bool = Boolean.TRUE;
                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, messageObject2, null, null, bool, bool);
                                    return;
                                default:
                                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("sending Transcription request, msg_id=" + i12 + " dialog_id=" + peerDialogId);
                }
                TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                tL_messages_transcribeAudio.peer = inputPeer;
                tL_messages_transcribeAudio.msg_id = i12;
                if (P == null) {
                    P = new HashMap();
                }
                P.put(Integer.valueOf(o(messageObject)), messageObject);
                if (!UserConfig.getInstance(i11).isPremium()) {
                    i10 = 1024;
                } else {
                    i10 = 0;
                }
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        long j10;
                        boolean z10;
                        String str;
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                        int i13 = i11;
                        org.telegram.ui.Cells.k1 k1Var2 = k1Var;
                        MessageObject messageObject2 = messageObject;
                        String str2 = "";
                        if (z11) {
                            TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                            String str3 = tL_messages_transcribedAudio.text;
                            j10 = tL_messages_transcribedAudio.transcription_id;
                            boolean z12 = tL_messages_transcribedAudio.pending;
                            z10 = !z12;
                            if (TextUtils.isEmpty(str3)) {
                                if (z12) {
                                    str2 = null;
                                }
                            } else {
                                str2 = str3;
                            }
                            if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                                MessagesController.getInstance(i13).updateTranscribeAudioTrialCurrentNumber(tL_messages_transcribedAudio.trial_remains_num);
                                MessagesController.getInstance(i13).updateTranscribeAudioTrialCooldownUntil(tL_messages_transcribedAudio.trial_remains_until_date);
                                AndroidUtilities.runOnUIThread(new i80(27, k1Var2, tL_messages_transcribedAudio));
                            }
                            if (d31.O == null) {
                                d31.O = new HashMap();
                            }
                            d31.O.put(Long.valueOf(j10), messageObject2);
                            messageObject2.messageOwner.voiceTranscriptionId = j10;
                        } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            MessagesController.getInstance(i13).updateTranscribeAudioTrialCurrentNumber(0);
                            MessagesController.getInstance(i13).updateTranscribeAudioTrialCooldownUntil(Utilities.parseInt((CharSequence) tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime());
                            AndroidUtilities.runOnUIThread(new ey(messageObject2, k1Var2, i13, 22));
                            return;
                        } else {
                            j10 = 0;
                            z10 = true;
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        d31.n(messageObject2);
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        message2.voiceTranscriptionOpen = true;
                        message2.voiceTranscriptionFinal = z10;
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("Transcription request sent, received final=" + z10 + " id=" + j10 + " text=" + str2);
                        }
                        String str4 = str2;
                        MessagesStorage.getInstance(i13).updateMessageVoiceTranscription(peerDialogId, i12, str4, messageObject2.messageOwner);
                        if (z10) {
                            AndroidUtilities.runOnUIThread(new y21(str4, messageObject2, j10, 1), Math.max(0L, 350 - elapsedRealtime2));
                        }
                    }
                }, i10);
                return;
            }
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(o(messageObject)));
            }
            messageObject.messageOwner.voiceTranscriptionOpen = false;
            MessagesStorage.getInstance(i11).updateMessageVoiceTranscriptionOpen(peerDialogId, i12, messageObject.messageOwner);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    int i13 = r2;
                    MessageObject messageObject2 = messageObject;
                    int i14 = i11;
                    switch (i13) {
                        case 0:
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                            int i15 = NotificationCenter.voiceTranscriptionUpdate;
                            Boolean bool = Boolean.TRUE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, messageObject2, null, null, bool, bool);
                            return;
                        default:
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public final void f(Canvas canvas, float f10) {
        float f11;
        float f12;
        boolean z4;
        float f13;
        int i10;
        Paint M2;
        Rect rect = this.f24140u;
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
        float f14 = this.D;
        path2.addRoundRect(rectF, f14, f14, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.C);
        float f15 = this.e * f10;
        if (f15 > 0.0f) {
            org.telegram.ui.Cells.t1 t1Var = ((org.telegram.ui.Cells.i1) this).R;
            if (t1Var.f22273v7.shouldDrawWithoutBackground()) {
                M2 = t1Var.M2("paintChatActionBackground");
            } else {
                M2 = t1Var.M2("paintChatTimeBackground");
            }
            int alpha = M2.getAlpha();
            M2.setAlpha((int) (alpha * f15));
            t1Var.p0();
            canvas.drawRect(rect, M2);
            if (M2 == t1Var.M2("paintChatActionBackground") && t1Var.R2()) {
                int alpha2 = org.telegram.ui.ActionBar.j6.f19974h2.getAlpha();
                org.telegram.ui.ActionBar.j6.f19974h2.setAlpha((int) (alpha2 * f15));
                canvas.drawRect(rect, org.telegram.ui.ActionBar.j6.f19974h2);
                org.telegram.ui.ActionBar.j6.f19974h2.setAlpha(alpha2);
            }
            M2.setAlpha(alpha);
        }
        Paint paint = this.f24126f;
        if (paint != null) {
            int alpha3 = paint.getAlpha();
            this.f24126f.setAlpha((int) (alpha3 * f10));
            canvas.drawRect(rect, this.f24126f);
            this.f24126f.setAlpha(alpha3);
        }
        org.telegram.ui.Cells.z zVar = this.f24136q;
        if (zVar != null) {
            zVar.setBounds(rect);
            this.f24136q.draw(canvas);
        }
        canvas.restore();
        if (this.f24130k) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = this.f24131l.d(f11, false);
        if (d > 0.0f) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.f24139t)) * 0.75f;
            if (this.M == null) {
                this.M = new float[2];
            }
            long j10 = elapsedRealtime % 5400;
            float[] fArr = this.M;
            float f16 = ((float) (1520 * j10)) / 5400.0f;
            fArr[0] = f16 - 20.0f;
            fArr[1] = f16;
            for (int i11 = 0; i11 < 4; i11++) {
                float[] fArr2 = this.M;
                u1.a aVar = this.B;
                fArr2[1] = (aVar.getInterpolation(((float) (j10 - (i11 * 1350))) / 667.0f) * 250.0f) + fArr2[1];
                float[] fArr3 = this.M;
                fArr3[0] = (aVar.getInterpolation(((float) (j10 - (i10 + 667))) / 667.0f) * 250.0f) + fArr3[0];
            }
            f12 = 1.0f;
            float[] fArr4 = this.M;
            Path path3 = this.h;
            if (path3 == null) {
                this.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(40.0f * d, fArr4[1] - fArr4[0]);
            float f17 = fArr4[0];
            float f18 = (1.0f - d) * max;
            if (this.f24130k) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            float f19 = (f18 * f13) + f17;
            float f20 = (max * d) + f19;
            float f21 = f19 % 360.0f;
            float f22 = f20 % 360.0f;
            if (f21 < 0.0f) {
                f21 += 360.0f;
            }
            float f23 = f21;
            if (f22 < 0.0f) {
                f22 += 360.0f;
            }
            float f24 = f22;
            Path path4 = this.h;
            int centerX = rect.centerX();
            int i12 = rect.top;
            d(path4, centerX, i12, rect.right - this.D, i12, f23, f24, 0.0f, this.F);
            b(this.h, rect.right, rect.top, this.E, 1, f23, f24, this.F, this.G);
            Path path5 = this.h;
            int i13 = rect.right;
            int i14 = rect.top;
            int i15 = this.D;
            int i16 = i14 + i15;
            int i17 = rect.bottom - i15;
            float f25 = this.G;
            d(path5, i13, i16, i13, i17, f23, f24, f25, 180.0f - f25);
            b(this.h, rect.right, rect.bottom, this.E, 2, f23, f24, 180.0f - this.G, 180.0f - this.F);
            Path path6 = this.h;
            int i18 = rect.right;
            int i19 = this.D;
            int i20 = i18 - i19;
            int i21 = rect.bottom;
            int i22 = rect.left + i19;
            float f26 = this.F;
            d(path6, i20, i21, i22, i21, f23, f24, 180.0f - f26, f26 + 180.0f);
            b(this.h, rect.left, rect.bottom, this.E, 3, f23, f24, this.F + 180.0f, this.G + 180.0f);
            Path path7 = this.h;
            int i23 = rect.left;
            int i24 = rect.bottom;
            int i25 = this.D;
            int i26 = i24 - i25;
            int i27 = rect.top + i25;
            float f27 = this.G;
            d(path7, i23, i26, i23, i27, f23, f24, f27 + 180.0f, 360.0f - f27);
            b(this.h, rect.left, rect.top, this.E, 4, f23, f24, 360.0f - this.G, 360.0f - this.F);
            d(this.h, rect.left + this.D, rect.top, rect.centerX(), rect.top, f23, f24, 360.0f - this.F, 360.0f);
            this.f24127g.setStrokeWidth(AndroidUtilities.dp(1.5f));
            int alpha4 = this.f24127g.getAlpha();
            this.f24127g.setAlpha((int) (alpha4 * f10));
            canvas.drawPath(this.h, this.f24127g);
            this.f24127g.setAlpha(alpha4);
            this.f24137r.invalidate();
        } else {
            f12 = 1.0f;
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-13.0f) + rect.centerX(), AndroidUtilities.dp(-13.0f) + rect.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), 255, 31);
        if (this.f24143y) {
            gj0 gj0Var = this.f24133n;
            gj0Var.setAlpha((int) (this.f24132m * f10));
            gj0Var.draw(canvas);
        } else {
            gj0 gj0Var2 = this.f24135p;
            gj0Var2.setAlpha((int) (this.f24134o * f10));
            gj0Var2.draw(canvas);
        }
        if (this.f24128i && !this.f24143y && !this.f24130k) {
            z4 = true;
        } else {
            z4 = false;
        }
        float e = this.f24129j.e(z4);
        if (e > 0.0f) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
            if (this.H == null) {
                Paint paint2 = new Paint(1);
                this.H = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, -AndroidUtilities.dp(0.4f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.733f));
            canvas.scale(e, e, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.H);
            if (this.I == null) {
                this.I = new Paint(1);
            }
            this.I.setColor(this.f24125c);
            int i28 = (int) (e * 255.0f);
            this.I.setAlpha(i28);
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
            this.J.setStrokeWidth(AndroidUtilities.dp(f12));
            this.J.setColor(this.f24125c);
            this.J.setAlpha(i28);
            canvas.drawPath(this.L, this.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
    }

    public final int i() {
        return this.f24140u.height();
    }

    public final void m() {
        boolean z4;
        org.telegram.ui.Cells.t1 t1Var = this.f24137r;
        if (t1Var != null) {
            this.f24141w = false;
            boolean z10 = this.f24144z;
            boolean z11 = !z10;
            boolean z12 = this.f24142x;
            if (!z10) {
                z4 = !this.f24130k;
                if ((z12 || e(t1Var.getMessageObject())) && t1Var.getMessageObject().isSent()) {
                    r(true, true);
                }
            } else {
                t(false, true);
                r(false, true);
                z4 = true;
            }
            org.telegram.ui.Cells.z zVar = this.f24136q;
            if (zVar != null) {
                zVar.setState(StateSet.NOTHING);
                t1Var.invalidate();
            }
            this.A = false;
            if (z4) {
                if (!z12 && !z10) {
                    if (!e(t1Var.getMessageObject()) && (t1Var.getMessageObject() == null || t1Var.getMessageObject().messageOwner == null || TextUtils.isEmpty(t1Var.getMessageObject().messageOwner.voiceTranscription))) {
                        if (t1Var.getDelegate() != null) {
                            if (MessagesController.getInstance(t1Var.F7).transcribeAudioTrialWeeklyNumber > 0) {
                                t1Var.getDelegate().g0(3);
                                return;
                            } else {
                                t1Var.getDelegate().g0(0);
                                return;
                            }
                        }
                        return;
                    }
                    w(t1Var.getMessageObject(), z11, t1Var.getDelegate());
                    return;
                }
                if (!z10) {
                    this.f24141w = true;
                }
                w(t1Var.getMessageObject(), z11, t1Var.getDelegate());
            }
        }
    }

    public final void p(int i10, int i11, int i12, int i13, int i14) {
        Rect rect = this.f24140u;
        if (i12 != rect.width() || i13 != rect.height()) {
            float f10 = i12 / 2.0f;
            float f11 = i14;
            float f12 = i13 / 2.0f;
            this.F = (float) ((Math.atan((f10 - f11) / f12) * 180.0d) / 3.141592653589793d);
            this.G = (float) ((Math.atan(f10 / (f12 - f11)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i10, i11, i10 + i12, i11 + i13);
        int min = Math.min(Math.min(i12, i13) / 2, i14);
        this.D = min;
        this.E = min * 2;
    }

    public final void q(float f10, int i10) {
        boolean z4;
        float f11;
        Paint paint;
        if (this.f24124b != i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f24124b = i10;
        this.f24125c = i10;
        int k10 = i0.a.k(i10, (int) (Color.alpha(i10) * 0.156f));
        this.f24123a = k10;
        this.e = f10;
        float alpha = Color.alpha(i10);
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            f11 = 0.3f;
        } else {
            f11 = 0.2f;
        }
        this.d = org.telegram.ui.ActionBar.j6.v(k10, i0.a.k(i10, (int) (alpha * f11)));
        if (this.f24126f == null) {
            this.f24126f = new Paint();
        }
        this.f24126f.setColor(this.f24123a);
        this.f24126f.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
        if (z4 || this.f24136q == null) {
            int dp = AndroidUtilities.dp(8.0f);
            int i11 = this.d;
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, i11, i11);
            this.f24136q = i02;
            i02.setCallback(this.f24137r);
        }
        if (z4) {
            gj0 gj0Var = this.f24133n;
            gj0Var.X = true;
            gj0Var.O(this.f24125c, "Artboard Outlines");
            gj0Var.m();
            gj0Var.H(true);
            gj0Var.S(0L);
            int alpha2 = Color.alpha(i10);
            this.f24132m = alpha2;
            gj0Var.setAlpha(alpha2);
            gj0 gj0Var2 = this.f24135p;
            gj0Var2.X = true;
            gj0Var2.O(this.f24125c, "Artboard Outlines");
            gj0Var2.m();
            gj0Var2.H(true);
            gj0Var2.S(0L);
            int alpha3 = Color.alpha(i10);
            this.f24134o = alpha3;
            gj0Var2.setAlpha(alpha3);
        }
        if (this.f24127g == null) {
            Paint paint2 = new Paint(1);
            this.f24127g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f24127g.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f24127g.setColor(i10);
    }

    public final void r(boolean z4, boolean z10) {
        this.f24130k = z4;
        mo0 mo0Var = this.f24138s;
        if (!mo0Var.f27104z && z4 && mo0Var.B.f31241c <= 0.0f) {
            mo0Var.A = SystemClock.elapsedRealtime();
        }
        mo0Var.f27104z = z4;
        org.telegram.ui.Cells.t1 t1Var = mo0Var.f27093n;
        if (t1Var != null) {
            t1Var.invalidate();
        }
        z5 z5Var = this.f24131l;
        if (!z10) {
            z5Var.f(this.f24130k, true);
        } else if (z5Var.f31241c <= 0.0f) {
            this.f24139t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.t1 t1Var2 = this.f24137r;
        if (t1Var2 != null) {
            t1Var2.invalidate();
        }
    }

    public final void s(boolean z4, boolean z10) {
        org.telegram.ui.Cells.t1 t1Var;
        if (this.f24128i != z4 && (t1Var = this.f24137r) != null) {
            t1Var.invalidate();
        }
        this.f24128i = z4;
        if (!z10) {
            this.f24129j.f(z4, true);
        }
    }

    public final void t(boolean z4, boolean z10) {
        boolean z11 = this.f24144z;
        if (!z11 && z4 && this.f24141w) {
            this.f24141w = false;
            ((org.telegram.ui.Cells.i1) this).R.D3 = true;
        }
        this.f24144z = z4;
        gj0 gj0Var = this.f24135p;
        gj0 gj0Var2 = this.f24133n;
        if (z10) {
            if (z4 && !z11) {
                this.f24143y = false;
                gj0Var2.K(0);
                gj0Var.K(0);
                gj0Var.start();
            } else if (!z4 && z11) {
                this.f24143y = true;
                gj0Var.K(0);
                gj0Var2.K(0);
                gj0Var2.start();
            }
        } else {
            this.f24143y = z4;
            gj0Var2.stop();
            gj0Var.stop();
            gj0Var2.K(0);
            gj0Var.K(0);
        }
        org.telegram.ui.Cells.t1 t1Var = this.f24137r;
        if (t1Var != null) {
            t1Var.invalidate();
        }
    }

    public final int x() {
        return this.f24140u.width();
    }
}
