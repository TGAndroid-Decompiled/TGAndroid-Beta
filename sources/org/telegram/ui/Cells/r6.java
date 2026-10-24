package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class r6 extends LinearLayout {
    public static final int f23101c = 0;
    public TLRPC.RequestPeerType f23102a;
    public ArrayList f23103b;

    public final void a(Boolean bool, int i10, int i11) {
        ArrayList arrayList = this.f23103b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(i10))));
            } else {
                arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(i11))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i10;
        String string;
        int i11;
        ArrayList arrayList = this.f23103b;
        if (this.f23102a != requestPeerType) {
            this.f23102a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, R.string.PeerRequirementPremiumTrue, R.string.PeerRequirementPremiumFalse);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, R.string.PeerRequirementChannelPublicTrue, R.string.PeerRequirementChannelPublicFalse);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelBotParticipant))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelCreatorTrue))));
                    }
                } else {
                    a(requestPeerType.has_username, R.string.PeerRequirementGroupPublicTrue, R.string.PeerRequirementGroupPublicFalse);
                    a(requestPeerType.forum, R.string.PeerRequirementForumTrue, R.string.PeerRequirementForumFalse);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupBotParticipant))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupCreatorTrue))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    int i12 = R.string.PeerRequirementUserRights;
                    int i13 = R.string.PeerRequirementUserRight;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i12));
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(i13));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            if (z10) {
                                string = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                            } else {
                                string = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                            }
                            b1.p(1, string, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            b1.p(1, LocaleController.getString(R.string.EditAdminPostMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            b1.p(1, LocaleController.getString(R.string.EditAdminEditMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z10) {
                                i10 = R.string.EditAdminDeleteMessages;
                            } else {
                                i10 = R.string.EditAdminGroupDeleteMessages;
                            }
                            b1.p(1, LocaleController.getString(i10), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            b1.p(1, LocaleController.getString(R.string.EditAdminBanUsers), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            b1.p(1, LocaleController.getString(R.string.EditAdminAddUsers), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            b1.p(1, LocaleController.getString(R.string.EditAdminPinMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            b1.p(1, LocaleController.getString(R.string.EditAdminAddAdmins), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            b1.p(1, LocaleController.getString(R.string.EditAdminSendAnonymously), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            b1.p(1, LocaleController.getString(R.string.StartVoipChatPermission), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            b1.p(1, LocaleController.getString(R.string.ManageTopicsPermission), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(s6.a(TextUtils.concat(replaceTags2, " ", ((s6) arrayList2.get(0)).f23259b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(replaceTags);
                            valueOf.append((CharSequence) " ");
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (i14 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((s6) arrayList2.get(i14)).f23259b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(s6.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                l4 l4Var = new l4(getContext(), 20);
                l4Var.setText(LocaleController.getString(R.string.PeerRequirements));
                int i15 = org.telegram.ui.ActionBar.k6.f21184d6;
                org.telegram.ui.ActionBar.r6.i(i15, l4Var, null);
                addView(l4Var, w7.z5.n(-1, -2));
                View s3Var = new s3(getContext(), 9, 1);
                s3Var.setBackground(null);
                org.telegram.ui.ActionBar.r6.i(i15, s3Var, null);
                addView(s3Var, w7.z5.n(-1, -2));
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    s6 s6Var = (s6) obj;
                    Context context = getContext();
                    LinearLayout linearLayout = new LinearLayout(context);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, linearLayout, null);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (s6Var.f23258a <= 0) {
                        i11 = R.drawable.list_check;
                    } else {
                        i11 = R.drawable.list_circle;
                    }
                    imageView.setImageResource(i11);
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.L6, null, PorterDuff.Mode.MULTIPLY);
                    linearLayout.addView(imageView, w7.z5.p(20, 20, 0.0f, 51, (s6Var.f23258a * 16) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21589z6, null);
                    textView.setSingleLine(false);
                    textView.setText(s6Var.f23259b);
                    linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(linearLayout, w7.z5.n(-1, -2));
                }
                int i17 = org.telegram.ui.ActionBar.k6.f21184d6;
                View s3Var2 = new s3(getContext(), 12, 1);
                s3Var2.setBackground(null);
                org.telegram.ui.ActionBar.r6.i(i17, s3Var2, null);
                addView(s3Var2, w7.z5.n(-1, -2));
                Drawable X0 = org.telegram.ui.ActionBar.k6.X0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7);
                View s3Var3 = new s3(getContext(), 12, 1);
                s3Var3.setBackground(X0);
                addView(s3Var3, w7.z5.n(-1, -2));
            }
        }
    }
}
