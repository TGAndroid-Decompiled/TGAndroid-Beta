package org.telegram.ui;

public final class LinkManager$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final LinkManager f$0;
    public final String f$1;

    public LinkManager$$ExternalSyntheticLambda7(LinkManager linkManager, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = linkManager;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LinkManager linkManager = this.f$0;
                linkManager.getClass();
                String str = this.f$1;
                if ("disable".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    linkManager.scrollTo("fingerprintRow");
                }
                break;
            default:
                LinkManager linkManager2 = this.f$0;
                linkManager2.getClass();
                String str2 = this.f$1;
                if ("disable".equalsIgnoreCase(str2)) {
                    linkManager2.scrollTo("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    linkManager2.scrollTo("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str2)) {
                    linkManager2.scrollTo("emailRow");
                }
                break;
        }
    }
}
