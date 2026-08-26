package org.telegram.ui.Stars;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda7;

public final class MessageSuggestionOfferSheet$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId = 2;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Context f$3;
    public final Theme.ResourcesProvider f$4;
    public final long f$5;
    public final Object f$6;

    public MessageSuggestionOfferSheet$$ExternalSyntheticLambda5(int i, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, LinearLayout linearLayout, long j, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f$2 = i;
        this.f$0 = bottomSheet;
        this.f$4 = resourcesProvider;
        this.f$1 = linearLayout;
        this.f$5 = j;
        this.f$3 = context;
        this.f$6 = connectedbotstarref;
    }

    @Override
    public final void onClick(android.view.View r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.MessageSuggestionOfferSheet$$ExternalSyntheticLambda5.onClick(android.view.View):void");
    }

    public MessageSuggestionOfferSheet$$ExternalSyntheticLambda5(TL_payments.connectedBotStarRef connectedbotstarref, int i, BottomSheet bottomSheet, Context context, long j, Theme.ResourcesProvider resourcesProvider, BotVerifySheet$$ExternalSyntheticLambda7 botVerifySheet$$ExternalSyntheticLambda7) {
        this.f$0 = connectedbotstarref;
        this.f$2 = i;
        this.f$1 = bottomSheet;
        this.f$3 = context;
        this.f$5 = j;
        this.f$4 = resourcesProvider;
        this.f$6 = botVerifySheet$$ExternalSyntheticLambda7;
    }

    public MessageSuggestionOfferSheet$$ExternalSyntheticLambda5(MessageSuggestionOfferSheet messageSuggestionOfferSheet, ChatActivity chatActivity, int i, Context context, Theme.ResourcesProvider resourcesProvider, long j, Utilities.Callback callback) {
        this.f$0 = messageSuggestionOfferSheet;
        this.f$1 = chatActivity;
        this.f$2 = i;
        this.f$3 = context;
        this.f$4 = resourcesProvider;
        this.f$5 = j;
        this.f$6 = callback;
    }
}
