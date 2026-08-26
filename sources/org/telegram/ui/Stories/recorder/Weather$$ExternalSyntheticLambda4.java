package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class Weather$$ExternalSyntheticLambda4 implements Runnable {
    public final MessagesController f$0;
    public final TLRPC.User[] f$1;
    public final double f$2;
    public final double f$3;
    public final int[] f$4;
    public final ConnectionsManager f$5;
    public final Weather$$ExternalSyntheticLambda1 f$6;
    public final String f$7;

    public Weather$$ExternalSyntheticLambda4(MessagesController messagesController, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, Weather$$ExternalSyntheticLambda1 weather$$ExternalSyntheticLambda1, String str) {
        this.f$0 = messagesController;
        this.f$1 = userArr;
        this.f$2 = d;
        this.f$3 = d2;
        this.f$4 = iArr;
        this.f$5 = connectionsManager;
        this.f$6 = weather$$ExternalSyntheticLambda1;
        this.f$7 = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f$0.getInputUser(this.f$1[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f$2;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.f$3;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f$4;
        final Weather$$ExternalSyntheticLambda1 weather$$ExternalSyntheticLambda1 = this.f$6;
        final String str = this.f$7;
        iArr[0] = this.f$5.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final Weather$$ExternalSyntheticLambda1 weather$$ExternalSyntheticLambda2 = weather$$ExternalSyntheticLambda1;
                final double d3 = d2;
                final String str2 = str;
                final double d4 = d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TLRPC.messages_BotResults;
                        Weather$$ExternalSyntheticLambda1 weather$$ExternalSyntheticLambda3 = weather$$ExternalSyntheticLambda2;
                        if (z) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float f = Float.parseFloat(botInlineResult.description);
                                    Weather.State state = new Weather.State();
                                    state.lat = d4;
                                    state.lng = d3;
                                    state.emoji = str3;
                                    state.temperature = f;
                                    Weather.cacheKey = str2;
                                    Weather.cacheValue = state;
                                    weather$$ExternalSyntheticLambda3.run(state);
                                    return;
                                } catch (Exception unused) {
                                    weather$$ExternalSyntheticLambda3.run(null);
                                    return;
                                }
                            }
                        }
                        weather$$ExternalSyntheticLambda3.run(null);
                    }
                });
            }
        });
    }
}
