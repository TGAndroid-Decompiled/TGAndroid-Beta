package org.telegram.ui;

public final class LinkManager$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public LinkManager$$ExternalSyntheticLambda1(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LinkManager.lambda$handleSettings$3(this.f$0);
                break;
            case 1:
                LinkManager.lambda$handleSettings$4(this.f$0);
                break;
            case 2:
                LinkManager.lambda$handleSettings$6(this.f$0);
                break;
            case 3:
                LinkManager.lambda$handleSettings$5(this.f$0);
                break;
            case 4:
                this.f$0.lambda$editRow$125();
                break;
            case 5:
                this.f$0.lambda$editRow$151();
                break;
            case 6:
                this.f$0.lambda$editRow$139();
                break;
            case 7:
                this.f$0.lambda$editRow$126();
                break;
            case 8:
                this.f$0.lambda$editRow$128();
                break;
            case 9:
                this.f$0.lambda$editRow$133();
                break;
            case 10:
                this.f$0.lambda$editRow$138();
                break;
            case 11:
                this.f$0.lambda$editRow$140();
                break;
            case 12:
                this.f$0.lambda$updateProfileData$102();
                break;
            case 13:
                this.f$0.lambda$createView$14();
                break;
            case 14:
                this.f$0.lambda$createView$16();
                break;
            case 15:
                this.f$0.lambda$onWriteButtonClick$56();
                break;
            case 16:
                this.f$0.lambda$didReceivedNotification$95();
                break;
            case 17:
                this.f$0.createBirthdayEffect();
                break;
            case 18:
                this.f$0.lambda$didReceivedNotification$96();
                break;
            case 19:
                this.f$0.lambda$didReceivedNotification$97();
                break;
            case 20:
                this.f$0.lambda$collapseAvatarInstant$53();
                break;
            case 21:
                this.f$0.lambda$editRow$144();
                break;
            case 22:
                this.f$0.lambda$editNotes$121();
                break;
            case 23:
                this.f$0.lambda$editNotes$122();
                break;
            case 24:
                this.f$0.lambda$onBlockContactClicked$52();
                break;
            case 25:
                this.f$0.lambda$setUserInfo$101();
                break;
            case 26:
                this.f$0.lambda$stopTabsReorder$46();
                break;
            default:
                ProfileStoriesCollectionTabs.lambda$setReorderingAlbums$4(this.f$0);
                break;
        }
    }
}
