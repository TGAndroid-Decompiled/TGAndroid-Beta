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
public abstract class e31 {
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
    public int f23510a;
    public int f23511b;
    public int f23512c;
    public int d;
    public float e;
    public Paint f23513f;
    public Paint f23514g;
    public Path h;
    public boolean f23515i;
    public final c6 f23516j;
    public boolean f23517k;
    public final c6 f23518l;
    public int f23519m;
    public final xi0 f23520n;
    public int f23521o;
    public final xi0 f23522p;
    public org.telegram.ui.Cells.z f23523q;
    public final org.telegram.ui.Cells.t1 f23524r;
    public final io0 f23525s;
    public final Rect f23527u;
    public final Rect v;
    public final boolean f23529x;
    public boolean f23530y;
    public boolean f23531z;
    public boolean f23528w = false;
    public boolean A = false;
    public final u1.a B = new u1.a();
    public long f23526t = SystemClock.elapsedRealtime();

    public e31(org.telegram.ui.Cells.t1 t1Var, io0 io0Var) {
        boolean z10 = false;
        this.f23524r = t1Var;
        this.f23525s = io0Var;
        Rect rect = new Rect(0, 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        this.f23527u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        xi0 xi0Var = new xi0(R.raw.transcribe_out, AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
        this.f23522p = xi0Var;
        xi0Var.M(0);
        xi0Var.setCallback(t1Var);
        xi0Var.S(19, new Runnable(this) {
            public final e31 f22942b;

            {
                this.f22942b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e31 e31Var = this.f22942b;
                        e31Var.f23522p.stop();
                        xi0 xi0Var2 = e31Var.f23520n;
                        xi0Var2.stop();
                        e31Var.f23531z = true;
                        e31Var.f23530y = true;
                        xi0Var2.M(0);
                        return;
                    default:
                        e31 e31Var2 = this.f22942b;
                        e31Var2.f23520n.stop();
                        xi0 xi0Var3 = e31Var2.f23522p;
                        xi0Var3.stop();
                        e31Var2.f23531z = false;
                        e31Var2.f23530y = false;
                        xi0Var3.M(0);
                        return;
                }
            }
        });
        xi0Var.J(true);
        xi0 xi0Var2 = new xi0(R.raw.transcribe_in, AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
        this.f23520n = xi0Var2;
        xi0Var2.M(0);
        xi0Var2.setCallback(t1Var);
        xi0Var2.R(t1Var);
        xi0Var2.S(19, new Runnable(this) {
            public final e31 f22942b;

            {
                this.f22942b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e31 e31Var = this.f22942b;
                        e31Var.f23522p.stop();
                        xi0 xi0Var22 = e31Var.f23520n;
                        xi0Var22.stop();
                        e31Var.f23531z = true;
                        e31Var.f23530y = true;
                        xi0Var22.M(0);
                        return;
                    default:
                        e31 e31Var2 = this.f22942b;
                        e31Var2.f23520n.stop();
                        xi0 xi0Var3 = e31Var2.f23522p;
                        xi0Var3.stop();
                        e31Var2.f23531z = false;
                        e31Var2.f23530y = false;
                        xi0Var3.M(0);
                        return;
                }
            }
        });
        xi0Var2.J(true);
        this.f23530y = false;
        this.f23531z = false;
        if (t1Var.getMessageObject() != null && UserConfig.getInstance(t1Var.getMessageObject().currentAccount).isPremium()) {
            z10 = true;
        }
        this.f23529x = z10;
        qr qrVar = qr.h;
        this.f23518l = new c6(t1Var, 250L, qrVar);
        this.f23516j = new c6(t1Var, 250L, qrVar);
    }

    public static void a(Path path, int i10, int i11, int i12, int i13, float f7, float f10) {
        float a2 = w7.p.a(f7, 0.0f, 1.0f);
        float a10 = w7.p.a(f10, 0.0f, 1.0f) - a2;
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

    public static void b(Path path, int i10, int i11, int i12, int i13, float f7, float f10, float f11, float f12) {
        if (f7 > f10) {
            float f13 = f12 - f11;
            a(path, i10, i11, i12, i13, (f7 - f11) / f13, 1.0f);
            a(path, i10, i11, i12, i13, 0.0f, (f10 - f11) / f13);
            return;
        }
        float f14 = f12 - f11;
        a(path, i10, i11, i12, i13, Math.max(0.0f, f7 - f11) / f14, (Math.min(f10, f12) - f11) / f14);
    }

    public static void c(Path path, int i10, int i11, int i12, int i13, float f7, float f10) {
        if (i10 != i12 || i11 != i13) {
            float a2 = w7.p.a(f7, 0.0f, 1.0f);
            float a10 = w7.p.a(f10, 0.0f, 1.0f);
            if (a10 - a2 <= 0.0f) {
                return;
            }
            path.moveTo(AndroidUtilities.lerp(i10, i12, a2), AndroidUtilities.lerp(i11, i13, a2));
            path.lineTo(AndroidUtilities.lerp(i10, i12, a10), AndroidUtilities.lerp(i11, i13, a10));
        }
    }

    public static void d(Path path, int i10, int i11, int i12, int i13, float f7, float f10, float f11, float f12) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        if (f7 > f10) {
            float f13 = f12 - f11;
            c(path, i10, i11, i12, i13, (f7 - f11) / f13, 1.0f);
            c(path, i10, i11, i12, i13, 0.0f, (f10 - f11) / f13);
            return;
        }
        float f14 = f12 - f11;
        c(path, i10, i11, i12, i13, Math.max(0.0f, f7 - f11) / f14, (Math.min(f10, f12) - f11) / f14);
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

    public static boolean g(MessageObject messageObject, long j3, String str) {
        MessageObject messageObject2;
        MessageObject messageObject3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j3))) {
                messageObject2 = (MessageObject) O.remove(Long.valueOf(j3));
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
                AndroidUtilities.runOnUIThread(new z21(str, messageObject3, j3, 0));
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

    public static void u(MessageObject messageObject, boolean z10) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            MessagesStorage.getInstance(messageObject.currentAccount).updateMessageVoiceTranscriptionOpen(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner);
            if (z10) {
                AndroidUtilities.runOnUIThread(new jq0(messageObject, 20));
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

    public static void w(final MessageObject messageObject, boolean z10, final org.telegram.ui.Cells.k1 k1Var) {
        int i10;
        if (messageObject != null && messageObject.messageOwner != null && messageObject.isSent()) {
            final int i11 = messageObject.currentAccount;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i11).getInputPeer(messageObject.messageOwner.peer_id);
            final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
            TLRPC.Message message = messageObject.messageOwner;
            final int i12 = message.f18130id;
            if (z10) {
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
                        long j3;
                        boolean z11;
                        String str;
                        boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                        int i13 = i11;
                        org.telegram.ui.Cells.k1 k1Var2 = k1Var;
                        MessageObject messageObject2 = messageObject;
                        String str2 = "";
                        if (z12) {
                            TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                            String str3 = tL_messages_transcribedAudio.text;
                            j3 = tL_messages_transcribedAudio.transcription_id;
                            boolean z13 = tL_messages_transcribedAudio.pending;
                            z11 = !z13;
                            if (TextUtils.isEmpty(str3)) {
                                if (z13) {
                                    str2 = null;
                                }
                            } else {
                                str2 = str3;
                            }
                            if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                                MessagesController.getInstance(i13).updateTranscribeAudioTrialCurrentNumber(tL_messages_transcribedAudio.trial_remains_num);
                                MessagesController.getInstance(i13).updateTranscribeAudioTrialCooldownUntil(tL_messages_transcribedAudio.trial_remains_until_date);
                                AndroidUtilities.runOnUIThread(new ar0(9, k1Var2, tL_messages_transcribedAudio));
                            }
                            if (e31.O == null) {
                                e31.O = new HashMap();
                            }
                            e31.O.put(Long.valueOf(j3), messageObject2);
                            messageObject2.messageOwner.voiceTranscriptionId = j3;
                        } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            MessagesController.getInstance(i13).updateTranscribeAudioTrialCurrentNumber(0);
                            MessagesController.getInstance(i13).updateTranscribeAudioTrialCooldownUntil(Utilities.parseInt((CharSequence) tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime());
                            AndroidUtilities.runOnUIThread(new wm(messageObject2, k1Var2, i13, 24));
                            return;
                        } else {
                            j3 = 0;
                            z11 = true;
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        e31.n(messageObject2);
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        message2.voiceTranscriptionOpen = true;
                        message2.voiceTranscriptionFinal = z11;
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("Transcription request sent, received final=" + z11 + " id=" + j3 + " text=" + str2);
                        }
                        String str4 = str2;
                        MessagesStorage.getInstance(i13).updateMessageVoiceTranscription(peerDialogId, i12, str4, messageObject2.messageOwner);
                        if (z11) {
                            AndroidUtilities.runOnUIThread(new z21(str4, messageObject2, j3, 1), Math.max(0L, 350 - elapsedRealtime2));
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

    public final void f(Canvas canvas, float f7) {
        float f10;
        float f11;
        boolean z10;
        float f12;
        int i10;
        Paint M2;
        Rect rect = this.f23527u;
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
        float f13 = this.D;
        path2.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.C);
        float f14 = this.e * f7;
        if (f14 > 0.0f) {
            org.telegram.ui.Cells.t1 t1Var = ((org.telegram.ui.Cells.i1) this).R;
            if (t1Var.f21305y7.shouldDrawWithoutBackground()) {
                M2 = t1Var.M2("paintChatActionBackground");
            } else {
                M2 = t1Var.M2("paintChatTimeBackground");
            }
            int alpha = M2.getAlpha();
            M2.setAlpha((int) (alpha * f14));
            t1Var.p0();
            canvas.drawRect(rect, M2);
            if (M2 == t1Var.M2("paintChatActionBackground") && t1Var.R2()) {
                int alpha2 = org.telegram.ui.ActionBar.i6.f18901h2.getAlpha();
                org.telegram.ui.ActionBar.i6.f18901h2.setAlpha((int) (alpha2 * f14));
                canvas.drawRect(rect, org.telegram.ui.ActionBar.i6.f18901h2);
                org.telegram.ui.ActionBar.i6.f18901h2.setAlpha(alpha2);
            }
            M2.setAlpha(alpha);
        }
        Paint paint = this.f23513f;
        if (paint != null) {
            int alpha3 = paint.getAlpha();
            this.f23513f.setAlpha((int) (alpha3 * f7));
            canvas.drawRect(rect, this.f23513f);
            this.f23513f.setAlpha(alpha3);
        }
        org.telegram.ui.Cells.z zVar = this.f23523q;
        if (zVar != null) {
            zVar.setBounds(rect);
            this.f23523q.draw(canvas);
        }
        canvas.restore();
        if (this.f23517k) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f23518l.d(f10, false);
        if (d > 0.0f) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.f23526t)) * 0.75f;
            if (this.M == null) {
                this.M = new float[2];
            }
            long j3 = elapsedRealtime % 5400;
            float[] fArr = this.M;
            float f15 = ((float) (1520 * j3)) / 5400.0f;
            fArr[0] = f15 - 20.0f;
            fArr[1] = f15;
            for (int i11 = 0; i11 < 4; i11++) {
                float[] fArr2 = this.M;
                u1.a aVar = this.B;
                fArr2[1] = (aVar.getInterpolation(((float) (j3 - (i11 * 1350))) / 667.0f) * 250.0f) + fArr2[1];
                float[] fArr3 = this.M;
                fArr3[0] = (aVar.getInterpolation(((float) (j3 - (i10 + 667))) / 667.0f) * 250.0f) + fArr3[0];
            }
            f11 = 1.0f;
            float[] fArr4 = this.M;
            Path path3 = this.h;
            if (path3 == null) {
                this.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(40.0f * d, fArr4[1] - fArr4[0]);
            float f16 = fArr4[0];
            float f17 = (1.0f - d) * max;
            if (this.f23517k) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            float f18 = (f17 * f12) + f16;
            float f19 = (max * d) + f18;
            float f20 = f18 % 360.0f;
            float f21 = f19 % 360.0f;
            if (f20 < 0.0f) {
                f20 += 360.0f;
            }
            float f22 = f20;
            if (f21 < 0.0f) {
                f21 += 360.0f;
            }
            float f23 = f21;
            Path path4 = this.h;
            int centerX = rect.centerX();
            int i12 = rect.top;
            d(path4, centerX, i12, rect.right - this.D, i12, f22, f23, 0.0f, this.F);
            b(this.h, rect.right, rect.top, this.E, 1, f22, f23, this.F, this.G);
            Path path5 = this.h;
            int i13 = rect.right;
            int i14 = rect.top;
            int i15 = this.D;
            int i16 = i14 + i15;
            int i17 = rect.bottom - i15;
            float f24 = this.G;
            d(path5, i13, i16, i13, i17, f22, f23, f24, 180.0f - f24);
            b(this.h, rect.right, rect.bottom, this.E, 2, f22, f23, 180.0f - this.G, 180.0f - this.F);
            Path path6 = this.h;
            int i18 = rect.right;
            int i19 = this.D;
            int i20 = i18 - i19;
            int i21 = rect.bottom;
            int i22 = rect.left + i19;
            float f25 = this.F;
            d(path6, i20, i21, i22, i21, f22, f23, 180.0f - f25, f25 + 180.0f);
            b(this.h, rect.left, rect.bottom, this.E, 3, f22, f23, this.F + 180.0f, this.G + 180.0f);
            Path path7 = this.h;
            int i23 = rect.left;
            int i24 = rect.bottom;
            int i25 = this.D;
            int i26 = i24 - i25;
            int i27 = rect.top + i25;
            float f26 = this.G;
            d(path7, i23, i26, i23, i27, f22, f23, f26 + 180.0f, 360.0f - f26);
            b(this.h, rect.left, rect.top, this.E, 4, f22, f23, 360.0f - this.G, 360.0f - this.F);
            d(this.h, rect.left + this.D, rect.top, rect.centerX(), rect.top, f22, f23, 360.0f - this.F, 360.0f);
            this.f23514g.setStrokeWidth(AndroidUtilities.dp(1.5f));
            int alpha4 = this.f23514g.getAlpha();
            this.f23514g.setAlpha((int) (alpha4 * f7));
            canvas.drawPath(this.h, this.f23514g);
            this.f23514g.setAlpha(alpha4);
            this.f23524r.invalidate();
        } else {
            f11 = 1.0f;
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-13.0f) + rect.centerX(), AndroidUtilities.dp(-13.0f) + rect.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), 255, 31);
        if (this.f23530y) {
            xi0 xi0Var = this.f23520n;
            xi0Var.setAlpha((int) (this.f23519m * f7));
            xi0Var.draw(canvas);
        } else {
            xi0 xi0Var2 = this.f23522p;
            xi0Var2.setAlpha((int) (this.f23521o * f7));
            xi0Var2.draw(canvas);
        }
        if (this.f23515i && !this.f23530y && !this.f23517k) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.f23516j.e(z10);
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
            this.I.setColor(this.f23512c);
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
            this.J.setStrokeWidth(AndroidUtilities.dp(f11));
            this.J.setColor(this.f23512c);
            this.J.setAlpha(i28);
            canvas.drawPath(this.L, this.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
    }

