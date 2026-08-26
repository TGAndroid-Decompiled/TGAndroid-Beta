package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ProfileHoursCell;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ProfileChannelCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Components.ClickableAnimatedTextView;

public final class ProfileActivity$$ExternalSyntheticLambda54 implements Consumer {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda54(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = this.f$0;
                profileActivity.getClass();
                if (view instanceof HeaderCell) {
                    ((HeaderCell) view).setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, profileActivity.resourcesProvider));
                } else if (view instanceof TextDetailCell) {
                    ((TextDetailCell) view).updateColors();
                } else if (view instanceof TextCell) {
                    ((TextCell) view).updateColors();
                } else if (view instanceof AboutLinkCell) {
                    AboutLinkCell aboutLinkCell = (AboutLinkCell) view;
                    aboutLinkCell.getClass();
                    Theme.profile_aboutTextPaint.linkColor = Theme.getColor(Theme.key_chat_messageLinkIn, aboutLinkCell.resourcesProvider);
                } else if (view instanceof NotificationsCheckCell) {
                    ((NotificationsCheckCell) view).getCheckBox().invalidate();
                } else if (view instanceof ProfileHoursCell) {
                    ProfileHoursCell profileHoursCell = (ProfileHoursCell) view;
                    ClickableAnimatedTextView clickableAnimatedTextView = profileHoursCell.switchText;
                    int iDp = AndroidUtilities.dp(8.0f);
                    int i = Theme.key_windowBackgroundWhiteBlueText2;
                    Theme.ResourcesProvider resourcesProvider = profileHoursCell.resourcesProvider;
                    int iMultAlpha = Theme.multAlpha(0.1f, Theme.getColor(i, resourcesProvider));
                    int iMultAlpha2 = Theme.multAlpha(0.22f, Theme.getColor(i, resourcesProvider));
                    clickableAnimatedTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, iMultAlpha, iMultAlpha2, iMultAlpha2));
                    profileHoursCell.switchText.setTextColor(Theme.getColor(i, resourcesProvider));
                } else if (view instanceof ProfileChannelCell) {
                    ((ProfileChannelCell) view).updateColors$1();
                }
                ProfileActivity.ListAdapter listAdapter = profileActivity.listAdapter;
                profileActivity.listView.getClass();
                listAdapter.getItemViewType(RecyclerView.getChildAdapterPosition(view));
                profileActivity.listAdapter.getClass();
                break;
            default:
                ProfileActivity profileActivity2 = this.f$0;
                profileActivity2.getClass();
                if (view instanceof TextDetailCell) {
                    TextDetailCell textDetailCell = (TextDetailCell) view;
                    textDetailCell.textView.setLoading(profileActivity2.loadingSpan);
                    textDetailCell.valueTextView.setLoading(profileActivity2.loadingSpan);
                }
                break;
        }
    }
}
