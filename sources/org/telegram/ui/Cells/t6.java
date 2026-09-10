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
public final class t6 extends LinearLayout {
    public static final int f20444c = 0;
    public TLRPC.RequestPeerType f20445a;
    public ArrayList f20446b;

    public final void a(Boolean bool, int i10, int i11) {
        ArrayList arrayList = this.f20446b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(u6.a(AndroidUtilities.replaceTags(LocaleController.getString(i10))));
            } else {
                arrayList.add(u6.a(AndroidUtilities.replaceTags(LocaleController.getString(i11))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i10;
        String string;
        int i11;
        ArrayList arrayList = this.f20446b;
        if (this.f20445a != requestPeerType) {
            this.f20445a = requestPeerType;
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
                        arrayList.add(u6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelBotParticipant))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(u6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelCreatorTrue))));
                    }
                } else {
                    a(requestPeerType.has_username, R.string.PeerRequirementGroupPublicTrue, R.string.PeerRequirementGroupPublicFalse);
                    a(requestPeerType.forum, R.string.PeerRequirementForumTrue, R.string.PeerRequirementForumFalse);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(u6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupBotParticipant))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(u6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupCreatorTrue))));
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
                            r6.r(string, 1, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            r6.r(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            r6.r(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z10) {
                                i10 = R.string.EditAdminDeleteMessages;
                            } else {
                                i10 = R.string.EditAdminGroupDeleteMessages;
                            }
                            r6.r(LocaleController.getString(i10), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            r6.r(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            r6.r(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            r6.r(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            r6.r(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            r6.r(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            r6.r(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            r6.r(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(u6.a(TextUtils.concat(replaceTags2, " ", ((u6) arrayList2.get(0)).f20492b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(replaceTags);
                            valueOf.append((CharSequence) " ");
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (i14 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((u6) arrayList2.get(i14)).f20492b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(u6.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                m4 m4Var = new m4(getContext(), 20);
                m4Var.setText(LocaleController.getString(R.string.PeerRequirements));
                int i15 = org.telegram.ui.ActionBar.j6.f17928d6;
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                addView(m4Var, w7.a6.n(-1, -2));
                Drawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                View s3Var = new s3(getContext(), 9, 1);
                s3Var.setBackground(colorDrawable);
                addView(s3Var, w7.a6.n(-1, -2));
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    u6 u6Var = (u6) obj;
                    Context context = getContext();
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (u6Var.f20491a <= 0) {
                        i11 = R.drawable.list_check;
                    } else {
                        i11 = R.drawable.list_circle;
                    }
                    imageView.setImageResource(i11);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false), PorterDuff.Mode.MULTIPLY));
                    linearLayout.addView(imageView, w7.a6.p(20, 20, 0.0f, 51, (u6Var.f20491a * 16) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false));
                    textView.setSingleLine(false);
                    textView.setText(u6Var.f20492b);
                    linearLayout.addView(textView, w7.a6.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(linearLayout, w7.a6.n(-1, -2));
                }
                Drawable colorDrawable2 = new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                View s3Var2 = new s3(getContext(), 12, 1);
                s3Var2.setBackground(colorDrawable2);
                addView(s3Var2, w7.a6.n(-1, -2));
                Drawable V0 = org.telegram.ui.ActionBar.j6.V0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7);
                View s3Var3 = new s3(getContext(), 12, 1);
                s3Var3.setBackground(V0);
                addView(s3Var3, w7.a6.n(-1, -2));
            }
        }
    }
}
