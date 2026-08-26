package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ChatActivity$70$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final Object f$3;
    public final int f$4;
    public final int f$5;

    public ChatActivity$70$$ExternalSyntheticLambda0(ChatActivity.AnonymousClass70 anonymousClass70, boolean z, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.f$0 = anonymousClass70;
        this.f$1 = z;
        this.f$2 = arrayList;
        this.f$3 = arrayList2;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity.AnonymousClass70) this.f$0).lambda$onUnpin$0(this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, this.f$4, this.f$5);
                break;
            default:
                ((DefaultThemesPreviewCell.AnonymousClass2) this.f$0).lambda$onClick$0(this.f$4, (Context) this.f$2, this.f$5, this.f$1, (BaseFragment) this.f$3);
                break;
        }
    }

    public ChatActivity$70$$ExternalSyntheticLambda0(DefaultThemesPreviewCell.AnonymousClass2 anonymousClass2, int i, Context context, int i2, boolean z, BaseFragment baseFragment) {
        this.f$0 = anonymousClass2;
        this.f$4 = i;
        this.f$2 = context;
        this.f$5 = i2;
        this.f$1 = z;
        this.f$3 = baseFragment;
    }
}
