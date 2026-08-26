package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda91;

public final class Weather$$ExternalSyntheticLambda5 implements Runnable {
    public final MessagesController f$0;
    public final TLRPC.User[] f$1;
    public final double f$2;
    public final double f$3;
    public final int[] f$4;
    public final ConnectionsManager f$5;
    public final PhotoViewer$$ExternalSyntheticLambda91 f$6;
    public final String f$7;

    public Weather$$ExternalSyntheticLambda5(MessagesController messagesController, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, PhotoViewer$$ExternalSyntheticLambda91 photoViewer$$ExternalSyntheticLambda91, String str) {
        this.f$0 = messagesController;
        this.f$1 = userArr;
        this.f$2 = d;
        this.f$3 = d2;
        this.f$4 = iArr;
        this.f$5 = connectionsManager;
        this.f$6 = photoViewer$$ExternalSyntheticLambda91;
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
        final PhotoViewer$$ExternalSyntheticLambda91 photoViewer$$ExternalSyntheticLambda91 = this.f$6;
        final String str = this.f$7;
        iArr[0] = this.f$5.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final PhotoViewer$$ExternalSyntheticLambda91 photoViewer$$ExternalSyntheticLambda92 = photoViewer$$ExternalSyntheticLambda91;
                final double d3 = d2;
                final String str2 = str;
                final double d4 = d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TLRPC.messages_BotResults;
                        PhotoViewer$$ExternalSyntheticLambda91 photoViewer$$ExternalSyntheticLambda93 = photoViewer$$ExternalSyntheticLambda92;
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
                                    photoViewer$$ExternalSyntheticLambda93.run(state);
                                    return;
                                } catch (Exception unused) {
                                    photoViewer$$ExternalSyntheticLambda93.run(null);
                                    return;
                                }
                            }
                        }
                        photoViewer$$ExternalSyntheticLambda93.run(null);
                    }
                });
            }
        });
    }
}
