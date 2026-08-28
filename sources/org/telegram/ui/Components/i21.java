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
public abstract class i21 {
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
    public int f29284a;
    public int f29285b;
    public int f29286c;
    public int d;
    public float f29287e;
    public Paint f29288f;
    public Paint f29289g;
    public Path h;
    public boolean f29290i;
    public final y5 f29291j;
    public boolean f29292k;
    public final y5 f29293l;
    public int f29294m;
    public final mi0 f29295n;
    public int f29296o;
    public final mi0 f29297p;
    public org.telegram.ui.Cells.z f29298q;
    public final org.telegram.ui.Cells.t1 f29299r;
    public final rn0 f29300s;
    public final Rect f29302u;
    public final Rect v;
    public final boolean f29304x;
    public boolean f29305y;
    public boolean f29306z;
    public boolean f29303w = false;
    public boolean A = false;
    public final u1.a B = new u1.a();
    public long f29301t = SystemClock.elapsedRealtime();

    public i21(org.telegram.ui.Cells.t1 t1Var, rn0 rn0Var) {
        boolean z10 = false;
        this.f29299r = t1Var;
        this.f29300s = rn0Var;
        Rect rect = new Rect(0, 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        this.f29302u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        mi0 mi0Var = new mi0(R.raw.transcribe_out, AndroidUtilities.dp(26.0f), "transcribe_out", AndroidUtilities.dp(26.0f));
        this.f29297p = mi0Var;
        mi0Var.K(0);
        mi0Var.setCallback(t1Var);
        mi0Var.P(19, new Runnable(this) {
            public final i21 f28633b;

            {
                this.f28633b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i21 i21Var = this.f28633b;
                        i21Var.f29297p.stop();
                        mi0 mi0Var2 = i21Var.f29295n;
                        mi0Var2.stop();
                        i21Var.f29306z = true;
                        i21Var.f29305y = true;
                        mi0Var2.K(0);
                        return;
                    default:
                        i21 i21Var2 = this.f28633b;
                        i21Var2.f29295n.stop();
                        mi0 mi0Var3 = i21Var2.f29297p;
                        mi0Var3.stop();
                        i21Var2.f29306z = false;
                        i21Var2.f29305y = false;
                        mi0Var3.K(0);
                        return;
                }
            }
        });
        mi0Var.H(true);
        mi0 mi0Var2 = new mi0(R.raw.transcribe_in, AndroidUtilities.dp(26.0f), "transcribe_in", AndroidUtilities.dp(26.0f));
        this.f29295n = mi0Var2;
        mi0Var2.K(0);
        mi0Var2.setCallback(t1Var);
        mi0Var2.f30863r0 = t1Var;
        mi0Var2.P(19, new Runnable(this) {
            public final i21 f28633b;

            {
                this.f28633b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i21 i21Var = this.f28633b;
                        i21Var.f29297p.stop();
                        mi0 mi0Var22 = i21Var.f29295n;
                        mi0Var22.stop();
                        i21Var.f29306z = true;
                        i21Var.f29305y = true;
                        mi0Var22.K(0);
                        return;
                    default:
                        i21 i21Var2 = this.f28633b;
                        i21Var2.f29295n.stop();
                        mi0 mi0Var3 = i21Var2.f29297p;
                        mi0Var3.stop();
                        i21Var2.f29306z = false;
                        i21Var2.f29305y = false;
                        mi0Var3.K(0);
                        return;
                }
            }
        });
        mi0Var2.H(true);
        this.f29305y = false;
        this.f29306z = false;
        if (t1Var.getMessageObject() != null && UserConfig.getInstance(t1Var.getMessageObject().currentAccount).isPremium()) {
            z10 = true;
        }
        this.f29304x = z10;
        gr grVar = gr.h;
        this.f29293l = new y5(t1Var, 250L, grVar);
        this.f29291j = new y5(t1Var, 250L, grVar);
    }

    public static void a(Path path, int i9, int i10, int i11, int i12, float f10, float f11) {
        float a2 = g7.n.a(f10, 0.0f, 1.0f);
        float a3 = g7.n.a(f11, 0.0f, 1.0f) - a2;
        if (a3 <= 0.0f) {
            return;
        }
        if (i12 == 1) {
            AndroidUtilities.rectTmp.set(i9 - i11, i10, i9, i10 + i11);
        } else if (i12 == 2) {
            AndroidUtilities.rectTmp.set(i9 - i11, i10 - i11, i9, i10);
        } else if (i12 == 3) {
            AndroidUtilities.rectTmp.set(i9, i10 - i11, i9 + i11, i10);
        } else if (i12 == 4) {
            AndroidUtilities.rectTmp.set(i9, i10, i9 + i11, i10 + i11);
        }
        path.addArc(AndroidUtilities.rectTmp, (a2 * 90.0f) + ((i12 * 90) - 180), a3 * 90.0f);
    }

    public static void b(Path path, int i9, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (f10 > f11) {
            float f14 = f13 - f12;
            a(path, i9, i10, i11, i12, (f10 - f12) / f14, 1.0f);
            a(path, i9, i10, i11, i12, 0.0f, (f11 - f12) / f14);
            return;
        }
        float f15 = f13 - f12;
        a(path, i9, i10, i11, i12, Math.max(0.0f, f10 - f12) / f15, (Math.min(f11, f13) - f12) / f15);
    }

    public static void c(Path path, int i9, int i10, int i11, int i12, float f10, float f11) {
        if (i9 != i11 || i10 != i12) {
            float a2 = g7.n.a(f10, 0.0f, 1.0f);
            float a3 = g7.n.a(f11, 0.0f, 1.0f);
            if (a3 - a2 <= 0.0f) {
                return;
            }
            path.moveTo(AndroidUtilities.lerp(i9, i11, a2), AndroidUtilities.lerp(i10, i12, a2));
            path.lineTo(AndroidUtilities.lerp(i9, i11, a3), AndroidUtilities.lerp(i10, i12, a3));
        }
    }

    public static void d(Path path, int i9, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (i9 == i11 && i10 == i12) {
            return;
        }
        if (f10 > f11) {
            float f14 = f13 - f12;
            c(path, i9, i10, i11, i12, (f10 - f12) / f14, 1.0f);
            c(path, i9, i10, i11, i12, 0.0f, (f11 - f12) / f14);
            return;
        }
        float f15 = f13 - f12;
        c(path, i9, i10, i11, i12, Math.max(0.0f, f10 - f12) / f15, (Math.min(f11, f13) - f12) / f15);
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
                AndroidUtilities.runOnUIThread(new d21(str, messageObject3, j10, 0));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int h(int i9) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i9);
        MessagesController messagesController = MessagesController.getInstance(i9);
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
                AndroidUtilities.runOnUIThread(new tp0(messageObject, 20));
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
        int i9;
        if (messageObject != null && messageObject.messageOwner != null && messageObject.isSent()) {
            final int i10 = messageObject.currentAccount;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(messageObject.messageOwner.peer_id);
            final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
            TLRPC.Message message = messageObject.messageOwner;
            final int i11 = message.f22401id;
            if (z10) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
                    n(messageObject);
                    messageObject.messageOwner.voiceTranscriptionOpen = true;
                    MessagesStorage.getInstance(i10).updateMessageVoiceTranscriptionOpen(peerDialogId, i11, messageObject.messageOwner);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            int i12 = r2;
                            MessageObject messageObject2 = messageObject;
                            int i13 = i10;
                            switch (i12) {
                                case 0:
                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                                    int i14 = NotificationCenter.voiceTranscriptionUpdate;
                                    Boolean bool = Boolean.TRUE;
                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i14, messageObject2, null, null, bool, bool);
                                    return;
                                default:
                                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                                    return;
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
                if (!UserConfig.getInstance(i10).isPremium()) {
                    i9 = 1024;
                } else {
                    i9 = 0;
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        long j10;
                        boolean z11;
                        String str;
                        boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                        int i12 = i10;
                        org.telegram.ui.Cells.k1 k1Var2 = k1Var;
                        MessageObject messageObject2 = messageObject;
                        String str2 = "";
                        if (z12) {
                            TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                            String str3 = tL_messages_transcribedAudio.text;
                            j10 = tL_messages_transcribedAudio.transcription_id;
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
                                MessagesController.getInstance(i12).updateTranscribeAudioTrialCurrentNumber(tL_messages_transcribedAudio.trial_remains_num);
                                MessagesController.getInstance(i12).updateTranscribeAudioTrialCooldownUntil(tL_messages_transcribedAudio.trial_remains_until_date);
                                AndroidUtilities.runOnUIThread(new jg0(21, k1Var2, tL_messages_transcribedAudio));
                            }
                            if (i21.O == null) {
                                i21.O = new HashMap();
                            }
                            i21.O.put(Long.valueOf(j10), messageObject2);
                            messageObject2.messageOwner.voiceTranscriptionId = j10;
                        } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            MessagesController.getInstance(i12).updateTranscribeAudioTrialCurrentNumber(0);
                            MessagesController.getInstance(i12).updateTranscribeAudioTrialCooldownUntil(Utilities.parseInt((CharSequence) tL_error.text).intValue() + ConnectionsManager.getInstance(i12).getCurrentTime());
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(messageObject2, k1Var2, i12, 25));
                            return;
                        } else {
                            j10 = 0;
                            z11 = true;
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        i21.n(messageObject2);
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        message2.voiceTranscriptionOpen = true;
                        message2.voiceTranscriptionFinal = z11;
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("Transcription request sent, received final=" + z11 + " id=" + j10 + " text=" + str2);
                        }
                        String str4 = str2;
                        MessagesStorage.getInstance(i12).updateMessageVoiceTranscription(peerDialogId, i11, str4, messageObject2.messageOwner);
                        if (z11) {
                            AndroidUtilities.runOnUIThread(new d21(str4, messageObject2, j10, 1), Math.max(0L, 350 - elapsedRealtime2));
                        }
                    }
                }, i9);
                return;
            }
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(o(messageObject)));
            }
            messageObject.messageOwner.voiceTranscriptionOpen = false;
            MessagesStorage.getInstance(i10).updateMessageVoiceTranscriptionOpen(peerDialogId, i11, messageObject.messageOwner);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    int i12 = r2;
                    MessageObject messageObject2 = messageObject;
                    int i13 = i10;
                    switch (i12) {
                        case 0:
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                            int i14 = NotificationCenter.voiceTranscriptionUpdate;
                            Boolean bool = Boolean.TRUE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i14, messageObject2, null, null, bool, bool);
                            return;
                        default:
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public final void f(Canvas canvas, float f10) {
        float f11;
        float f12;
        boolean z10;
        float f13;
        int i9;
        Paint M2;
        Rect rect = this.f29302u;
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
        float f15 = this.f29287e * f10;
        if (f15 > 0.0f) {
            org.telegram.ui.Cells.t1 t1Var = ((org.telegram.ui.Cells.i1) this).R;
            if (t1Var.f25593u7.shouldDrawWithoutBackground()) {
                M2 = t1Var.M2("paintChatActionBackground");
            } else {
                M2 = t1Var.M2("paintChatTimeBackground");
            }
            int alpha = M2.getAlpha();
            M2.setAlpha((int) (alpha * f15));
            t1Var.o0();
            canvas.drawRect(rect, M2);
            if (M2 == t1Var.M2("paintChatActionBackground") && t1Var.R2()) {
                int alpha2 = org.telegram.ui.ActionBar.f6.f23069h2.getAlpha();
                org.telegram.ui.ActionBar.f6.f23069h2.setAlpha((int) (alpha2 * f15));
                canvas.drawRect(rect, org.telegram.ui.ActionBar.f6.f23069h2);
                org.telegram.ui.ActionBar.f6.f23069h2.setAlpha(alpha2);
            }
            M2.setAlpha(alpha);
        }
        Paint paint = this.f29288f;
        if (paint != null) {
            int alpha3 = paint.getAlpha();
            this.f29288f.setAlpha((int) (alpha3 * f10));
            canvas.drawRect(rect, this.f29288f);
            this.f29288f.setAlpha(alpha3);
        }
        org.telegram.ui.Cells.z zVar = this.f29298q;
        if (zVar != null) {
            zVar.setBounds(rect);
            this.f29298q.draw(canvas);
        }
        canvas.restore();
        if (this.f29292k) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = this.f29293l.d(f11, false);
        if (d > 0.0f) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.f29301t)) * 0.75f;
            if (this.M == null) {
                this.M = new float[2];
            }
            long j10 = elapsedRealtime % 5400;
            float[] fArr = this.M;
            float f16 = ((float) (1520 * j10)) / 5400.0f;
            fArr[0] = f16 - 20.0f;
            fArr[1] = f16;
            for (int i10 = 0; i10 < 4; i10++) {
                float[] fArr2 = this.M;
                u1.a aVar = this.B;
                fArr2[1] = (aVar.getInterpolation(((float) (j10 - (i10 * 1350))) / 667.0f) * 250.0f) + fArr2[1];
                float[] fArr3 = this.M;
                fArr3[0] = (aVar.getInterpolation(((float) (j10 - (i9 + 667))) / 667.0f) * 250.0f) + fArr3[0];
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
            if (this.f29292k) {
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
            int i11 = rect.top;
            d(path4, centerX, i11, rect.right - this.D, i11, f23, f24, 0.0f, this.F);
            b(this.h, rect.right, rect.top, this.E, 1, f23, f24, this.F, this.G);
            Path path5 = this.h;
            int i12 = rect.right;
            int i13 = rect.top;
            int i14 = this.D;
            int i15 = i13 + i14;
            int i16 = rect.bottom - i14;
            float f25 = this.G;
            d(path5, i12, i15, i12, i16, f23, f24, f25, 180.0f - f25);
            b(this.h, rect.right, rect.bottom, this.E, 2, f23, f24, 180.0f - this.G, 180.0f - this.F);
            Path path6 = this.h;
            int i17 = rect.right;
            int i18 = this.D;
            int i19 = i17 - i18;
            int i20 = rect.bottom;
            int i21 = rect.left + i18;
            float f26 = this.F;
            d(path6, i19, i20, i21, i20, f23, f24, 180.0f - f26, f26 + 180.0f);
            b(this.h, rect.left, rect.bottom, this.E, 3, f23, f24, this.F + 180.0f, this.G + 180.0f);
            Path path7 = this.h;
            int i22 = rect.left;
            int i23 = rect.bottom;
            int i24 = this.D;
            int i25 = i23 - i24;
            int i26 = rect.top + i24;
            float f27 = this.G;
            d(path7, i22, i25, i22, i26, f23, f24, f27 + 180.0f, 360.0f - f27);
            b(this.h, rect.left, rect.top, this.E, 4, f23, f24, 360.0f - this.G, 360.0f - this.F);
            d(this.h, rect.left + this.D, rect.top, rect.centerX(), rect.top, f23, f24, 360.0f - this.F, 360.0f);
            this.f29289g.setStrokeWidth(AndroidUtilities.dp(1.5f));
            int alpha4 = this.f29289g.getAlpha();
            this.f29289g.setAlpha((int) (alpha4 * f10));
            canvas.drawPath(this.h, this.f29289g);
            this.f29289g.setAlpha(alpha4);
            this.f29299r.invalidate();
        } else {
            f12 = 1.0f;
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-13.0f) + rect.centerX(), AndroidUtilities.dp(-13.0f) + rect.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), 255, 31);
        if (this.f29305y) {
            mi0 mi0Var = this.f29295n;
            mi0Var.setAlpha((int) (this.f29294m * f10));
            mi0Var.draw(canvas);
        } else {
            mi0 mi0Var2 = this.f29297p;
            mi0Var2.setAlpha((int) (this.f29296o * f10));
            mi0Var2.draw(canvas);
        }
        if (this.f29290i && !this.f29305y && !this.f29292k) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f29291j.e(z10);
        if (e10 > 0.0f) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
            if (this.H == null) {
                Paint paint2 = new Paint(1);
                this.H = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, -AndroidUtilities.dp(0.4f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.733f));
            canvas.scale(e10, e10, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.H);
            if (this.I == null) {
                this.I = new Paint(1);
            }
            this.I.setColor(this.f29286c);
            int i27 = (int) (e10 * 255.0f);
            this.I.setAlpha(i27);
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
            this.J.setColor(this.f29286c);
            this.J.setAlpha(i27);
            canvas.drawPath(this.L, this.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
    }

    public final int i() {
        return this.f29302u.height();
    }

    public final void m() {
        boolean z10;
        org.telegram.ui.Cells.t1 t1Var = this.f29299r;
        if (t1Var != null) {
            this.f29303w = false;
            boolean z11 = this.f29306z;
            boolean z12 = !z11;
            boolean z13 = this.f29304x;
            if (!z11) {
                z10 = !this.f29292k;
                if ((z13 || e(t1Var.getMessageObject())) && t1Var.getMessageObject().isSent()) {
                    r(true, true);
                }
            } else {
                t(false, true);
                r(false, true);
                z10 = true;
            }
            org.telegram.ui.Cells.z zVar = this.f29298q;
            if (zVar != null) {
                zVar.setState(StateSet.NOTHING);
                t1Var.invalidate();
            }
            this.A = false;
            if (z10) {
                if (!z13 && !z11) {
                    if (!e(t1Var.getMessageObject()) && (t1Var.getMessageObject() == null || t1Var.getMessageObject().messageOwner == null || TextUtils.isEmpty(t1Var.getMessageObject().messageOwner.voiceTranscription))) {
                        if (t1Var.getDelegate() != null) {
                            if (MessagesController.getInstance(t1Var.E7).transcribeAudioTrialWeeklyNumber > 0) {
                                t1Var.getDelegate().i0(3);
                                return;
                            } else {
                                t1Var.getDelegate().i0(0);
                                return;
                            }
                        }
                        return;
                    }
                    w(t1Var.getMessageObject(), z12, t1Var.getDelegate());
                    return;
                }
                if (!z11) {
                    this.f29303w = true;
                }
                w(t1Var.getMessageObject(), z12, t1Var.getDelegate());
            }
        }
    }

    public final void p(int i9, int i10, int i11, int i12, int i13) {
        Rect rect = this.f29302u;
        if (i11 != rect.width() || i12 != rect.height()) {
            float f10 = i11 / 2.0f;
            float f11 = i13;
            float f12 = i12 / 2.0f;
            this.F = (float) ((Math.atan((f10 - f11) / f12) * 180.0d) / 3.141592653589793d);
            this.G = (float) ((Math.atan(f10 / (f12 - f11)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i9, i10, i9 + i11, i10 + i12);
        int min = Math.min(Math.min(i11, i12) / 2, i13);
        this.D = min;
        this.E = min * 2;
    }

    public final void q(float f10, int i9) {
        boolean z10;
        float f11;
        Paint paint;
        if (this.f29285b != i9) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29285b = i9;
        this.f29286c = i9;
        int k10 = i0.a.k(i9, (int) (Color.alpha(i9) * 0.156f));
        this.f29284a = k10;
        this.f29287e = f10;
        float alpha = Color.alpha(i9);
        if (org.telegram.ui.ActionBar.f6.I.q()) {
            f11 = 0.3f;
        } else {
            f11 = 0.2f;
        }
        this.d = org.telegram.ui.ActionBar.f6.v(k10, i0.a.k(i9, (int) (alpha * f11)));
        if (this.f29288f == null) {
            this.f29288f = new Paint();
        }
        this.f29288f.setColor(this.f29284a);
        this.f29288f.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
        if (z10 || this.f29298q == null) {
            int dp = AndroidUtilities.dp(8.0f);
            int i10 = this.d;
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, i10, i10);
            this.f29298q = i02;
            i02.setCallback(this.f29299r);
        }
        if (z10) {
            mi0 mi0Var = this.f29295n;
            mi0Var.W = true;
            mi0Var.O(this.f29286c, "Artboard Outlines");
            mi0Var.m();
            mi0Var.H(true);
            mi0Var.S(0L);
            int alpha2 = Color.alpha(i9);
            this.f29294m = alpha2;
            mi0Var.setAlpha(alpha2);
            mi0 mi0Var2 = this.f29297p;
            mi0Var2.W = true;
            mi0Var2.O(this.f29286c, "Artboard Outlines");
            mi0Var2.m();
            mi0Var2.H(true);
            mi0Var2.S(0L);
            int alpha3 = Color.alpha(i9);
            this.f29296o = alpha3;
            mi0Var2.setAlpha(alpha3);
        }
        if (this.f29289g == null) {
            Paint paint2 = new Paint(1);
            this.f29289g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f29289g.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f29289g.setColor(i9);
    }

    public final void r(boolean z10, boolean z11) {
        this.f29292k = z10;
        rn0 rn0Var = this.f29300s;
        if (!rn0Var.f32231z && z10 && rn0Var.B.f34854c <= 0.0f) {
            rn0Var.A = SystemClock.elapsedRealtime();
        }
        rn0Var.f32231z = z10;
        org.telegram.ui.Cells.t1 t1Var = rn0Var.f32220n;
        if (t1Var != null) {
            t1Var.invalidate();
        }
        y5 y5Var = this.f29293l;
        if (!z11) {
            y5Var.f(this.f29292k, true);
        } else if (y5Var.f34854c <= 0.0f) {
            this.f29301t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.t1 t1Var2 = this.f29299r;
        if (t1Var2 != null) {
            t1Var2.invalidate();
        }
    }

    public final void s(boolean z10, boolean z11) {
        org.telegram.ui.Cells.t1 t1Var;
        if (this.f29290i != z10 && (t1Var = this.f29299r) != null) {
            t1Var.invalidate();
        }
        this.f29290i = z10;
        if (!z11) {
            this.f29291j.f(z10, true);
        }
    }

    public final void t(boolean z10, boolean z11) {
        boolean z12 = this.f29306z;
        if (!z12 && z10 && this.f29303w) {
            this.f29303w = false;
            ((org.telegram.ui.Cells.i1) this).R.C3 = true;
        }
        this.f29306z = z10;
        mi0 mi0Var = this.f29297p;
        mi0 mi0Var2 = this.f29295n;
        if (z11) {
            if (z10 && !z12) {
                this.f29305y = false;
                mi0Var2.K(0);
                mi0Var.K(0);
                mi0Var.start();
            } else if (!z10 && z12) {
                this.f29305y = true;
                mi0Var.K(0);
                mi0Var2.K(0);
                mi0Var2.start();
            }
        } else {
            this.f29305y = z10;
            mi0Var2.stop();
            mi0Var.stop();
            mi0Var2.K(0);
            mi0Var.K(0);
        }
        org.telegram.ui.Cells.t1 t1Var = this.f29299r;
        if (t1Var != null) {
            t1Var.invalidate();
        }
    }

    public final int x() {
        return this.f29302u.width();
    }
}
