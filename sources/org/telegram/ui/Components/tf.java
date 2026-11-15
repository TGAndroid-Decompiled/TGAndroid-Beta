package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class tf implements Runnable {
    public final ChatActivityEnterView f39690a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.f39690a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.gj threadMessage;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f39690a;
        ke keVar = chatActivityEnterView.f32262p4;
        Activity activity = chatActivityEnterView.f32311w3;
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null && activity != null) {
            cgVar.E();
            chatActivityEnterView.f32277r4 = true;
            chatActivityEnterView.f32269q4 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.S1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.S1.setTranslationY(0.0f);
            }
            org.telegram.messenger.fw fwVar = null;
            chatActivityEnterView.K3 = null;
            chatActivityEnterView.J3 = null;
            if (chatActivityEnterView.f32178d1) {
                if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (activity.checkSelfPermission("android.permission.CAMERA") == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 && z12) {
                    if (!CameraController.getInstance().isCameraInitied()) {
                        CameraController.getInstance().initCamera(keVar);
                    } else {
                        keVar.run();
                    }
                    if (!chatActivityEnterView.f32248n3) {
                        chatActivityEnterView.f32248n3 = true;
                        chatActivityEnterView.f2(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.f32302v2;
                        if (recordCircle != null) {
                            recordCircle.I = 0.5f;
                            recordCircle.J = false;
                        }
                        lg lgVar = chatActivityEnterView.Z0;
                        if (lgVar != null) {
                            lgVar.f36779a = false;
                            lgVar.d = 0L;
                            lgVar.f36782e = 0L;
                            lgVar.h = 0L;
                            lgVar.f36784n = 0L;
                            lgVar.f36780b = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!z11 && !z12) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                String[] strArr = new String[i7];
                if (!z11 && !z12) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                    strArr[1] = "android.permission.CAMERA";
                } else if (!z11) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                } else {
                    strArr[0] = "android.permission.CAMERA";
                }
                activity.requestPermissions(strArr, 150);
                return;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                return;
            }
            chatActivityEnterView.H3.a1(1);
            if (DictationAsr.B()) {
                if (DictationAsr.x()) {
                    Context context = chatActivityEnterView.getContext();
                    if (i10 >= 33 && ai.d.f1173c == 0 && !ai.d.d) {
                        org.telegram.messenger.g0.h3(new ai.a(context.getApplicationContext(), 0));
                    }
                }
                ArrayList b10 = ai.u0.b(chatActivityEnterView.getContext(), chatActivityEnterView.f32327y3);
                android.support.v4.media.session.a0 P = DictationAsr.P(b10, true);
                if (P != null) {
                    ai.t tVar = (ai.t) P.f1713b;
                    if (System.currentTimeMillis() - org.telegram.messenger.np.e1().getLong("tinyasr_checked_" + tVar.f1539a, 0L) > 86400000) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean w10 = DictationAsr.w(tVar);
                    if (w10 && !tVar.f1544g) {
                        tVar.f1544g = true;
                        DictationAsr.d.execute(new ai.p(tVar, 0));
                    }
                    if ((w10 || ai.j1.b()) && (!w10 || z10)) {
                        DictationAsr.t(tVar);
                    }
                    Context context2 = chatActivityEnterView.getContext();
                    ExecutorService executorService = DictationLid.f42585a;
                    if (DictationAsr.v()) {
                        DictationLid.d(context2);
                    }
                } else {
                    Context context3 = chatActivityEnterView.getContext();
                    if (DictationLid.e(b10)) {
                        DictationLid.d(context3);
                    }
                }
            }
            chatActivityEnterView.f32235l3 = -1.0f;
            cg cgVar2 = chatActivityEnterView.H3;
            if (cgVar2 != null) {
                storyItem = cgVar2.c1();
            } else {
                storyItem = null;
            }
            MediaController B = MediaController.B();
            int i11 = chatActivityEnterView.R;
            long j3 = chatActivityEnterView.f32327y3;
            org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            int i12 = chatActivityEnterView.f32255o3;
            org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
            if (anVar != null) {
                fwVar = anVar.Y8();
            }
            B.x0(i11, j3, gjVar, threadMessage, storyItem, i12, true, fwVar, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.f32248n3 = true;
            chatActivityEnterView.f2(0, true);
            lg lgVar2 = chatActivityEnterView.Z0;
            if (lgVar2 != null) {
                lgVar2.a(0L);
            }
            ig igVar = chatActivityEnterView.T1;
            if (igVar != null) {
                igVar.f35609e = false;
            }
            chatActivityEnterView.f32155a1.getParent().requestDisallowInterceptTouchEvent(true);
            ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.f32302v2;
            if (recordCircle2 != null) {
                recordCircle2.I = 1.0f;
                recordCircle2.J = true;
            }
        }
    }
}
