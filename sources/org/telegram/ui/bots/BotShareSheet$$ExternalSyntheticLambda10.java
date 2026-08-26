package org.telegram.ui.bots;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda0;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;

public final class BotShareSheet$$ExternalSyntheticLambda10 implements View.OnClickListener {
    public final int $r8$classId = 1;
    public final KeyEvent.Callback f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;
    public final long f$4;
    public final Object f$5;

    public BotShareSheet$$ExternalSyntheticLambda10(LoginActivity.LoginPayView loginPayView, String str, long j, String str2, String str3, int i) {
        this.f$0 = loginPayView;
        this.f$1 = str;
        this.f$4 = j;
        this.f$2 = str2;
        this.f$5 = str3;
        this.f$3 = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                final BotShareSheet botShareSheet = (BotShareSheet) this.f$0;
                botShareSheet.getClass();
                final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    botShareSheet.openedDialogsActivity = true;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 1);
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f$1;
                    if (!tL_messages_preparedInlineMessage.peer_types.isEmpty()) {
                        int i = 0;
                        bundle.putBoolean("allowGroups", false);
                        bundle.putBoolean("allowMegagroups", false);
                        bundle.putBoolean("allowLegacyGroups", false);
                        bundle.putBoolean("allowUsers", false);
                        bundle.putBoolean("allowChannels", false);
                        bundle.putBoolean("allowBots", false);
                        ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_messages_preparedInlineMessage.peer_types;
                        int size = arrayList.size();
                        while (i < size) {
                            TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i);
                            i++;
                            TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                            if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                bundle.putBoolean("allowUsers", true);
                            } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                bundle.putBoolean("allowBots", true);
                            } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                bundle.putBoolean("allowChannels", true);
                            } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                bundle.putBoolean("allowLegacyGroups", true);
                            } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                bundle.putBoolean("allowMegagroups", true);
                            }
                        }
                    }
                    final OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = (OAuthSheet$$ExternalSyntheticLambda18) this.f$2;
                    DialogsActivity dialogsActivity = new DialogsActivity(bundle) {
                        public final OAuthSheet$$ExternalSyntheticLambda18 val$whenDone;

                        public AnonymousClass6(Bundle bundle2) {
                            super(bundle2);
                            oAuthSheet$$ExternalSyntheticLambda18 = oAuthSheet$$ExternalSyntheticLambda18;
                        }

                        @Override
                        public final boolean clickSelectsDialog() {
                            return true;
                        }

                        @Override
                        public final void onFragmentDestroy() {
                            super.onFragmentDestroy();
                            BotShareSheet botShareSheet2 = BotShareSheet.this;
                            if (botShareSheet2.sent) {
                                return;
                            }
                            botShareSheet2.sent = true;
                            oAuthSheet$$ExternalSyntheticLambda18.run("USER_DECLINED", null);
                        }
                    };
                    final int i2 = this.f$3;
                    final long j = this.f$4;
                    dialogsActivity.delegate = new DialogsActivity.DialogsActivityDelegate() {
                        @Override
                        public final boolean canSelectStories() {
                            return false;
                        }

                        @Override
                        public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList2, CharSequence charSequence, boolean z, boolean z2, int i3, int i4, TopicsFragment topicsFragment) {
                            MessageObject messageObject;
                            TLRPC.TL_forumTopic tL_forumTopicFindTopic;
                            TLRPC.Message message;
                            BotShareSheet botShareSheet2 = botShareSheet;
                            botShareSheet2.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            boolean z3 = false;
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj = arrayList2.get(i5);
                                int i6 = i5 + 1;
                                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) obj;
                                long j2 = topicKey.dialogId;
                                long j3 = topicKey.topicId;
                                if (!DialogObject.isEncryptedDialog(j2)) {
                                    int i7 = i2;
                                    if (j3 == 0 || (tL_forumTopicFindTopic = MessagesController.getInstance(i7).getTopicsController().findTopic(-j2, j3)) == null || (message = tL_forumTopicFindTopic.topicStartMessage) == null) {
                                        messageObject = null;
                                    } else {
                                        MessageObject messageObject2 = new MessageObject(i7, message, z3, z3);
                                        messageObject2.isTopicMainMessage = true;
                                        messageObject = messageObject2;
                                    }
                                    HashMap map = new HashMap();
                                    StringBuilder sb = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = tL_messages_preparedInlineMessage;
                                    sb.append(tL_messages_preparedInlineMessage2.query_id);
                                    map.put("query_id", sb.toString());
                                    map.put("id", "" + tL_messages_preparedInlineMessage2.result.id);
                                    map.put("bot", "" + j);
                                    long j4 = j2;
                                    MessageObject messageObject3 = messageObject;
                                    SendMessagesHelper.prepareSendingBotContextResult(safeLastFragment, AccountInstance.getInstance(i7), tL_messages_preparedInlineMessage2.result, map, j4, messageObject3, messageObject, null, null, z2, i3, 0, null, 0L, 0L);
                                    if (charSequence != null) {
                                        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i7);
                                        SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j4, messageObject3, messageObject3, null, true, null, null, null, true, 0, 0, null, false);
                                        j4 = j4;
                                        sendMessagesHelper.sendMessage(sendMessageParamsOf);
                                    }
                                    arrayList3.add(Long.valueOf(j4));
                                }
                                i5 = i6;
                                z3 = false;
                            }
                            if (!botShareSheet2.sent) {
                                botShareSheet2.sent = true;
                                oAuthSheet$$ExternalSyntheticLambda18.run(arrayList3.size() > 0 ? null : "USER_DECLINED", arrayList3);
                            }
                            if (topicsFragment == null) {
                                dialogsActivity2.finishFragment();
                                return true;
                            }
                            topicsFragment.finishFragment();
                            dialogsActivity2.removeSelfFromStack();
                            return true;
                        }

                        @Override
                        public final boolean didSelectStories(DialogsActivity dialogsActivity2) {
                            return false;
                        }
                    };
                    safeLastFragment.presentFragment(dialogsActivity);
                    botShareSheet.lambda$showGiftOfferSheet$15();
                    ((BotWebViewContainer$$ExternalSyntheticLambda5) this.f$5).run();
                    break;
                }
                break;
            default:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$0;
                ButtonWithCounterView buttonWithCounterView = loginPayView.button;
                if (!buttonWithCounterView.loading) {
                    buttonWithCounterView.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = (String) this.f$1;
                    tL_inputStorePaymentAuthCode.amount = this.f$4;
                    String str = (String) this.f$2;
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str;
                    tL_inputStorePaymentAuthCode.phone_number = (String) this.f$5;
                    tL_inputStorePaymentAuthCode.premium_days = this.f$3;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(null, false);
                    if (jSONObjectMakeThemeParams != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                        tL_payments_getPaymentForm.flags = 1 | tL_payments_getPaymentForm.flags;
                    }
                    LoginActivity.this.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new LinkManager$$ExternalSyntheticLambda0(loginPayView, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 12), 74);
                    break;
                }
                break;
        }
    }

    public BotShareSheet$$ExternalSyntheticLambda10(BotShareSheet botShareSheet, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18, int i, long j, BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5) {
        this.f$0 = botShareSheet;
        this.f$1 = tL_messages_preparedInlineMessage;
        this.f$2 = oAuthSheet$$ExternalSyntheticLambda18;
        this.f$3 = i;
        this.f$4 = j;
        this.f$5 = botWebViewContainer$$ExternalSyntheticLambda5;
    }
}
