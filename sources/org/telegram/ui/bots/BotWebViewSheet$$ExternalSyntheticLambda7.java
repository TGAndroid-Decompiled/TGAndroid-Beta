package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

public final class BotWebViewSheet$$ExternalSyntheticLambda7 implements RequestDelegate {
    public final int $r8$classId;
    public final BotWebViewSheet f$0;

    public BotWebViewSheet$$ExternalSyntheticLambda7(BotWebViewSheet botWebViewSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewSheet;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final BotWebViewSheet botWebViewSheet = this.f$0;
                botWebViewSheet.getClass();
                final int i = 3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                BotWebViewSheet botWebViewSheet2 = botWebViewSheet;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps = botWebViewSheet2.requestProps;
                                    if (webViewRequestProps != null) {
                                        webViewRequestProps.response = tLObject;
                                        webViewRequestProps.responseTime = System.currentTimeMillis();
                                        botWebViewSheet2.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet2.getClass();
                                }
                                break;
                            case 1:
                                BotWebViewSheet botWebViewSheet3 = botWebViewSheet;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps2 = botWebViewSheet3.requestProps;
                                    if (webViewRequestProps2 != null) {
                                        webViewRequestProps2.response = tLObject;
                                        webViewRequestProps2.responseTime = System.currentTimeMillis();
                                        botWebViewSheet3.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet3.getClass();
                                }
                                break;
                            case 2:
                                BotWebViewSheet botWebViewSheet4 = botWebViewSheet;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps3 = botWebViewSheet4.requestProps;
                                    if (webViewRequestProps3 != null) {
                                        webViewRequestProps3.response = tLObject;
                                        webViewRequestProps3.responseTime = System.currentTimeMillis();
                                        botWebViewSheet4.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet4.getClass();
                                }
                                break;
                            case 3:
                                BotWebViewSheet botWebViewSheet5 = botWebViewSheet;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps4 = botWebViewSheet5.requestProps;
                                    if (webViewRequestProps4 != null) {
                                        webViewRequestProps4.response = tLObject;
                                        webViewRequestProps4.responseTime = System.currentTimeMillis();
                                        botWebViewSheet5.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet5.getClass();
                                }
                                break;
                            default:
                                BotWebViewSheet botWebViewSheet6 = botWebViewSheet;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps5 = botWebViewSheet6.requestProps;
                                    if (webViewRequestProps5 != null) {
                                        webViewRequestProps5.response = tLObject;
                                        webViewRequestProps5.responseTime = System.currentTimeMillis();
                                        botWebViewSheet6.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet6.getClass();
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final BotWebViewSheet botWebViewSheet2 = this.f$0;
                botWebViewSheet2.getClass();
                final int i2 = 4;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                BotWebViewSheet botWebViewSheet3 = botWebViewSheet2;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps = botWebViewSheet3.requestProps;
                                    if (webViewRequestProps != null) {
                                        webViewRequestProps.response = tLObject;
                                        webViewRequestProps.responseTime = System.currentTimeMillis();
                                        botWebViewSheet3.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet3.getClass();
                                }
                                break;
                            case 1:
                                BotWebViewSheet botWebViewSheet4 = botWebViewSheet2;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps2 = botWebViewSheet4.requestProps;
                                    if (webViewRequestProps2 != null) {
                                        webViewRequestProps2.response = tLObject;
                                        webViewRequestProps2.responseTime = System.currentTimeMillis();
                                        botWebViewSheet4.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet4.getClass();
                                }
                                break;
                            case 2:
                                BotWebViewSheet botWebViewSheet5 = botWebViewSheet2;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps3 = botWebViewSheet5.requestProps;
                                    if (webViewRequestProps3 != null) {
                                        webViewRequestProps3.response = tLObject;
                                        webViewRequestProps3.responseTime = System.currentTimeMillis();
                                        botWebViewSheet5.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet5.getClass();
                                }
                                break;
                            case 3:
                                BotWebViewSheet botWebViewSheet6 = botWebViewSheet2;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps4 = botWebViewSheet6.requestProps;
                                    if (webViewRequestProps4 != null) {
                                        webViewRequestProps4.response = tLObject;
                                        webViewRequestProps4.responseTime = System.currentTimeMillis();
                                        botWebViewSheet6.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet6.getClass();
                                }
                                break;
                            default:
                                BotWebViewSheet botWebViewSheet7 = botWebViewSheet2;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps5 = botWebViewSheet7.requestProps;
                                    if (webViewRequestProps5 != null) {
                                        webViewRequestProps5.response = tLObject;
                                        webViewRequestProps5.responseTime = System.currentTimeMillis();
                                        botWebViewSheet7.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet7.getClass();
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final BotWebViewSheet botWebViewSheet3 = this.f$0;
                botWebViewSheet3.getClass();
                final int i3 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                BotWebViewSheet botWebViewSheet4 = botWebViewSheet3;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps = botWebViewSheet4.requestProps;
                                    if (webViewRequestProps != null) {
                                        webViewRequestProps.response = tLObject;
                                        webViewRequestProps.responseTime = System.currentTimeMillis();
                                        botWebViewSheet4.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet4.getClass();
                                }
                                break;
                            case 1:
                                BotWebViewSheet botWebViewSheet5 = botWebViewSheet3;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps2 = botWebViewSheet5.requestProps;
                                    if (webViewRequestProps2 != null) {
                                        webViewRequestProps2.response = tLObject;
                                        webViewRequestProps2.responseTime = System.currentTimeMillis();
                                        botWebViewSheet5.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet5.getClass();
                                }
                                break;
                            case 2:
                                BotWebViewSheet botWebViewSheet6 = botWebViewSheet3;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps3 = botWebViewSheet6.requestProps;
                                    if (webViewRequestProps3 != null) {
                                        webViewRequestProps3.response = tLObject;
                                        webViewRequestProps3.responseTime = System.currentTimeMillis();
                                        botWebViewSheet6.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet6.getClass();
                                }
                                break;
                            case 3:
                                BotWebViewSheet botWebViewSheet7 = botWebViewSheet3;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps4 = botWebViewSheet7.requestProps;
                                    if (webViewRequestProps4 != null) {
                                        webViewRequestProps4.response = tLObject;
                                        webViewRequestProps4.responseTime = System.currentTimeMillis();
                                        botWebViewSheet7.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet7.getClass();
                                }
                                break;
                            default:
                                BotWebViewSheet botWebViewSheet8 = botWebViewSheet3;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps5 = botWebViewSheet8.requestProps;
                                    if (webViewRequestProps5 != null) {
                                        webViewRequestProps5.response = tLObject;
                                        webViewRequestProps5.responseTime = System.currentTimeMillis();
                                        botWebViewSheet8.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet8.getClass();
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                BotWebViewSheet botWebViewSheet4 = this.f$0;
                botWebViewSheet4.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(2, botWebViewSheet4, tL_error));
                break;
            case 4:
                final BotWebViewSheet botWebViewSheet5 = this.f$0;
                botWebViewSheet5.getClass();
                final int i4 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                BotWebViewSheet botWebViewSheet6 = botWebViewSheet5;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps = botWebViewSheet6.requestProps;
                                    if (webViewRequestProps != null) {
                                        webViewRequestProps.response = tLObject;
                                        webViewRequestProps.responseTime = System.currentTimeMillis();
                                        botWebViewSheet6.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet6.getClass();
                                }
                                break;
                            case 1:
                                BotWebViewSheet botWebViewSheet7 = botWebViewSheet5;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps2 = botWebViewSheet7.requestProps;
                                    if (webViewRequestProps2 != null) {
                                        webViewRequestProps2.response = tLObject;
                                        webViewRequestProps2.responseTime = System.currentTimeMillis();
                                        botWebViewSheet7.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet7.getClass();
                                }
                                break;
                            case 2:
                                BotWebViewSheet botWebViewSheet8 = botWebViewSheet5;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps3 = botWebViewSheet8.requestProps;
                                    if (webViewRequestProps3 != null) {
                                        webViewRequestProps3.response = tLObject;
                                        webViewRequestProps3.responseTime = System.currentTimeMillis();
                                        botWebViewSheet8.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet8.getClass();
                                }
                                break;
                            case 3:
                                BotWebViewSheet botWebViewSheet9 = botWebViewSheet5;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps4 = botWebViewSheet9.requestProps;
                                    if (webViewRequestProps4 != null) {
                                        webViewRequestProps4.response = tLObject;
                                        webViewRequestProps4.responseTime = System.currentTimeMillis();
                                        botWebViewSheet9.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet9.getClass();
                                }
                                break;
                            default:
                                BotWebViewSheet botWebViewSheet10 = botWebViewSheet5;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps5 = botWebViewSheet10.requestProps;
                                    if (webViewRequestProps5 != null) {
                                        webViewRequestProps5.response = tLObject;
                                        webViewRequestProps5.responseTime = System.currentTimeMillis();
                                        botWebViewSheet10.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet10.getClass();
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final BotWebViewSheet botWebViewSheet6 = this.f$0;
                botWebViewSheet6.getClass();
                final int i5 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                BotWebViewSheet botWebViewSheet7 = botWebViewSheet6;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps = botWebViewSheet7.requestProps;
                                    if (webViewRequestProps != null) {
                                        webViewRequestProps.response = tLObject;
                                        webViewRequestProps.responseTime = System.currentTimeMillis();
                                        botWebViewSheet7.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet7.getClass();
                                }
                                break;
                            case 1:
                                BotWebViewSheet botWebViewSheet8 = botWebViewSheet6;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps2 = botWebViewSheet8.requestProps;
                                    if (webViewRequestProps2 != null) {
                                        webViewRequestProps2.response = tLObject;
                                        webViewRequestProps2.responseTime = System.currentTimeMillis();
                                        botWebViewSheet8.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet8.getClass();
                                }
                                break;
                            case 2:
                                BotWebViewSheet botWebViewSheet9 = botWebViewSheet6;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps3 = botWebViewSheet9.requestProps;
                                    if (webViewRequestProps3 != null) {
                                        webViewRequestProps3.response = tLObject;
                                        webViewRequestProps3.responseTime = System.currentTimeMillis();
                                        botWebViewSheet9.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet9.getClass();
                                }
                                break;
                            case 3:
                                BotWebViewSheet botWebViewSheet10 = botWebViewSheet6;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps4 = botWebViewSheet10.requestProps;
                                    if (webViewRequestProps4 != null) {
                                        webViewRequestProps4.response = tLObject;
                                        webViewRequestProps4.responseTime = System.currentTimeMillis();
                                        botWebViewSheet10.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet10.getClass();
                                }
                                break;
                            default:
                                BotWebViewSheet botWebViewSheet11 = botWebViewSheet6;
                                if (tL_error == null) {
                                    WebViewRequestProps webViewRequestProps5 = botWebViewSheet11.requestProps;
                                    if (webViewRequestProps5 != null) {
                                        webViewRequestProps5.response = tLObject;
                                        webViewRequestProps5.responseTime = System.currentTimeMillis();
                                        botWebViewSheet11.loadFromResponse();
                                    }
                                } else {
                                    botWebViewSheet11.getClass();
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
