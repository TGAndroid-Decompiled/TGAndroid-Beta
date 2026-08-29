package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
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
public final class o6 extends LinearLayout {
    public static final int f24806c = 0;
    public TLRPC.RequestPeerType f24807a;
    public ArrayList f24808b;

    public final void a(Boolean bool, int i10, int i11) {
        ArrayList arrayList = this.f24808b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(p6.a(AndroidUtilities.replaceTags(LocaleController.getString(i10))));
            } else {
                arrayList.add(p6.a(AndroidUtilities.replaceTags(LocaleController.getString(i11))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i10;
        String string;
        int i11;
        ArrayList arrayList = this.f24808b;
        if (this.f24807a != requestPeerType) {
            this.f24807a = requestPeerType;
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
                        arrayList.add(p6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelBotParticipant))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(p6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelCreatorTrue))));
                    }
                } else {
                    a(requestPeerType.has_username, R.string.PeerRequirementGroupPublicTrue, R.string.PeerRequirementGroupPublicFalse);
                    a(requestPeerType.forum, R.string.PeerRequirementForumTrue, R.string.PeerRequirementForumFalse);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(p6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupBotParticipant))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(p6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupCreatorTrue))));
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
                            org.telegram.ui.b.s(string, 1, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            org.telegram.ui.b.s(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            org.telegram.ui.b.s(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z10) {
                                i10 = R.string.EditAdminDeleteMessages;
                            } else {
                                i10 = R.string.EditAdminGroupDeleteMessages;
                            }
                            org.telegram.ui.b.s(LocaleController.getString(i10), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            org.telegram.ui.b.s(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            org.telegram.ui.b.s(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            org.telegram.ui.b.s(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            org.telegram.ui.b.s(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            org.telegram.ui.b.s(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            org.telegram.ui.b.s(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            org.telegram.ui.b.s(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(p6.a(TextUtils.concat(replaceTags2, " ", ((p6) arrayList2.get(0)).f24973b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(replaceTags);
                            valueOf.append((CharSequence) " ");
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (i14 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((p6) arrayList2.get(i14)).f24973b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(p6.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                k4 k4Var = new k4(getContext(), 20);
                k4Var.setText(LocaleController.getString(R.string.PeerRequirements));
                int i15 = org.telegram.ui.ActionBar.g6.f23062d6;
                k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                addView(k4Var, i7.f6.n(-1, -2));
                Drawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                View q3Var = new q3(getContext(), 9, 1);
                q3Var.setBackground(colorDrawable);
                addView(q3Var, i7.f6.n(-1, -2));
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    p6 p6Var = (p6) obj;
                    Context context = getContext();
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (p6Var.f24972a <= 0) {
                        i11 = R.drawable.list_check;
                    } else {
                        i11 = R.drawable.list_circle;
                    }
                    imageView.setImageResource(i11);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false), PorterDuff.Mode.MULTIPLY));
                    linearLayout.addView(imageView, i7.f6.p(20, 20, 0.0f, 51, (p6Var.f24972a * 16) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450z6, false));
                    textView.setSingleLine(false);
                    textView.setText(p6Var.f24973b);
                    linearLayout.addView(textView, i7.f6.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(linearLayout, i7.f6.n(-1, -2));
                }
                Drawable colorDrawable2 = new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                View q3Var2 = new q3(getContext(), 12, 1);
                q3Var2.setBackground(colorDrawable2);
                addView(q3Var2, i7.f6.n(-1, -2));
                Drawable V0 = org.telegram.ui.ActionBar.g6.V0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7);
                View q3Var3 = new q3(getContext(), 12, 1);
                q3Var3.setBackground(V0);
                addView(q3Var3, i7.f6.n(-1, -2));
            }
        }
    }
}
