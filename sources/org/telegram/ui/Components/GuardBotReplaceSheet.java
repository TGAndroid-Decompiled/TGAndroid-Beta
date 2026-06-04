package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class GuardBotReplaceSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private final LinearLayout contentLayout;
    private final ButtonWithCounterView keepCurrentButton;
    private final ButtonWithCounterView useNewButton;

    private GuardBotReplaceSheet(Context context, Theme.ResourcesProvider resourcesProvider, int i, TLObject tLObject, TLObject tLObject2, final Runnable runnable) {
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.FADING, resourcesProvider);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.contentLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View viewBuildAvatar = buildAvatar(context, tLObject, AndroidUtilities.dp(60.0f));
        View viewBuildAvatar2 = buildAvatar(context, tLObject2, AndroidUtilities.dp(60.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(viewBuildAvatar, LayoutHelper.createLinear(60, 60));
        linearLayout2.addView(imageView, LayoutHelper.createLinear(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(viewBuildAvatar2, LayoutHelper.createLinear(60, 60));
        frameLayout.addView(linearLayout2, LayoutHelper.createFrame(-2, -2, 17));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GuardBotReplaceTitle));
        textView.setTextSize(1, 20.0f);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 6));
        String shortName = DialogObject.getShortName(tLObject);
        String shortName2 = DialogObject.getShortName(tLObject2);
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(buildSubtitle(shortName, shortName2));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setLineSpacing(AndroidUtilities.dp(2.66f), 1.0f);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, 29));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.useNewButton = buttonWithCounterView;
        buttonWithCounterView.setRound();
        buttonWithCounterView.setText(LocaleController.formatString(R.string.GuardBotReplaceUseNew, shortName2), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(runnable, view);
            }
        });
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 14.0f, 0.0f, 14.0f, 10.0f));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider);
        this.keepCurrentButton = buttonWithCounterView2;
        buttonWithCounterView2.setRound();
        buttonWithCounterView2.setNeutral();
        buttonWithCounterView2.setText(LocaleController.formatString(R.string.GuardBotReplaceKeepCurrent, shortName), false);
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(view);
            }
        });
        linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 14.0f, 0.0f, 14.0f, 14.0f));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, 0, i3, 0);
        this.adapter.update(false);
    }

    public void lambda$new$0(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    public void lambda$new$1(View view) {
        lambda$new$0();
    }

    private View buildAvatar(Context context, TLObject tLObject, int i) {
        ProfileActivity.AvatarImageView avatarImageView = new ProfileActivity.AvatarImageView(context);
        avatarImageView.setRoundRadius(i / 2);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(tLObject);
        avatarImageView.setImageDrawable(avatarDrawable);
        avatarImageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        return avatarImageView;
    }

    private static CharSequence buildSubtitle(String str, String str2) {
        return AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotReplaceMessage, str, str2));
    }

    @Override
    protected CharSequence getTitle() {
        return "";
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(-1, this.contentLayout));
    }

    public static void show(Context context, Theme.ResourcesProvider resourcesProvider, int i, TLObject tLObject, TLObject tLObject2, Runnable runnable) {
        new GuardBotReplaceSheet(context, resourcesProvider, i, tLObject, tLObject2, runnable).show();
    }
}
