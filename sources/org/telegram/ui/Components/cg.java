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
public final class cg implements Runnable {
    public final ChatActivityEnterView f34203a;

    public cg(ChatActivityEnterView chatActivityEnterView) {
        this.f34203a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.fj threadMessage;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f34203a;
        oe oeVar = chatActivityEnterView.f32569a1;
        te teVar = chatActivityEnterView.f32750x4;
        Activity activity = chatActivityEnterView.E3;
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null && activity != null) {
            ngVar.D();
            chatActivityEnterView.f32765z4 = true;
            chatActivityEnterView.f32758y4 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f32570a2;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f32570a2.setTranslationY(0.0f);
            }
            org.telegram.messenger.bw bwVar = null;
            chatActivityEnterView.S3 = null;
            chatActivityEnterView.R3 = null;
            if (chatActivityEnterView.f32595d1) {
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
                        CameraController.getInstance().initCamera(teVar);
                    } else {
                        teVar.run();
                    }
                    if (!chatActivityEnterView.f32733v3) {
                        chatActivityEnterView.f32733v3 = true;
                        chatActivityEnterView.s2(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                        if (recordCircle != null) {
                            recordCircle.I = 0.5f;
                            recordCircle.J = false;
                        }
                        wg wgVar = chatActivityEnterView.Z0;
                        if (wgVar != null) {
                            wgVar.f41803a = false;
                            wgVar.d = 0L;
                            wgVar.f41806e = 0L;
                            wgVar.h = 0L;
                            wgVar.f41808n = 0L;
                            wgVar.f41804b = false;
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
            } else if (chatActivityEnterView.l1) {
                chatActivityEnterView.n0(false, false);
                chatActivityEnterView.f32720t3 = -1.0f;
                chatActivityEnterView.f32733v3 = true;
                chatActivityEnterView.s2(0, true);
                chatActivityEnterView.j0();
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
                if (recordCircle2 != null) {
                    recordCircle2.J = true;
                }
                tg tgVar = chatActivityEnterView.f32579b2;
                if (tgVar != null) {
                    tgVar.f39907e = false;
                }
                oeVar.getParent().requestDisallowInterceptTouchEvent(true);
                chatActivityEnterView.A0().I(true);
            } else {
                chatActivityEnterView.P3.a1(1);
                if (DictationAsr.D()) {
                    if (DictationAsr.z()) {
                        Context context = chatActivityEnterView.getContext();
                        if (i10 >= 33 && ai.d.f1140c == 0 && !ai.d.d) {
                            org.telegram.messenger.g0.g3(new ai.a(context.getApplicationContext(), 0));
                        }
                    }
                    ArrayList c10 = ai.w0.c(chatActivityEnterView.getContext(), chatActivityEnterView.G3);
                    android.support.v4.media.session.a0 T = DictationAsr.T(c10, true);
                    if (T != null) {
                        ai.t tVar = (ai.t) T.f1717b;
                        if (System.currentTimeMillis() - org.telegram.messenger.mp.g1().getLong("tinyasr_checked_" + tVar.f1508a, 0L) > 86400000) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean y10 = DictationAsr.y(tVar);
                        if (y10 && !tVar.f1514i) {
                            tVar.f1514i = true;
                            DictationAsr.d.execute(new ai.o(tVar, 0));
                        }
                        if ((y10 || ai.l1.b()) && (!y10 || z10)) {
                            DictationAsr.u(tVar, false);
                        }
                        Context context2 = chatActivityEnterView.getContext();
                        ExecutorService executorService = DictationLid.f43071a;
                        if (DictationAsr.x()) {
                            DictationLid.d(context2);
                        }
                    } else {
                        Context context3 = chatActivityEnterView.getContext();
                        if (DictationLid.e(c10)) {
                            DictationLid.d(context3);
                        }
                    }
                }
                chatActivityEnterView.f32720t3 = -1.0f;
                ng ngVar2 = chatActivityEnterView.P3;
                if (ngVar2 != null) {
                    storyItem = ngVar2.c1();
                } else {
                    storyItem = null;
                }
                MediaController B = MediaController.B();
                int i11 = chatActivityEnterView.R;
                long j3 = chatActivityEnterView.G3;
                org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.f32741w3;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                if (bnVar != null) {
                    bwVar = bnVar.Y8();
                }
                B.x0(i11, j3, fjVar, threadMessage, storyItem, i12, true, bwVar, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.f32733v3 = true;
                chatActivityEnterView.s2(0, true);
                wg wgVar2 = chatActivityEnterView.Z0;
                if (wgVar2 != null) {
                    wgVar2.a(0L);
                }
                tg tgVar2 = chatActivityEnterView.f32579b2;
                if (tgVar2 != null) {
                    tgVar2.f39907e = false;
                }
                oeVar.getParent().requestDisallowInterceptTouchEvent(true);
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.D2;
                if (recordCircle3 != null) {
                    recordCircle3.I = 1.0f;
                    recordCircle3.J = true;
                }
            }
        }
    }
}