    public final int i() {
        return this.f23527u.height();
    }

    public final void m() {
        boolean z10;
        org.telegram.ui.Cells.t1 t1Var = this.f23524r;
        if (t1Var != null) {
            this.f23528w = false;
            boolean z11 = this.f23531z;
            boolean z12 = !z11;
            boolean z13 = this.f23529x;
            if (!z11) {
                z10 = !this.f23517k;
                if ((z13 || e(t1Var.getMessageObject())) && t1Var.getMessageObject().isSent()) {
                    r(true, true);
                }
            } else {
                t(false, true);
                r(false, true);
                z10 = true;
            }
            org.telegram.ui.Cells.z zVar = this.f23523q;
            if (zVar != null) {
                zVar.setState(StateSet.NOTHING);
                t1Var.invalidate();
            }
            this.A = false;
            if (z10) {
                if (!z13 && !z11) {
                    if (!e(t1Var.getMessageObject()) && (t1Var.getMessageObject() == null || t1Var.getMessageObject().messageOwner == null || TextUtils.isEmpty(t1Var.getMessageObject().messageOwner.voiceTranscription))) {
                        if (t1Var.getDelegate() != null) {
                            if (MessagesController.getInstance(t1Var.I7).transcribeAudioTrialWeeklyNumber > 0) {
                                t1Var.getDelegate().d0(3);
                                return;
                            } else {
                                t1Var.getDelegate().d0(0);
                                return;
                            }
                        }
                        return;
                    }
                    w(t1Var.getMessageObject(), z12, t1Var.getDelegate());
                    return;
                }
                if (!z11) {
                    this.f23528w = true;
                }
                w(t1Var.getMessageObject(), z12, t1Var.getDelegate());
            }
        }
    }

