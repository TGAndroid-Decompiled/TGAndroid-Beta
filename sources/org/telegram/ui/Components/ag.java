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
public final class ag implements Runnable {
    public final ChatActivityEnterView f33344a;

    public ag(ChatActivityEnterView chatActivityEnterView) {
        this.f33344a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.fj threadMessage;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f33344a;
        oe oeVar = chatActivityEnterView.f32541a1;
        te teVar = chatActivityEnterView.f32701v4;
        Activity activity = chatActivityEnterView.C3;
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null && activity != null) {
            kgVar.D();
            chatActivityEnterView.f32717x4 = true;
            chatActivityEnterView.f32709w4 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.Y1.setTranslationY(0.0f);
            }
            org.telegram.messenger.bw bwVar = null;
            chatActivityEnterView.Q3 = null;
            chatActivityEnterView.P3 = null;
            if (chatActivityEnterView.f32567d1) {
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
                    if (!chatActivityEnterView.f32687t3) {
                        chatActivityEnterView.f32687t3 = true;
                        chatActivityEnterView.o2(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
                        if (recordCircle != null) {
                            recordCircle.I = 0.5f;
                            recordCircle.J = false;
                        }
                        ug ugVar = chatActivityEnterView.Z0;
                        if (ugVar != null) {
                            ugVar.f40330a = false;
                            ugVar.d = 0L;
                            ugVar.f40333e = 0L;
                            ugVar.h = 0L;
                            ugVar.f40335n = 0L;
                            ugVar.f40331b = false;
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
                chatActivityEnterView.l0(false, false);
                chatActivityEnterView.f32673r3 = -1.0f;
                chatActivityEnterView.f32687t3 = true;
                chatActivityEnterView.o2(0, true);
                chatActivityEnterView.i0();
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.B2;
                if (recordCircle2 != null) {
                    recordCircle2.J = true;
                }
                rg rgVar = chatActivityEnterView.Z1;
                if (rgVar != null) {
                    rgVar.f39133e = false;
                }
                oeVar.getParent().requestDisallowInterceptTouchEvent(true);
                chatActivityEnterView.w0().F(true);
            } else {
                chatActivityEnterView.N3.a1(1);
                if (DictationAsr.B()) {
                    if (DictationAsr.x()) {
                        Context context = chatActivityEnterView.getContext();
                        if (i10 >= 33 && ai.d.f1171c == 0 && !ai.d.d) {
                            org.telegram.messenger.g0.g3(new ai.a(context.getApplicationContext(), 0));
                        }
                    }
                    ArrayList c10 = ai.u0.c(chatActivityEnterView.getContext(), chatActivityEnterView.E3);
                    android.support.v4.media.session.a0 P = DictationAsr.P(c10, true);
                    if (P != null) {
                        ai.t tVar = (ai.t) P.f1704b;
                        if (System.currentTimeMillis() - org.telegram.messenger.mp.g1().getLong("tinyasr_checked_" + tVar.f1530a, 0L) > 86400000) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean w10 = DictationAsr.w(tVar);
                        if (w10 && !tVar.f1535g) {
                            tVar.f1535g = true;
                            DictationAsr.d.execute(new ai.p(tVar, 0));
                        }
                        if ((w10 || ai.j1.b()) && (!w10 || z10)) {
                            DictationAsr.s(tVar, false);
                        }
                        Context context2 = chatActivityEnterView.getContext();
                        ExecutorService executorService = DictationLid.f43030a;
                        if (DictationAsr.v()) {
                            DictationLid.d(context2);
                        }
                    } else {
                        Context context3 = chatActivityEnterView.getContext();
                        if (DictationLid.e(c10)) {
                            DictationLid.d(context3);
                        }
                    }
                }
                chatActivityEnterView.f32673r3 = -1.0f;
                kg kgVar2 = chatActivityEnterView.N3;
                if (kgVar2 != null) {
                    storyItem = kgVar2.c1();
                } else {
                    storyItem = null;
                }
                MediaController B = MediaController.B();
                int i11 = chatActivityEnterView.R;
                long j3 = chatActivityEnterView.E3;
                org.telegram.messenger.fj fjVar = chatActivityEnterView.H3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.f32693u3;
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                if (bnVar != null) {
                    bwVar = bnVar.Y8();
                }
                B.x0(i11, j3, fjVar, threadMessage, storyItem, i12, true, bwVar, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.f32687t3 = true;
                chatActivityEnterView.o2(0, true);
                ug ugVar2 = chatActivityEnterView.Z0;
                if (ugVar2 != null) {
                    ugVar2.a(0L);
                }
                rg rgVar2 = chatActivityEnterView.Z1;
                if (rgVar2 != null) {
                    rgVar2.f39133e = false;
                }
                oeVar.getParent().requestDisallowInterceptTouchEvent(true);
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.B2;
                if (recordCircle3 != null) {
                    recordCircle3.I = 1.0f;
                    recordCircle3.J = true;
                }
            }
        }
    }
}
