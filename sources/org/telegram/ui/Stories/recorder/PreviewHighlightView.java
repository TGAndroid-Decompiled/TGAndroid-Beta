package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoryCaptionView;

public final class PreviewHighlightView extends FrameLayout {
    public final FrameLayout bottom;
    public final int currentAccount;
    public boolean shownBottom;
    public boolean shownTop;
    public int storiesCount;
    public final StoryCaptionView storyCaptionView;
    public final GroupCreateActivity.AnonymousClass7 top;

    public PreviewHighlightView(Activity activity, int i, DarkThemeResourceProvider darkThemeResourceProvider) {
        super(activity);
        this.storiesCount = 1;
        this.shownTop = false;
        this.shownBottom = false;
        this.currentAccount = i;
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(this, getContext());
        this.top = anonymousClass7;
        PeerStoriesView.PeerHeaderView peerHeaderView = new PeerStoriesView.PeerHeaderView(getContext(), null);
        UserCell.AnonymousClass2 anonymousClass2 = peerHeaderView.backupImageView;
        anonymousClass2.getAvatarDrawable().setInfo(i, currentUser);
        anonymousClass2.imageReceiver.setForUserOrChat(currentUser, anonymousClass2.getAvatarDrawable());
        anonymousClass2.onNewImageSet();
        String userName = UserObject.getUserName(currentUser);
        UserCell2.AnonymousClass1 anonymousClass1 = peerHeaderView.titleView;
        anonymousClass1.setText(Emoji.replaceEmoji(userName, anonymousClass1.getPaint().getFontMetricsInt(), false), false);
        peerHeaderView.setSubtitle(LocaleController.getString(R.string.RightNow), false);
        anonymousClass7.addView(peerHeaderView, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        anonymousClass7.addView(imageView, LayoutHelper.createFrame(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(anonymousClass7, LayoutHelper.createFrame(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.bottom = frameLayout;
        StoryCaptionView storyCaptionView = new StoryCaptionView(getContext(), darkThemeResourceProvider);
        this.storyCaptionView = storyCaptionView;
        storyCaptionView.disableTouches = true;
        storyCaptionView.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(storyCaptionView, LayoutHelper.createFrame(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, LayoutHelper.createFrame(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), ColorUtils.setAlphaComponent(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, LayoutHelper.createFrame(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, LayoutHelper.createFrame(-1.0f, -1));
        anonymousClass7.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void show(boolean z, boolean z2, FrameLayout frameLayout) {
        float f;
        if (z) {
            if (this.shownTop == z2) {
                return;
            } else {
                this.shownTop = z2;
            }
        } else if (this.shownBottom == z2) {
            return;
        } else {
            this.shownBottom = z2;
        }
        View view = z ? this.top : this.bottom;
        view.clearAnimation();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        if (z2) {
            f = z ? 0.5f : 0.2f;
        } else {
            f = 0.0f;
        }
        viewPropertyAnimatorAnimate.alpha(f).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(z2 ? 0.0f : 1.0f).start();
        }
    }
}
