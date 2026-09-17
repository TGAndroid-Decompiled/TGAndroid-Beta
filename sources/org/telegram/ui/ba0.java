package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ba0 implements Runnable {
    public final int f32086a;
    public final bo f32087b;
    public final long f32088c;
    public final TLRPC.Chat d;

    public ba0(bo boVar, long j3, TLRPC.Chat chat, int i10) {
        this.f32086a = i10;
        this.f32087b = boVar;
        this.f32088c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f32086a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f32088c;
        bo boVar = this.f32087b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.vc.a0(boVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.vc.a0(boVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
