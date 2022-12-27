package org.telegram.p009ui;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.Delegates.MemberRequestsDelegate;

public class MemberRequestsActivity extends BaseFragment {
    private final MemberRequestsDelegate delegate;

    public MemberRequestsActivity(long j) {
        this.delegate = new MemberRequestsDelegate(this, getLayoutContainer(), j, true) {
            @Override
            public void onImportersChanged(String str, boolean z, boolean z2) {
                if (z2) {
                    ((BaseFragment) MemberRequestsActivity.this).actionBar.setSearchFieldText("");
                } else {
                    super.onImportersChanged(str, z, z2);
                }
            }
        };
    }

    @Override
    public View createView(Context context) {
        int i;
        String str;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    MemberRequestsActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        C1133ActionBar c1133ActionBar = this.actionBar;
        if (this.delegate.isChannel) {
            i = C1072R.string.SubscribeRequests;
            str = "SubscribeRequests";
        } else {
            i = C1072R.string.MemberRequests;
            str = "MemberRequests";
        }
        c1133ActionBar.setTitle(LocaleController.getString(str, i));
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, C1072R.C1073drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                super.onSearchExpand();
                MemberRequestsActivity.this.delegate.setSearchExpanded(true);
            }

            @Override
            public void onSearchCollapse() {
                super.onSearchCollapse();
                MemberRequestsActivity.this.delegate.setSearchExpanded(false);
                MemberRequestsActivity.this.delegate.setQuery(null);
            }

            @Override
            public void onTextChanged(EditText editText) {
                super.onTextChanged(editText);
                MemberRequestsActivity.this.delegate.setQuery(editText.getText().toString());
            }
        });
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString("Search", C1072R.string.Search));
        actionBarMenuItemSearchListener.setVisibility(8);
        FrameLayout rootLayout = this.delegate.getRootLayout();
        this.delegate.loadMembers();
        this.fragmentView = rootLayout;
        return rootLayout;
    }

    @Override
    public boolean onBackPressed() {
        return this.delegate.onBackPressed();
    }
}
