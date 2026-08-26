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
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class RequestPeerRequirementsCell extends LinearLayout {
    public static final int $r8$clinit = 0;
    public TLRPC.RequestPeerType requestPeerType;
    public final ArrayList requirements;

    public final class RequirementCell extends LinearLayout {
    }

    public RequestPeerRequirementsCell(Context context) {
        super(context);
        this.requirements = new ArrayList();
        setOrientation(1);
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
    }

    public final void checkRequirement(Boolean bool, int i, int i2) {
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            ArrayList arrayList = this.requirements;
            if (zBooleanValue) {
                arrayList.add(new Requirement(AndroidUtilities.replaceTags(LocaleController.getString(i)), 0));
            } else {
                arrayList.add(new Requirement(AndroidUtilities.replaceTags(LocaleController.getString(i2)), 0));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i = 1;
        if (this.requestPeerType != requestPeerType) {
            this.requestPeerType = requestPeerType;
            removeAllViews();
            ArrayList arrayList = this.requirements;
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                checkRequirement(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, R.string.PeerRequirementPremiumTrue, R.string.PeerRequirementPremiumFalse);
            } else {
                boolean z = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z) {
                    checkRequirement(requestPeerType.has_username, R.string.PeerRequirementChannelPublicTrue, R.string.PeerRequirementChannelPublicFalse);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(new Requirement(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelBotParticipant)), 0));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(new Requirement(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelCreatorTrue)), 0));
                    }
                } else {
                    checkRequirement(requestPeerType.has_username, R.string.PeerRequirementGroupPublicTrue, R.string.PeerRequirementGroupPublicFalse);
                    checkRequirement(requestPeerType.forum, R.string.PeerRequirementForumTrue, R.string.PeerRequirementForumFalse);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(new Requirement(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupBotParticipant)), 0));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(new Requirement(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupCreatorTrue)), 0));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    int i2 = R.string.PeerRequirementUserRights;
                    int i3 = R.string.PeerRequirementUserRight;
                    SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i2));
                    SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(i3));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            zzlk.m(z ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z) {
                            zzlk.m(LocaleController.getString(R.string.EditAdminPostMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z) {
                            zzlk.m(LocaleController.getString(R.string.EditAdminEditMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            zzlk.m(LocaleController.getString(z ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z) {
                            zzlk.m(LocaleController.getString(R.string.EditAdminBanUsers), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            zzlk.m(LocaleController.getString(R.string.EditAdminAddUsers), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z) {
                            zzlk.m(LocaleController.getString(R.string.EditAdminPinMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            zzlk.m(LocaleController.getString(R.string.EditAdminAddAdmins), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z) {
                            zzlk.m(LocaleController.getString(R.string.EditAdminSendAnonymously), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            zzlk.m(LocaleController.getString(R.string.StartVoipChatPermission), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z) {
                            zzlk.m(LocaleController.getString(R.string.ManageTopicsPermission), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(new Requirement(TextUtils.concat(spannableStringBuilderReplaceTags2, " ", ((Requirement) arrayList2.get(0)).text), 0));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(spannableStringBuilderReplaceTags);
                            spannableStringBuilderValueOf.append((CharSequence) " ");
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                if (i4 > 0) {
                                    spannableStringBuilderValueOf.append((CharSequence) ", ");
                                }
                                spannableStringBuilderValueOf.append((CharSequence) ((Requirement) arrayList2.get(i4)).text.toString().toLowerCase());
                            }
                            spannableStringBuilderValueOf.append((CharSequence) ".");
                            arrayList.add(new Requirement(spannableStringBuilderValueOf, 0));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            HeaderCell headerCell = new HeaderCell(getContext(), 20);
            headerCell.setText(LocaleController.getString(R.string.PeerRequirements));
            int i5 = Theme.key_windowBackgroundWhite;
            headerCell.setBackgroundColor(Theme.getColor(null, i5, false));
            addView(headerCell, LayoutHelper.createLinear(-1, -2));
            Drawable colorDrawable = new ColorDrawable(Theme.getColor(null, i5, false));
            View fixedHeightEmptyCell = new FixedHeightEmptyCell(getContext(), 9, i);
            fixedHeightEmptyCell.setBackground(colorDrawable);
            addView(fixedHeightEmptyCell, LayoutHelper.createLinear(-1, -2));
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                Requirement requirement = (Requirement) obj;
                Context context = getContext();
                RequirementCell requirementCell = new RequirementCell(context);
                requirementCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                requirementCell.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(requirement.padding <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false), PorterDuff.Mode.MULTIPLY));
                requirementCell.addView(imageView, LayoutHelper.createLinear(20, 20, 0.0f, 51, (requirement.padding * 16) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
                textView.setSingleLine(false);
                textView.setText(requirement.text);
                requirementCell.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 6, 4, 24, 4));
                addView(requirementCell, LayoutHelper.createLinear(-1, -2));
            }
            Drawable colorDrawable2 = new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            int i7 = 12;
            View fixedHeightEmptyCell2 = new FixedHeightEmptyCell(getContext(), i7, i);
            fixedHeightEmptyCell2.setBackground(colorDrawable2);
            addView(fixedHeightEmptyCell2, LayoutHelper.createLinear(-1, -2));
            Drawable themedDrawableByKey = Theme.getThemedDrawableByKey(getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow);
            View fixedHeightEmptyCell3 = new FixedHeightEmptyCell(getContext(), i7, i);
            fixedHeightEmptyCell3.setBackground(themedDrawableByKey);
            addView(fixedHeightEmptyCell3, LayoutHelper.createLinear(-1, -2));
        }
    }
}
