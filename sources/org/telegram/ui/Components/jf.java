package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.RecordedAudioTranscriptionController;
public final class jf implements RecordedAudioTranscriptionController.Listener {
    public final int f27483a;
    public final ChatActivityEnterView f27484b;

    public jf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27484b = chatActivityEnterView;
        this.f27483a = i10;
    }

    @Override
    public final void onCompleted(String str) {
        ChatActivityEnterView chatActivityEnterView = this.f27484b;
        if (!chatActivityEnterView.Y1 && this.f27483a == chatActivityEnterView.j3) {
            chatActivityEnterView.f23654f3 = null;
            chatActivityEnterView.f23660g3 = false;
            if (TextUtils.isEmpty(str)) {
                rl0 rl0Var = chatActivityEnterView.f23666h3;
                rl0Var.K = false;
                rl0Var.H = false;
                rl0Var.I = true;
                rl0Var.e();
            } else {
                chatActivityEnterView.f23666h3.setTranscript(str);
            }
            chatActivityEnterView.U1();
            chatActivityEnterView.J0.invalidate();
            wg wgVar = chatActivityEnterView.O1;
            if (wgVar != null) {
                wgVar.invalidate();
            }
        }
    }

    @Override
    public final void onError(RecordedAudioTranscriptionController.FailureReason failureReason) {
        ChatActivityEnterView chatActivityEnterView = this.f27484b;
        if (!chatActivityEnterView.Y1 && this.f27483a == chatActivityEnterView.j3) {
            chatActivityEnterView.f23654f3 = null;
            chatActivityEnterView.f23660g3 = false;
            rl0 rl0Var = chatActivityEnterView.f23666h3;
            rl0Var.K = false;
            rl0Var.H = false;
            rl0Var.I = true;
            rl0Var.e();
            chatActivityEnterView.J0.invalidate();
            wg wgVar = chatActivityEnterView.O1;
            if (wgVar != null) {
                wgVar.invalidate();
            }
        }
    }

    @Override
    public final void onProgress(String str) {
        ChatActivityEnterView chatActivityEnterView = this.f27484b;
        if (!chatActivityEnterView.Y1 && this.f27483a == chatActivityEnterView.j3) {
            chatActivityEnterView.f23666h3.setPartialText(str);
        }
    }
}
