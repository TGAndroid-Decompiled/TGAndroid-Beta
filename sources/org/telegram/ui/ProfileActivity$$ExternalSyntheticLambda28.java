package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ProfileActionsView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StarRatingView;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;

public final class ProfileActivity$$ExternalSyntheticLambda28 implements RecyclerListView.OnItemLongClickListener, MessagesStorage.BooleanCallback, GroupCreateActivity.ContactsAddActivityDelegate, FlagSecureReason.FlagSecureCondition, AlertDialog.OnButtonClickListener, StarRatingView.Delegate, OnApplyWindowInsetsListener, ProfileActionsView.OnActionClickListener, ViewGroupPartRenderer.DrawChildMethod {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda28(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public void didSelectUsers(ArrayList arrayList, int i) {
        this.f$0.lambda$openAddMember$93(arrayList, i);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return this.f$0.lambda$createView$18(canvas, view, j);
    }

    @Override
    public void needAddBot(TLRPC.User user) {
        GroupCreateActivity.ContactsAddActivityDelegate.CC.$default$needAddBot(this, user);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public void onClick(int i, float f, float f2) {
        this.f$0.lambda$createView$17(i, f, f2);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createView$32(view, i);
    }

    @Override
    public void onUpdateState(float f) {
        this.f$0.lambda$createView$39(f);
    }

    @Override
    public void run(boolean z) {
        this.f$0.lambda$leaveChatPressed$85(z);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 4:
                this.f$0.lambda$createView$31(alertDialog, i);
                break;
            case 5:
                this.f$0.lambda$onBlockContactClicked$50(alertDialog, i);
                break;
            default:
                this.f$0.lambda$createView$25(alertDialog, i);
                break;
        }
    }

    @Override
    public boolean run() {
        return this.f$0.lambda$setParentLayout$6();
    }
}
