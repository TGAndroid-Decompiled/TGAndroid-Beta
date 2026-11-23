package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class bg implements Runnable {
    public final ChatActivityEnterView f33820a;

    public bg(ChatActivityEnterView chatActivityEnterView) {
        this.f33820a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.gj threadMessage;
        android.support.v4.media.session.a0 S;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f33820a;
        oe oeVar = chatActivityEnterView.f32538a1;
        te teVar = chatActivityEnterView.f32719x4;
        Activity activity = chatActivityEnterView.E3;
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null && activity != null) {
            mgVar.D();
            chatActivityEnterView.f32734z4 = true;
            chatActivityEnterView.f32727y4 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f32539a2;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f32539a2.setTranslationY(0.0f);
            }
            org.telegram.messenger.cw cwVar = null;
            chatActivityEnterView.S3 = null;
            chatActivityEnterView.R3 = null;
            if (chatActivityEnterView.f32564d1) {
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
                    if (!chatActivityEnterView.f32702v3) {
                        chatActivityEnterView.f32702v3 = true;
                        chatActivityEnterView.s2(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                        if (recordCircle != null) {
                            recordCircle.I = 0.5f;
                            recordCircle.J = false;
                        }
                        wg wgVar = chatActivityEnterView.Z0;
                        if (wgVar != null) {
                            wgVar.f41771a = false;
                            wgVar.d = 0L;
                            wgVar.f41774e = 0L;
                            wgVar.h = 0L;
                            wgVar.f41776n = 0L;
                            wgVar.f41772b = false;
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
            } else if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else if (chatActivityEnterView.l1) {
                chatActivityEnterView.n0(false, false);
                chatActivityEnterView.f32689t3 = -1.0f;
                chatActivityEnterView.f32702v3 = true;
                chatActivityEnterView.s2(0, true);
                chatActivityEnterView.j0();
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
                if (recordCircle2 != null) {
                    recordCircle2.J = true;
                }
                tg tgVar = chatActivityEnterView.f32548b2;
                if (tgVar != null) {
                    tgVar.f39853e = false;
                }
                oeVar.getParent().requestDisallowInterceptTouchEvent(true);
                chatActivityEnterView.A0().I(true);
            } else {
                chatActivityEnterView.P3.a1(1);
                if (DictationAsr.C() && (S = DictationAsr.S(ai.r0.c(chatActivityEnterView.getContext(), chatActivityEnterView.G3))) != null) {
                    ai.p pVar = (ai.p) S.f1675b;
                    if (System.currentTimeMillis() - org.telegram.messenger.np.g1().getLong("tinyasr_checked_" + pVar.f1442a, 0L) > 86400000) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean y10 = DictationAsr.y(pVar);
                    if (y10 && !pVar.f1448i) {
                        pVar.f1448i = true;
                        DictationAsr.d.execute(new ai.j(pVar, 0));
                    }
                    if ((y10 || ai.g1.b()) && (!y10 || z10)) {
                        DictationAsr.u(pVar, false);
                    }
                    Context context = chatActivityEnterView.getContext();
                    ExecutorService executorService = DictationLid.f43040a;
                    if (DictationAsr.x()) {
                        DictationLid.d(context);
                    }
                }
                chatActivityEnterView.f32689t3 = -1.0f;
                mg mgVar2 = chatActivityEnterView.P3;
                if (mgVar2 != null) {
                    storyItem = mgVar2.c1();
                } else {
                    storyItem = null;
                }
                MediaController B = MediaController.B();
                int i10 = chatActivityEnterView.R;
                long j3 = chatActivityEnterView.G3;
                org.telegram.messenger.gj gjVar = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i11 = chatActivityEnterView.f32710w3;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                if (bnVar != null) {
                    cwVar = bnVar.Y8();
                }
                B.x0(i10, j3, gjVar, threadMessage, storyItem, i11, true, cwVar, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.f32702v3 = true;
                chatActivityEnterView.s2(0, true);
                wg wgVar2 = chatActivityEnterView.Z0;
                if (wgVar2 != null) {
                    wgVar2.a(0L);
                }
                tg tgVar2 = chatActivityEnterView.f32548b2;
                if (tgVar2 != null) {
                    tgVar2.f39853e = false;
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