    public final void p(int i10, int i11, int i12, int i13, int i14) {
        Rect rect = this.f23527u;
        if (i12 != rect.width() || i13 != rect.height()) {
            float f7 = i12 / 2.0f;
            float f10 = i14;
            float f11 = i13 / 2.0f;
            this.F = (float) ((Math.atan((f7 - f10) / f11) * 180.0d) / 3.141592653589793d);
            this.G = (float) ((Math.atan(f7 / (f11 - f10)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i10, i11, i10 + i12, i11 + i13);
        int min = Math.min(Math.min(i12, i13) / 2, i14);
        this.D = min;
        this.E = min * 2;
    }

    public final void q(float f7, int i10) {
        boolean z10;
        float f10;
        Paint paint;
        if (this.f23511b != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23511b = i10;
        this.f23512c = i10;
        int k10 = i0.a.k(i10, (int) (Color.alpha(i10) * 0.156f));
        this.f23510a = k10;
        this.e = f7;
        float alpha = Color.alpha(i10);
        if (org.telegram.ui.ActionBar.i6.I.q()) {
            f10 = 0.3f;
        } else {
            f10 = 0.2f;
        }
        this.d = org.telegram.ui.ActionBar.i6.v(k10, i0.a.k(i10, (int) (alpha * f10)));
        if (this.f23513f == null) {
            this.f23513f = new Paint();
        }
        this.f23513f.setColor(this.f23510a);
        this.f23513f.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
        if (z10 || this.f23523q == null) {
            int dp = AndroidUtilities.dp(8.0f);
            int i11 = this.d;
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, 0, i11, i11);
            this.f23523q = i02;
            i02.setCallback(this.f23524r);
        }
        if (z10) {
            xi0 xi0Var = this.f23520n;
            xi0Var.Z = true;
            xi0Var.Q(this.f23512c, "Artboard Outlines");
            xi0Var.o();
            xi0Var.J(true);
            xi0Var.V(0L);
            int alpha2 = Color.alpha(i10);
            this.f23519m = alpha2;
            xi0Var.setAlpha(alpha2);
            xi0 xi0Var2 = this.f23522p;
            xi0Var2.Z = true;
            xi0Var2.Q(this.f23512c, "Artboard Outlines");
            xi0Var2.o();
            xi0Var2.J(true);
            xi0Var2.V(0L);
            int alpha3 = Color.alpha(i10);
            this.f23521o = alpha3;
            xi0Var2.setAlpha(alpha3);
        }
        if (this.f23514g == null) {
            Paint paint2 = new Paint(1);
            this.f23514g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f23514g.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f23514g.setColor(i10);
    }

    public final void r(boolean z10, boolean z11) {
        this.f23517k = z10;
        io0 io0Var = this.f23525s;
        if (!io0Var.f25111z && z10 && io0Var.B.f22951c <= 0.0f) {
            io0Var.A = SystemClock.elapsedRealtime();
        }
        io0Var.f25111z = z10;
        org.telegram.ui.Cells.t1 t1Var = io0Var.f25100n;
        if (t1Var != null) {
            t1Var.invalidate();
        }
        c6 c6Var = this.f23518l;
        if (!z11) {
            c6Var.f(this.f23517k, true);
        } else if (c6Var.f22951c <= 0.0f) {
            this.f23526t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.t1 t1Var2 = this.f23524r;
        if (t1Var2 != null) {
            t1Var2.invalidate();
        }
    }

    public final void s(boolean z10, boolean z11) {
        org.telegram.ui.Cells.t1 t1Var;
        if (this.f23515i != z10 && (t1Var = this.f23524r) != null) {
            t1Var.invalidate();
        }
        this.f23515i = z10;
        if (!z11) {
            this.f23516j.f(z10, true);
        }
    }

    public final void t(boolean z10, boolean z11) {
        boolean z12 = this.f23531z;
        if (!z12 && z10 && this.f23528w) {
            this.f23528w = false;
            ((org.telegram.ui.Cells.i1) this).R.G3 = true;
        }
        this.f23531z = z10;
        xi0 xi0Var = this.f23522p;
        xi0 xi0Var2 = this.f23520n;
        if (z11) {
            if (z10 && !z12) {
                this.f23530y = false;
                xi0Var2.M(0);
                xi0Var.M(0);
                xi0Var.start();
            } else if (!z10 && z12) {
                this.f23530y = true;
                xi0Var.M(0);
                xi0Var2.M(0);
                xi0Var2.start();
            }
        } else {
            this.f23530y = z10;
            xi0Var2.stop();
            xi0Var.stop();
            xi0Var2.M(0);
            xi0Var.M(0);
        }
        org.telegram.ui.Cells.t1 t1Var = this.f23524r;
        if (t1Var != null) {
            t1Var.invalidate();
        }
    }

    public final int x() {
        return this.f23527u.width();
    }
}
