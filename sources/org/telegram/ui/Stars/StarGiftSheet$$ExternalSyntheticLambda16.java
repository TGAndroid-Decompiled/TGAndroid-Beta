package org.telegram.ui.Stars;

import android.view.View;

public final class StarGiftSheet$$ExternalSyntheticLambda16 implements View.OnClickListener {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final int f$1;

    public StarGiftSheet$$ExternalSyntheticLambda16(StarGiftSheet starGiftSheet, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = starGiftSheet;
        this.f$1 = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                StarGiftSheet starGiftSheet = this.f$0;
                int i = this.f$1;
                starGiftSheet.overrideNextIndex = i;
                StarGiftSheet.AnonymousClass2 anonymousClass2 = starGiftSheet.viewPager;
                anonymousClass2.scrollToPosition$1(anonymousClass2.getCurrentPosition() + (i > starGiftSheet.getListPosition$1() ? 1 : -1));
                break;
            case 1:
                StarGiftSheet starGiftSheet2 = this.f$0;
                int i2 = this.f$1;
                starGiftSheet2.overrideNextIndex = i2;
                StarGiftSheet.AnonymousClass2 anonymousClass3 = starGiftSheet2.viewPager;
                anonymousClass3.scrollToPosition$1(anonymousClass3.getCurrentPosition() + (i2 > starGiftSheet2.getListPosition$1() ? 1 : -1));
                break;
            case 2:
                StarGiftSheet starGiftSheet3 = this.f$0;
                int i3 = this.f$1;
                starGiftSheet3.overrideNextIndex = i3;
                StarGiftSheet.AnonymousClass2 anonymousClass4 = starGiftSheet3.viewPager;
                anonymousClass4.scrollToPosition$1(anonymousClass4.getCurrentPosition() + (i3 > starGiftSheet3.getListPosition$1() ? 1 : -1));
                break;
            default:
                StarGiftSheet starGiftSheet4 = this.f$0;
                int i4 = this.f$1;
                starGiftSheet4.overrideNextIndex = i4;
                StarGiftSheet.AnonymousClass2 anonymousClass5 = starGiftSheet4.viewPager;
                anonymousClass5.scrollToPosition$1(anonymousClass5.getCurrentPosition() + (i4 > starGiftSheet4.getListPosition$1() ? 1 : -1));
                break;
        }
    }
}
