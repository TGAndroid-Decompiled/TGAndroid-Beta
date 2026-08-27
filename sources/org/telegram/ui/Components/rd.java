package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class rd implements Utilities.Callback {

    public final int f32132a = 0;

    public final Object f32133b;

    public final boolean f32134c;
    public final int d;

    public final int f32135e;

    public final boolean f32136f;

    public final String f32137g;
    public final Object h;

    public final Object f32138i;

    public final Object f32139j;

    public rd(tf tfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = tfVar;
        this.f32133b = obj;
        this.f32138i = photoEntry;
        this.f32134c = z10;
        this.d = i10;
        this.f32135e = i11;
        this.f32136f = z11;
        this.f32137g = str;
        this.f32139j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f32132a;
        Object obj2 = this.f32138i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f26070i5;
                dd ddVar = new dd(chatActivityEnterView, (TLRPC.Document) obj2, this.f32137g, (MessageObject.SendAnimationData) this.f32139j, this.f32134c, this.d, this.f32135e, this.f32133b, (Long) obj, this.f32136f);
                if (!chatActivityEnterView.q1(ddVar)) {
                    ddVar.run();
                }
                break;
            default:
                tf tfVar = (tf) obj3;
                dd ddVar2 = new dd(tfVar, this.f32133b, (MediaController.PhotoEntry) obj2, this.f32134c, this.d, this.f32135e, this.f32136f, (Long) obj, this.f32137g, this.f32139j);
                if (!tfVar.f32761a.q1(ddVar2)) {
                    ddVar2.run();
                }
                break;
        }
    }

    public rd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f32138i = document;
        this.f32137g = str;
        this.f32139j = sendAnimationData;
        this.f32134c = z10;
        this.d = i10;
        this.f32135e = i11;
        this.f32133b = obj;
        this.f32136f = z11;
    }
}
