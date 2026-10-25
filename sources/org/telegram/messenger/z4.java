package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class z4 implements Runnable {
    public final int f21963a = 0;
    public final int f21964b;
    public final boolean f21965c;
    public final Object d;

    public z4(int i10, String str, boolean z10) {
        this.f21964b = i10;
        this.d = str;
        this.f21965c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21963a) {
            case 0:
                boolean z10 = this.f21965c;
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f21964b, (String) this.d, z10);
                return;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$484(this.f21964b, this.f21965c);
                return;
        }
    }

    public z4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.f21964b = i10;
        this.f21965c = z10;
    }
}
