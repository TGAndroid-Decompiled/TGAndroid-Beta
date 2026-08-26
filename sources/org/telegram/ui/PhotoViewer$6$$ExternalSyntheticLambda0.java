package org.telegram.ui;

public final class PhotoViewer$6$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;

    public PhotoViewer$6$$ExternalSyntheticLambda0(Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer.AnonymousClass6.lambda$run$0((String) this.f$0, this.f$1);
                break;
            case 1:
                ((InviteContactsActivity.SearchField) this.f$0).lambda$setSpansBounds$0(this.f$1);
                break;
            default:
                ((ArticleViewer) this.f$0).lambda$setParentActivity$30(this.f$1);
                break;
        }
    }
}
