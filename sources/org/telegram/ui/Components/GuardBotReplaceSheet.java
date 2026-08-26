package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatRightsEditActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class GuardBotReplaceSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final LinearLayout contentLayout;

    public GuardBotReplaceSheet(Activity activity, Theme.ResourcesProvider resourcesProvider, TLRPC.User user, TLObject tLObject, ChatRightsEditActivity$$ExternalSyntheticLambda5 chatRightsEditActivity$$ExternalSyntheticLambda5) {
        super(activity, null, false, false, false, false, false, 1, resourcesProvider);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.contentLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        int iDp = AndroidUtilities.dp(60.0f);
        ProfileActivity.AvatarImageView avatarImageView = new ProfileActivity.AvatarImageView(activity);
        avatarImageView.setRoundRadius(iDp / 2);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo((TLObject) user);
        avatarImageView.setImageDrawable(avatarDrawable);
        avatarImageView.setLayoutParams(new FrameLayout.LayoutParams(iDp, iDp));
        int iDp2 = AndroidUtilities.dp(60.0f);
        ProfileActivity.AvatarImageView avatarImageView2 = new ProfileActivity.AvatarImageView(activity);
        avatarImageView2.setRoundRadius(iDp2 / 2);
        AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable2.setInfo(tLObject);
        avatarImageView2.setImageDrawable(avatarDrawable2);
        avatarImageView2.setLayoutParams(new FrameLayout.LayoutParams(iDp2, iDp2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(avatarImageView, LayoutHelper.createLinear(60, 60));
        linearLayout2.addView(imageView, LayoutHelper.createLinear(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(avatarImageView2, LayoutHelper.createLinear(60, 60));
        frameLayout.addView(linearLayout2, LayoutHelper.createFrame(-2, -2, 17));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        zzkq.m(20.0f, R.string.GuardBotReplaceTitle, textView);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 6));
        String shortName = DialogObject.getShortName(user);
        String shortName2 = DialogObject.getShortName(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotReplaceMessage, shortName, shortName2)));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(i, resourcesProvider));
        textView2.setLineSpacing(AndroidUtilities.dp(2.66f), 1.0f);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, 29));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setText(LocaleController.formatString(R.string.GuardBotReplaceUseNew, shortName2), false, true);
        buttonWithCounterView.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(28, this, chatRightsEditActivity$$ExternalSyntheticLambda5));
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(activity, resourcesProvider, true);
        buttonWithCounterView2.setRoundRadius(24);
        buttonWithCounterView2.setNeutral();
        buttonWithCounterView2.setText(LocaleController.formatString(R.string.GuardBotReplaceKeepCurrent, shortName), false, true);
        buttonWithCounterView2.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 27));
        linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, 0);
        this.adapter.update(false);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 2), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        return "";
    }
}
