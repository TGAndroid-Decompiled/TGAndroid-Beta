package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda12;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda28;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda74;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public class UserSelectorBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public static AnonymousClass1 instance;
    public final AnonymousClass7 actionButton;
    public final LinkedHashMap allSelectedObjects;
    public final BirthdayController.BirthdayState birthdays;
    public final FrameLayout bulletinContainer;
    public final SelectorBtnCell buttonContainer;
    public final ArrayList contacts;
    public final ArrayList contactsLetters;
    public final HashMap contactsMap;
    public String customTitle;
    public final HashSet excludeUserIds;
    public final AnonymousClass4 headerView;
    public final ArrayList hints;
    public boolean includeTonOption;
    public boolean isHintSearchText;
    public final ArrayList items;
    public int listPaddingTop;
    public final ArrayList oldItems;
    public GroupCallActivity$$ExternalSyntheticLambda28 onShareCallLinkListener;
    public StarGiftSheet$$ExternalSyntheticLambda74 onUserSelectedListener;
    public Utilities.Callback2 onUsersSelectedListener;
    public final ArrayList paymentOptions;
    public String query;
    public float recipientsBtnExtraSpace;
    public AnonymousClass3 recipientsBtnSpaceSpan;
    public final PeerStoriesView.AnonymousClass34 remoteSearchRunnable;
    public int runningRequest;
    public final AnonymousClass5 searchField;
    public final ArrayList searchResult;
    public final AnonymousClass6 sectionCell;
    public final HashSet selectedIds;
    public SelectorAdapter selectorAdapter;
    public int tonDays;
    public CombinedDrawable tonIcon;
    public final int type;
    public final CheckBox2 videoCheckbox;

    public final class AnonymousClass1 extends UserSelectorBottomSheet {
    }

    public final class AnonymousClass3 extends ReplacementSpan {
        public AnonymousClass3() {
        }

        @Override
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        @Override
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) UserSelectorBottomSheet.this.recipientsBtnExtraSpace;
        }
    }

    public final class AnonymousClass4 extends SelectorHeaderCell {
        @Override
        public final int getHeaderHeight() {
            return getResources().getConfiguration().orientation == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(54.0f);
        }
    }

    public UserSelectorBottomSheet(Context context, final int i, BirthdayController.BirthdayState birthdayState, final int i2, final Theme.ResourcesProvider resourcesProvider) {
        super(context, null, true, false, false, resourcesProvider);
        this.oldItems = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        HashSet hashSet = new HashSet();
        this.selectedIds = hashSet;
        ArrayList arrayList2 = new ArrayList();
        this.contacts = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.hints = arrayList3;
        this.searchResult = new ArrayList();
        HashMap map = new HashMap();
        this.contactsMap = map;
        ArrayList arrayList4 = new ArrayList();
        this.contactsLetters = arrayList4;
        this.allSelectedObjects = new LinkedHashMap();
        this.listPaddingTop = AndroidUtilities.dp(120.0f);
        this.paymentOptions = new ArrayList();
        this.isHintSearchText = false;
        this.remoteSearchRunnable = new PeerStoriesView.AnonymousClass34(this, 3);
        this.runningRequest = -1;
        this.excludeUserIds = new HashSet();
        this.currentAccount = i;
        int i3 = Theme.key_dialogBackground;
        fixNavigationBar(Theme.getColor(i3, resourcesProvider));
        this.drawDoubleNavigationBar = false;
        this.type = i2;
        this.birthdays = birthdayState;
        SelectorAdapter selectorAdapter = this.selectorAdapter;
        if (selectorAdapter != null) {
            selectorAdapter.needChecks2 = i2 == 4;
        }
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(getContext(), resourcesProvider);
        this.headerView = anonymousClass4;
        anonymousClass4.setOnCloseClickListener(new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 12));
        anonymousClass4.setText(getTitle());
        anonymousClass4.setCloseImageVisible(false);
        anonymousClass4.backDrawable.setRotation(0.0f, false);
        this.recipientsBtnSpaceSpan = new AnonymousClass3();
        ?? r12 = new SelectorSearchCell(getContext(), resourcesProvider) {
            public boolean isKeyboardVisible;

            @Override
            public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                super.onLayout(z, i4, i5, i6, i7);
                int iDp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
                UserSelectorBottomSheet userSelectorBottomSheet = UserSelectorBottomSheet.this;
                userSelectorBottomSheet.listPaddingTop = iDp;
                SelectorAdapter selectorAdapter2 = userSelectorBottomSheet.selectorAdapter;
                ArrayList arrayList5 = selectorAdapter2.items;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    selectorAdapter2.lambda$onBindViewHolder$31(selectorAdapter2.items.size() - 1);
                }
                if (this.isKeyboardVisible != userSelectorBottomSheet.isKeyboardVisible()) {
                    boolean zIsKeyboardVisible = userSelectorBottomSheet.isKeyboardVisible();
                    this.isKeyboardVisible = zIsKeyboardVisible;
                    if (zIsKeyboardVisible) {
                        userSelectorBottomSheet.scrollToTop(true);
                    }
                }
            }
        };
        this.searchField = r12;
        r12.setBackgroundColor(getThemedColor(i3));
        r12.setOnSearchTextChange(new UserSelectorBottomSheet$$ExternalSyntheticLambda5(this, 0));
        r12.setHintText(LocaleController.getString((!hashSet.isEmpty() || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        ?? r11 = new View(getContext()) {
            @Override
            public final void onDraw(Canvas canvas) {
                canvas.drawColor(UserSelectorBottomSheet.this.getThemedColor(Theme.key_graySection));
            }
        };
        this.sectionCell = r11;
        ViewGroup viewGroup = this.containerView;
        int i4 = this.backgroundPaddingLeft;
        viewGroup.addView(anonymousClass4, 0, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i4, 0, i4, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i5 = this.backgroundPaddingLeft;
        viewGroup2.addView((View) r12, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i5, 0, i5, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i6 = this.backgroundPaddingLeft;
        viewGroup3.addView((View) r11, LayoutHelper.createFrameMarginPx(-1, 1.0f, 55, i6, 0, i6, 0));
        SelectorBtnCell selectorBtnCell = new SelectorBtnCell(getContext(), resourcesProvider, null);
        this.buttonContainer = selectorBtnCell;
        selectorBtnCell.setClickable(true);
        selectorBtnCell.setOrientation(1);
        selectorBtnCell.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        selectorBtnCell.setBackgroundColor(Theme.getColor(i3, resourcesProvider));
        if (i2 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 6, 6));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
            this.videoCheckbox = checkBox2;
            checkBox2.setColor(Theme.key_featuredStickers_addButton, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(true);
            checkBox2.setChecked(false, false);
            checkBox2.setDrawBackgroundAsArc(10);
            linearLayout.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
            ScaleStateListAnimator.apply(linearLayout, 0.025f, 1.5f);
            final int i7 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final UserSelectorBottomSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            CheckBox2 checkBox3 = this.f$0.videoCheckbox;
                            checkBox3.setChecked(!checkBox3.isChecked(), true);
                            break;
                        default:
                            this.f$0.next();
                            break;
                    }
                }
            });
            selectorBtnCell.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 8));
        }
        ?? r1 = new ButtonWithCounterView(getContext(), resourcesProvider) {
            @Override
            public final float calculateCounterWidth(float f, float f2) {
                UserSelectorBottomSheet userSelectorBottomSheet = UserSelectorBottomSheet.this;
                boolean z = userSelectorBottomSheet.recipientsBtnExtraSpace == 0.0f;
                userSelectorBottomSheet.recipientsBtnExtraSpace = f;
                if (z) {
                    userSelectorBottomSheet.recipientsBtnSpaceSpan = userSelectorBottomSheet.new AnonymousClass3();
                    userSelectorBottomSheet.updateActionButton$1(false);
                }
                return f;
            }
        };
        this.actionButton = r1;
        if (i2 == 4) {
            selectorBtnCell.setAlpha(0.0f);
            selectorBtnCell.setVisibility(8);
        }
        final int i8 = 1;
        r1.setOnClickListener(new View.OnClickListener(this) {
            public final UserSelectorBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        CheckBox2 checkBox3 = this.f$0.videoCheckbox;
                        checkBox3.setChecked(!checkBox3.isChecked(), true);
                        break;
                    default:
                        this.f$0.next();
                        break;
                }
            }
        });
        selectorBtnCell.addView((View) r1, LayoutHelper.createLinear(-1, 48, 87));
        if (i2 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i9 = this.backgroundPaddingLeft;
            viewGroup4.addView(selectorBtnCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i9, 0, i9, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.bulletinContainer = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, LayoutHelper.createFrameMarginPx(-1, 300.0f, 87, i10, 0, i10, AndroidUtilities.dp(68.0f)));
        SelectorAdapter selectorAdapter2 = this.selectorAdapter;
        RecyclerListView recyclerListView = this.recyclerListView;
        selectorAdapter2.items = arrayList;
        selectorAdapter2.listView = recyclerListView;
        int i11 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i11, 0, i11, AndroidUtilities.dp(i2 != 1 ? 60.0f : 0.0f));
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i12) {
                if (i12 == 1) {
                    AndroidUtilities.hideKeyboard(getEditText());
                }
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public final boolean hasDoubleTap(View view, int i12) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i12);
            }

            @Override
            public final void onDoubleTap(View view, int i12, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i12, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i12, float f, float f2) {
                this.f$0.lambda$new$8(view, i2, i, resourcesProvider);
            }
        });
        if (i2 == 4) {
            this.recyclerListView.setOnItemLongClickListener(new ExoPlayerImpl$$ExternalSyntheticLambda12(this, i2));
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        this.recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view, recyclerView, state);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                UserSelectorBottomSheet userSelectorBottomSheet = UserSelectorBottomSheet.this;
                if (childAdapterPosition == userSelectorBottomSheet.items.size()) {
                    rect.bottom = userSelectorBottomSheet.listPaddingTop;
                }
            }
        });
        r12.setText("");
        r12.spansContainer.removeAllSpans(false);
        r12.updateSpans(false, hashSet, new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 1), null);
        anonymousClass4.setText(getTitle());
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(getTitle());
        }
        updateActionButton$1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            map.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        }
        if (arrayList3.isEmpty()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        }
        updateList(false, true);
        if (i2 == 0 || i2 == 2) {
            BoostRepository.loadGiftOptions(i, null, new UserSelectorBottomSheet$$ExternalSyntheticLambda5(this, 1));
        }
        if (i2 == 0 || i2 == 2) {
            StarsController.getInstance(i, false).loadStarGifts();
        }
    }

    public static boolean handleIntent(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (scheme.equals("http") || scheme.equals("https")) {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    open(0, null);
                    return true;
                }
            } else if (scheme.equals("tg")) {
                String string = data.toString();
                if (string.startsWith("tg:premium_multigift") || string.startsWith("tg://premium_multigift")) {
                    open(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static AnonymousClass1 open(int i, BirthdayController.BirthdayState birthdayState) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return null;
        }
        AnonymousClass1 anonymousClass1 = instance;
        if (anonymousClass1 != null) {
            return anonymousClass1;
        }
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(lastFragment.getContext(), lastFragment.getCurrentAccount(), birthdayState, i, lastFragment.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(lastFragment)) {
            anonymousClass2.makeAttached(lastFragment);
        }
        lastFragment.showDialog(anonymousClass2);
        instance = anonymousClass2;
        return anonymousClass2;
    }

    public final int addSection(ArrayList arrayList, String str, ArrayList arrayList2) {
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        int iDp = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !UserObject.isService(user.id)) {
                long j = user.id;
                if (j != 0) {
                    if (!this.excludeUserIds.contains(Long.valueOf(j))) {
                        Long lValueOf = Long.valueOf(user.id);
                        HashSet hashSet = this.selectedIds;
                        hashSet.contains(lValueOf);
                        iDp += AndroidUtilities.dp(56.0f);
                        SelectorAdapter.Item itemAsUser = SelectorAdapter.Item.asUser(user, hashSet.contains(Long.valueOf(user.id)));
                        decorate(itemAsUser);
                        arrayList3.add(itemAsUser);
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return iDp;
        }
        int iDp2 = AndroidUtilities.dp(32.0f) + iDp;
        SelectorAdapter.Item item = new SelectorAdapter.Item(8, false);
        item.text = str;
        arrayList.add(item);
        arrayList.addAll(arrayList3);
        return iDp2;
    }

    public final void checkEditTextHint() {
        int i;
        if (!this.selectedIds.isEmpty() || (i = this.type) == 1 || i == 2 || i == 3 || i == 4) {
            if (this.isHintSearchText) {
                return;
            }
            this.isHintSearchText = true;
            AndroidUtilities.runOnUIThread(new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 5), 10L);
            return;
        }
        if (this.isHintSearchText) {
            this.isHintSearchText = false;
            AndroidUtilities.runOnUIThread(new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 4), 10L);
        }
    }

    public final void clearSearchAfterSelect() {
        if (TextUtils.isEmpty(this.query)) {
            return;
        }
        this.query = null;
        setText("");
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
        updateItems(true, true);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        SelectorAdapter selectorAdapter = new SelectorAdapter(getContext(), false, this.resourcesProvider);
        this.selectorAdapter = selectorAdapter;
        selectorAdapter.isGreenSelector = true;
        return selectorAdapter;
    }

    public final SelectorAdapter.Item decorate(SelectorAdapter.Item item) {
        int i = this.type;
        if (i != 4) {
            item.options = i == 3 ? null : new AlertDialog$$ExternalSyntheticLambda5(18, this, item.user);
            return item;
        }
        TLRPC.User user = item.user;
        if (user == null) {
            return item;
        }
        final long j = user.id;
        final int i2 = 0;
        ?? r2 = new View.OnClickListener(this) {
            public final UserSelectorBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$decorate$14(j);
                        break;
                    default:
                        this.f$0.lambda$decorate$15(j);
                        break;
                }
            }
        };
        final int i3 = 1;
        ?? r3 = new View.OnClickListener(this) {
            public final UserSelectorBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$decorate$14(j);
                        break;
                    default:
                        this.f$0.lambda$decorate$15(j);
                        break;
                }
            }
        };
        item.audioCall = r2;
        item.videoCall = r3;
        return item;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.giftsToUserSent) {
            AndroidUtilities.hideKeyboard(getEditText());
            super.lambda$showGiftOfferSheet$15();
        } else if (i == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 0));
        } else if (i == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 6));
        } else if (i == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 11));
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        AndroidUtilities.hideKeyboard(getEditText());
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        instance = null;
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
    }

    @Override
    public final CharSequence getTitle() {
        String str = this.customTitle;
        if (str != null) {
            return str;
        }
        int i = this.type;
        if (i != 0) {
            if (i == 1) {
                return LocaleController.getString(R.string.GiftStarsTitle);
            }
            if (i != 2) {
                return i != 4 ? LocaleController.getString(R.string.GiftTelegramPremiumTitle) : LocaleController.getString(R.string.VoipConferenceAddPeople);
            }
        }
        return LocaleController.getString(R.string.GiftTelegramPremiumOrStarsTitle);
    }

    public final void lambda$decorate$14(long j) {
        HashSet hashSet = this.selectedIds;
        hashSet.add(Long.valueOf(j));
        Utilities.Callback2 callback2 = this.onUsersSelectedListener;
        if (callback2 != null) {
            callback2.run(Boolean.FALSE, hashSet);
            this.onUsersSelectedListener = null;
        }
        AndroidUtilities.hideKeyboard(getEditText());
        super.lambda$showGiftOfferSheet$15();
    }

    public final void lambda$decorate$15(long j) {
        HashSet hashSet = this.selectedIds;
        hashSet.add(Long.valueOf(j));
        Utilities.Callback2 callback2 = this.onUsersSelectedListener;
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, hashSet);
            this.onUsersSelectedListener = null;
        }
        AndroidUtilities.hideKeyboard(getEditText());
        super.lambda$showGiftOfferSheet$15();
    }

    public final void lambda$didReceivedNotification$23() {
        ArrayList arrayList = this.contacts;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.contactsMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.contactsLetters.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            updateItems(true, true);
        }
    }

    public final void lambda$didReceivedNotification$24() {
        ArrayList arrayList = this.hints;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            updateItems(true, true);
        }
    }

    public final boolean lambda$new$11(int i, View view) {
        if (!(view instanceof SelectorUserCell)) {
            return false;
        }
        SelectorUserCell selectorUserCell = (SelectorUserCell) view;
        TLRPC.User user = selectorUserCell.getUser();
        long j = user != null ? user.id : -selectorUserCell.getChat().id;
        HashSet<Long> hashSet = this.selectedIds;
        boolean z = (i == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j))) {
            hashSet.remove(Long.valueOf(j));
        } else {
            hashSet.add(Long.valueOf(j));
            this.allSelectedObjects.put(Long.valueOf(j), user);
        }
        if (hashSet.size() == (this.type == 4 ? Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.excludeUserIds.size()) - 1) : 10) + 1) {
            hashSet.remove(Long.valueOf(j));
            showMaximumUsersToast();
            return true;
        }
        boolean z2 = (i == 4 && hashSet.isEmpty()) ? false : true;
        if (z != z2) {
            SelectorBtnCell selectorBtnCell = this.buttonContainer;
            selectorBtnCell.setVisibility(0);
            selectorBtnCell.animate().alpha(z2 ? 1.0f : 0.0f).translationY(z2 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).withEndAction(!z2 ? new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 8) : null).start();
            SelectorAdapter selectorAdapter = this.selectorAdapter;
            boolean z3 = !z2;
            if (selectorAdapter.callButtonsVisible != z3) {
                selectorAdapter.callButtonsVisible = z3;
                AndroidUtilities.forEachViews((RecyclerView) selectorAdapter.listView, (Consumer) new SelectorAdapter$$ExternalSyntheticLambda1(z3));
            }
        }
        checkEditTextHint();
        updateSpans(true, hashSet, new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 9), null);
        updateList(true, true);
        clearSearchAfterSelect();
        return true;
    }

    public final void lambda$new$13(List list) {
        ArrayList arrayList = this.paymentOptions;
        arrayList.clear();
        arrayList.addAll(list);
        AnonymousClass7 anonymousClass7 = this.actionButton;
        if (anonymousClass7.isLoading()) {
            anonymousClass7.setLoading(false);
            if (this.recyclerListView.isAttachedToWindow()) {
                next();
            }
        }
    }

    public final void lambda$new$8(View view, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        boolean z = false;
        int i3 = 10;
        int i4 = 2;
        int i5 = 3;
        boolean z2 = view instanceof TextCell;
        AnonymousClass5 anonymousClass5 = this.searchField;
        if (z2) {
            if (i != 4) {
                AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new UserSelectorBottomSheet$$ExternalSyntheticLambda5(this, i5), new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, i3), false, false, this.resourcesProvider).bottomSheet.show();
                return;
            }
            GroupCallActivity$$ExternalSyntheticLambda28 groupCallActivity$$ExternalSyntheticLambda28 = this.onShareCallLinkListener;
            if (groupCallActivity$$ExternalSyntheticLambda28 != null) {
                groupCallActivity$$ExternalSyntheticLambda28.run();
                AndroidUtilities.hideKeyboard(anonymousClass5.getEditText());
                super.lambda$showGiftOfferSheet$15();
                return;
            }
            return;
        }
        if (view instanceof SelectorUserCell) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) view;
            TLRPC.User user = selectorUserCell.getUser();
            TLRPC.Chat chat = selectorUserCell.getChat();
            if (user == null && chat == null && i == 3) {
                StarGiftSheet$$ExternalSyntheticLambda74 starGiftSheet$$ExternalSyntheticLambda74 = this.onUserSelectedListener;
                if (starGiftSheet$$ExternalSyntheticLambda74 != null) {
                    starGiftSheet$$ExternalSyntheticLambda74.run(-99L);
                    return;
                }
                return;
            }
            if (user == null && chat == null) {
                return;
            }
            long j = user != null ? user.id : -chat.id;
            if (i == 3) {
                StarGiftSheet$$ExternalSyntheticLambda74 starGiftSheet$$ExternalSyntheticLambda75 = this.onUserSelectedListener;
                if (starGiftSheet$$ExternalSyntheticLambda75 != null) {
                    starGiftSheet$$ExternalSyntheticLambda75.run(Long.valueOf(j));
                    return;
                }
                return;
            }
            if (i == 1) {
                if (anonymousClass5 != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass5.getEditText());
                }
                StarsIntroActivity.GiftStarsSheet giftStarsSheet = new StarsIntroActivity.GiftStarsSheet(getContext(), resourcesProvider, user, new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, 12));
                if (!AndroidUtilities.isTablet()) {
                    giftStarsSheet.makeAttached(this.attachedFragment);
                }
                giftStarsSheet.show();
                return;
            }
            if (i == 0 || i == 2) {
                if (UserObject.areGiftsDisabled(j)) {
                    BulletinFactory.of(this.container, resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j)))).show();
                    return;
                }
                GiftSheet giftSheet = new GiftSheet(getContext(), i2, j, BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(1, this.paymentOptions)), new UserSelectorBottomSheet$$ExternalSyntheticLambda5(this, i4));
                BirthdayController.BirthdayState birthdayState = this.birthdays;
                giftSheet.birthday = birthdayState != null && birthdayState.contains(j);
                giftSheet.adapter.update(false);
                giftSheet.show();
                return;
            }
            HashSet<Long> hashSet = this.selectedIds;
            if (i == 4 && hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j));
                Utilities.Callback2 callback2 = this.onUsersSelectedListener;
                if (callback2 != null) {
                    CheckBox2 checkBox2 = this.videoCheckbox;
                    if (checkBox2 != null && checkBox2.isChecked()) {
                        z = true;
                    }
                    callback2.run(Boolean.valueOf(z), hashSet);
                    this.onUsersSelectedListener = null;
                }
                AndroidUtilities.hideKeyboard(anonymousClass5.getEditText());
                super.lambda$showGiftOfferSheet$15();
                return;
            }
            boolean z3 = (i == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j))) {
                hashSet.remove(Long.valueOf(j));
            } else {
                hashSet.add(Long.valueOf(j));
                this.allSelectedObjects.put(Long.valueOf(j), user);
            }
            if (hashSet.size() == (this.type == 4 ? Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.excludeUserIds.size()) - 1) : 10) + 1) {
                hashSet.remove(Long.valueOf(j));
                showMaximumUsersToast();
                return;
            }
            boolean z4 = (i == 4 && hashSet.isEmpty()) ? false : true;
            if (z3 != z4) {
                SelectorBtnCell selectorBtnCell = this.buttonContainer;
                selectorBtnCell.setVisibility(0);
                selectorBtnCell.animate().alpha(z4 ? 1.0f : 0.0f).translationY(z4 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).withEndAction(!z4 ? new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, i4) : null).start();
                SelectorAdapter selectorAdapter = this.selectorAdapter;
                boolean z5 = !z4;
                if (selectorAdapter.callButtonsVisible != z5) {
                    selectorAdapter.callButtonsVisible = z5;
                    AndroidUtilities.forEachViews((RecyclerView) selectorAdapter.listView, (Consumer) new SelectorAdapter$$ExternalSyntheticLambda1(z5));
                }
            }
            checkEditTextHint();
            anonymousClass5.updateSpans(true, hashSet, new UserSelectorBottomSheet$$ExternalSyntheticLambda0(this, i5), null);
            updateList(true, true);
            clearSearchAfterSelect();
        }
    }

    public final void lambda$openBirthdaySetup$26(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        boolean z = tLObject instanceof TLRPC.TL_boolTrue;
        FrameLayout frameLayout = this.bulletinContainer;
        if (z) {
            BulletinFactory.of(frameLayout, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.PrivacyBirthdaySetDone)).setDuration(5000).show();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(frameLayout, this.resourcesProvider), R.raw.error);
        } else if (getContext() != null) {
            ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(getContext(), 0, this.resourcesProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)), null);
        }
    }

    public final void lambda$openBirthdaySetup$28(TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatebirthday, new StarGiftSheet$$ExternalSyntheticLambda1(this, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(this.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        updateItems(true, true);
    }

    public final void lambda$openOptions$22(final TLRPC.User user, View view) {
        final int i = 0;
        final int i2 = 1;
        ItemOptions.makeOptions(this.container, this.resourcesProvider, (View) view.getParent()).add(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(this) {
            public final UserSelectorBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        UserSelectorBottomSheet userSelectorBottomSheet = this.f$0;
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            BaseFragment baseFragment = userSelectorBottomSheet.getBaseFragment();
                            if (baseFragment != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                baseFragment.presentFragment(new ChatActivity(bundle));
                                break;
                            } else {
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                bottomSheetParams.transitionFromLeft = true;
                                if (safeLastFragment != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    safeLastFragment.showAsSheet(new ChatActivity(bundle2), bottomSheetParams);
                                    break;
                                }
                            }
                        } else {
                            userSelectorBottomSheet.getClass();
                            break;
                        }
                        break;
                    default:
                        UserSelectorBottomSheet userSelectorBottomSheet2 = this.f$0;
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            BaseFragment baseFragment2 = userSelectorBottomSheet2.getBaseFragment();
                            if (baseFragment2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                baseFragment2.presentFragment(new ProfileActivity(bundle3));
                                break;
                            } else {
                                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment2 != null) {
                                    BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
                                    bottomSheetParams2.transitionFromLeft = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    safeLastFragment2.showAsSheet(new ProfileActivity(bundle4), bottomSheetParams2);
                                    break;
                                }
                            }
                        } else {
                            userSelectorBottomSheet2.getClass();
                            break;
                        }
                        break;
                }
            }
        }).add(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final UserSelectorBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        UserSelectorBottomSheet userSelectorBottomSheet = this.f$0;
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            BaseFragment baseFragment = userSelectorBottomSheet.getBaseFragment();
                            if (baseFragment != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                baseFragment.presentFragment(new ChatActivity(bundle));
                                break;
                            } else {
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                bottomSheetParams.transitionFromLeft = true;
                                if (safeLastFragment != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    safeLastFragment.showAsSheet(new ChatActivity(bundle2), bottomSheetParams);
                                    break;
                                }
                            }
                        } else {
                            userSelectorBottomSheet.getClass();
                            break;
                        }
                        break;
                    default:
                        UserSelectorBottomSheet userSelectorBottomSheet2 = this.f$0;
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            BaseFragment baseFragment2 = userSelectorBottomSheet2.getBaseFragment();
                            if (baseFragment2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                baseFragment2.presentFragment(new ProfileActivity(bundle3));
                                break;
                            } else {
                                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment2 != null) {
                                    BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
                                    bottomSheetParams2.transitionFromLeft = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    safeLastFragment2.showAsSheet(new ProfileActivity(bundle4), bottomSheetParams2);
                                    break;
                                }
                            }
                        } else {
                            userSelectorBottomSheet2.getClass();
                            break;
                        }
                        break;
                }
            }
        }).show();
    }

    public final void lambda$search$0(TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = this.searchResult;
        arrayList.clear();
        this.runningRequest = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            int i = 0;
            messagesController.putUsers(tL_contacts_found.users, false);
            messagesController.putChats(tL_contacts_found.chats, false);
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                TLRPC.Peer peer = arrayList2.get(i2);
                i2++;
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId)) && (userOrChat2 = messagesController.getUserOrChat(peerDialogId)) != null) {
                    arrayList.add(userOrChat2);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
            }
            ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
            int size2 = arrayList3.size();
            while (i < size2) {
                TLRPC.Peer peer2 = arrayList3.get(i);
                i++;
                long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                if (!hashSet.contains(Long.valueOf(peerDialogId2)) && (userOrChat = messagesController.getUserOrChat(peerDialogId2)) != null) {
                    arrayList.add(userOrChat);
                    hashSet.add(Long.valueOf(peerDialogId2));
                }
            }
        }
        updateList(true, true);
    }

    public final void next() {
        boolean z = false;
        int i = 2;
        HashSet hashSet = this.selectedIds;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.paymentOptions;
            boolean zIsEmpty = arrayList.isEmpty();
            int i2 = this.type;
            if (!zIsEmpty || i2 == 0 || i2 == 2 || i2 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.allSelectedObjects.values()) {
                    if (hashSet.contains(Long.valueOf(user.id))) {
                        arrayList2.add(user);
                    }
                }
                AnonymousClass5 anonymousClass5 = this.searchField;
                AndroidUtilities.hideKeyboard(anonymousClass5.getEditText());
                if (i2 == 1) {
                    return;
                }
                if (i2 == 4) {
                    Utilities.Callback2 callback2 = this.onUsersSelectedListener;
                    if (callback2 != null) {
                        CheckBox2 checkBox2 = this.videoCheckbox;
                        if (checkBox2 != null && checkBox2.isChecked()) {
                            z = true;
                        }
                        callback2.run(Boolean.valueOf(z), hashSet);
                        this.onUsersSelectedListener = null;
                    }
                    AndroidUtilities.hideKeyboard(anonymousClass5.getEditText());
                    super.lambda$showGiftOfferSheet$15();
                    return;
                }
                ArrayList arrayListFilterGiftOptionsByBilling = BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j = ((TLRPC.User) arrayList2.get(0)).id;
                    if (UserObject.areGiftsDisabled(j)) {
                        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j)))).show();
                        return;
                    }
                    GiftSheet giftSheet = new GiftSheet(getContext(), this.currentAccount, j, arrayListFilterGiftOptionsByBilling, new UserSelectorBottomSheet$$ExternalSyntheticLambda5(this, i));
                    BirthdayController.BirthdayState birthdayState = this.birthdays;
                    giftSheet.birthday = birthdayState != null && birthdayState.contains(j);
                    giftSheet.adapter.update(false);
                    giftSheet.show();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateItems(false, true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final void onPreDraw(Canvas canvas, int i, float f) {
        float fMax = Math.max(i, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        AnonymousClass4 anonymousClass4 = this.headerView;
        anonymousClass4.setTranslationY(fMax);
        float translationY = anonymousClass4.getTranslationY() + anonymousClass4.getMeasuredHeight();
        AnonymousClass5 anonymousClass5 = this.searchField;
        anonymousClass5.setTranslationY(translationY);
        float translationY2 = anonymousClass5.getTranslationY() + anonymousClass5.getMeasuredHeight();
        AnonymousClass6 anonymousClass6 = this.sectionCell;
        anonymousClass6.setTranslationY(translationY2);
        this.recyclerListView.setTranslationY((anonymousClass6.getMeasuredHeight() + (anonymousClass5.getMeasuredHeight() + anonymousClass4.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final void scrollToTop(boolean z) {
        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2, 0.6f);
        linearSmoothScrollerCustom.setTargetPosition(1);
        linearSmoothScrollerCustom.setOffset(AndroidUtilities.dp(36.0f));
        this.recyclerListView.getLayoutManager().startSmoothScroll(linearSmoothScrollerCustom);
    }

    public final void search$1(String str) {
        if (this.runningRequest >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.runningRequest, true);
            this.runningRequest = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        this.runningRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_search, new RichMediaUploader$$ExternalSyntheticLambda0(this, 14));
    }

    public final void setTitle(String str) {
        this.customTitle = str;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(getTitle());
        }
        AnonymousClass4 anonymousClass4 = this.headerView;
        if (anonymousClass4 != null) {
            anonymousClass4.setText(getTitle());
        }
    }

    public final void showMaximumUsersToast() {
        String string;
        int i = this.type;
        if (i == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", i == 4 ? Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.excludeUserIds.size()) - 1) : 10);
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, string).show(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void updateActionButton$1(boolean z) {
        AnonymousClass7 anonymousClass7 = this.actionButton;
        anonymousClass7.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.selectedIds;
        if (this.type == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        } else if (LocaleController.isRTL) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.recipientsBtnSpaceSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.recipientsBtnSpaceSpan, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
        }
        anonymousClass7.setCount(hashSet.size(), true);
        anonymousClass7.setText(spannableStringBuilder, z, false);
        anonymousClass7.setEnabled(hashSet.size() > 0);
    }

    public final void updateItems(boolean z, boolean z2) {
        int iDp;
        TLRPC.User currentUser;
        float f;
        long j;
        SelectorAdapter.Item item;
        ArrayList arrayList;
        int size;
        int iDp2;
        int i;
        int i2;
        String str;
        ArrayList arrayList2;
        String str2;
        long clientUserId;
        int i3;
        long j2;
        int i4;
        HashSet hashSet;
        BirthdayController.BirthdayState birthdayState;
        SelectorAdapter selectorAdapter;
        int i5;
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList3 = this.oldItems;
        arrayList3.clear();
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList4 = this.items;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean zIsEmpty = TextUtils.isEmpty(this.query);
        HashSet hashSet2 = this.excludeUserIds;
        HashSet hashSet3 = this.selectedIds;
        int i6 = this.type;
        if (zIsEmpty) {
            if (this.includeTonOption && i6 == 3) {
                if (this.tonIcon == null) {
                    CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(46.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.mini_gram_72).mutate());
                    combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    this.tonIcon = combinedDrawable;
                }
                CombinedDrawable combinedDrawable2 = this.tonIcon;
                String string = LocaleController.getString(R.string.Gift2ExportTONTitle);
                int i7 = this.tonDays;
                String pluralString = i7 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i7, new Object[0]) : "";
                SelectorAdapter.Item item2 = new SelectorAdapter.Item(3, true);
                item2.id = 2;
                item2.icon = combinedDrawable2;
                item2.text = string;
                item2.subtext = pluralString;
                arrayList4.add(item2);
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            if ((i6 == 0 || i6 == 2) && userFull != null && userFull.birthday == null) {
                iDp = AndroidUtilities.dp(50.0f);
                int i8 = R.drawable.menu_birthday;
                String string2 = LocaleController.getString(R.string.GiftsBirthdaySetup);
                SelectorAdapter.Item item3 = new SelectorAdapter.Item(9, false);
                item3.id = 1;
                item3.resId = i8;
                item3.text = string2;
                arrayList4.add(item3);
            } else {
                iDp = 0;
            }
            if (this.onShareCallLinkListener != null && i6 == 4) {
                int i9 = R.drawable.msg2_link2;
                String string3 = LocaleController.getString(R.string.VoipConferenceShareLink);
                SelectorAdapter.Item item4 = new SelectorAdapter.Item(9, false);
                item4.id = 3;
                item4.resId = i9;
                item4.text = string3;
                arrayList4.add(item4);
            }
            BirthdayController.BirthdayState birthdayState2 = this.birthdays;
            if (birthdayState2 != null) {
                iDp = addSection(arrayList4, LocaleController.getString(R.string.BirthdayYesterday), birthdayState2.yesterday) + addSection(arrayList4, LocaleController.getString(R.string.BirthdayToday), birthdayState2.today) + iDp + addSection(arrayList4, LocaleController.getString(R.string.BirthdayTomorrow), birthdayState2.tomorrow);
            }
            if ((i6 == 0 || i6 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                String string4 = LocaleController.getString(R.string.Gift2MyselfSection);
                SelectorAdapter.Item item5 = new SelectorAdapter.Item(8, false);
                item5.text = string4;
                arrayList4.add(item5);
                SelectorAdapter.Item itemAsUser = SelectorAdapter.Item.asUser(currentUser, hashSet3.contains(Long.valueOf(currentUser.id)));
                itemAsUser.subtext = LocaleController.getString(R.string.Gift2Myself);
                arrayList4.add(itemAsUser);
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.hints;
            if (arrayList6.isEmpty()) {
                f = 32.0f;
                j = 0;
            } else {
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList6.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList6.get(i10);
                    int i11 = i10 + 1;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (user != null) {
                        long j3 = user.id;
                        if (j3 != 0 && !user.self && !user.bot && !UserObject.isService(j3) && !UserObject.isDeleted(user) && ((birthdayState2 == null || !birthdayState2.contains(user.id)) && !hashSet2.contains(Long.valueOf(user.id)))) {
                            if (hashSet3.contains(Long.valueOf(user.id))) {
                                arrayList5.add(Long.valueOf(user.id));
                            }
                            iDp += AndroidUtilities.dp(56.0f);
                            SelectorAdapter.Item itemAsUser2 = SelectorAdapter.Item.asUser(user, hashSet3.contains(Long.valueOf(user.id)));
                            decorate(itemAsUser2);
                            arrayList7.add(itemAsUser2);
                        }
                    }
                    i10 = i11;
                }
                f = 32.0f;
                j = 0;
                if (!arrayList7.isEmpty()) {
                    iDp += AndroidUtilities.dp(32.0f);
                    String string5 = LocaleController.getString(R.string.GiftPremiumFrequentContacts);
                    item = new SelectorAdapter.Item(8, false);
                    item.text = string5;
                    arrayList4.add(item);
                    arrayList4.addAll(arrayList7);
                }
                arrayList = this.contactsLetters;
                size = arrayList.size();
                iDp2 = iDp;
                i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i2 = i + 1;
                    str = (String) obj2;
                    arrayList2 = new ArrayList();
                    for (TLRPC.TL_contact tL_contact : (List) this.contactsMap.get(str)) {
                        int i12 = i2;
                        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                        i3 = size;
                        String str3 = str;
                        j2 = tL_contact.user_id;
                        if (j2 != clientUserId || j2 == j || ((birthdayState2 != null && birthdayState2.contains(j2)) || hashSet2.contains(Long.valueOf(tL_contact.user_id)))) {
                            i4 = i3;
                            hashSet = hashSet2;
                        } else {
                            i4 = i3;
                            hashSet = hashSet2;
                            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (user2 != null && !user2.bot) {
                                birthdayState = birthdayState2;
                                if (!UserObject.isService(user2.id)) {
                                    iDp2 += AndroidUtilities.dp(56.0f);
                                    if (hashSet3.contains(Long.valueOf(user2.id))) {
                                        arrayList5.add(Long.valueOf(user2.id));
                                    }
                                    SelectorAdapter.Item itemAsUser3 = SelectorAdapter.Item.asUser(user2, hashSet3.contains(Long.valueOf(user2.id)));
                                    decorate(itemAsUser3);
                                    arrayList2.add(itemAsUser3);
                                }
                            }
                            birthdayState2 = birthdayState;
                            hashSet2 = hashSet;
                            i2 = i12;
                            str = str3;
                            size = i4;
                        }
                        birthdayState = birthdayState2;
                        birthdayState2 = birthdayState;
                        hashSet2 = hashSet;
                        i2 = i12;
                        str = str3;
                        size = i4;
                    }
                    int i13 = i2;
                    int i14 = size;
                    str2 = str;
                    HashSet hashSet4 = hashSet2;
                    BirthdayController.BirthdayState birthdayState3 = birthdayState2;
                    if (!arrayList2.isEmpty()) {
                        iDp2 += AndroidUtilities.dp(f);
                        String upperCase = str2.toUpperCase();
                        SelectorAdapter.Item item6 = new SelectorAdapter.Item(7, false);
                        item6.text = upperCase;
                        arrayList4.add(item6);
                        arrayList4.addAll(arrayList2);
                    }
                    birthdayState2 = birthdayState3;
                    hashSet2 = hashSet4;
                    i = i13;
                    size = i14;
                }
                if (item != null && arrayList5.size() > 0 && !hashSet3.isEmpty()) {
                    String string6 = LocaleController.getString(R.string.DeselectAll);
                    AlertDialog$$ExternalSyntheticLambda5 alertDialog$$ExternalSyntheticLambda5 = new AlertDialog$$ExternalSyntheticLambda5(19, this, arrayList5);
                    item.subtext = string6;
                    item.callback = alertDialog$$ExternalSyntheticLambda5;
                }
            }
            item = null;
            arrayList = this.contactsLetters;
            size = arrayList.size();
            iDp2 = iDp;
            i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i2 = i + 1;
                str = (String) obj3;
                arrayList2 = new ArrayList();
                while (r15.hasNext()) {
                    int i15 = i2;
                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    i3 = size;
                    String str4 = str;
                    j2 = tL_contact.user_id;
                    if (j2 != clientUserId) {
                        i4 = i3;
                        hashSet = hashSet2;
                        birthdayState = birthdayState2;
                    } else {
                        i4 = i3;
                        hashSet = hashSet2;
                        birthdayState = birthdayState2;
                    }
                    birthdayState2 = birthdayState;
                    hashSet2 = hashSet;
                    i2 = i15;
                    str = str4;
                    size = i4;
                }
                int i16 = i2;
                int i17 = size;
                str2 = str;
                HashSet hashSet5 = hashSet2;
                BirthdayController.BirthdayState birthdayState4 = birthdayState2;
                if (!arrayList2.isEmpty()) {
                    iDp2 += AndroidUtilities.dp(f);
                    String upperCase2 = str2.toUpperCase();
                    SelectorAdapter.Item item7 = new SelectorAdapter.Item(7, false);
                    item7.text = upperCase2;
                    arrayList4.add(item7);
                    arrayList4.addAll(arrayList2);
                }
                birthdayState2 = birthdayState4;
                hashSet2 = hashSet5;
                i = i16;
                size = i17;
            }
            if (item != null) {
                String string7 = LocaleController.getString(R.string.DeselectAll);
                AlertDialog$$ExternalSyntheticLambda5 alertDialog$$ExternalSyntheticLambda6 = new AlertDialog$$ExternalSyntheticLambda5(19, this, arrayList5);
                item.subtext = string7;
                item.callback = alertDialog$$ExternalSyntheticLambda6;
            }
        } else {
            ArrayList arrayList8 = this.searchResult;
            int i18 = 0;
            iDp2 = 0;
            for (int size3 = arrayList8.size(); i18 < size3; size3 = i5) {
                Object obj4 = arrayList8.get(i18);
                i18++;
                TLObject tLObject = (TLObject) obj4;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    i5 = size3;
                    if (!user3.bot && !UserObject.isService(user3.id)) {
                        long j4 = user3.id;
                        iDp2 = AndroidUtilities.dp(56.0f) + iDp2;
                        if (!hashSet2.contains(Long.valueOf(user3.id))) {
                            SelectorAdapter.Item itemAsUser4 = SelectorAdapter.Item.asUser(user3, hashSet3.contains(Long.valueOf(j4)));
                            decorate(itemAsUser4);
                            arrayList4.add(itemAsUser4);
                        }
                    }
                } else {
                    i5 = size3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (i6 == 3 && ChatObject.isChannelAndNotMegaGroup(chat)) {
                            long j5 = -chat.id;
                            iDp2 += AndroidUtilities.dp(56.0f);
                            if (!hashSet2.contains(Long.valueOf(-chat.id))) {
                                boolean zContains = hashSet3.contains(Long.valueOf(j5));
                                SelectorAdapter.Item item8 = new SelectorAdapter.Item(3, true);
                                item8.chat = chat;
                                item8.user = null;
                                item8.peer = null;
                                item8.checked = zContains;
                                arrayList4.add(item8);
                            }
                        }
                    }
                }
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new SelectorAdapter.Item(5, false));
            iDp2 += AndroidUtilities.dp(150.0f);
        }
        int iMax = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - iDp2);
        SelectorAdapter.Item item9 = new SelectorAdapter.Item(-1, false);
        item9.padHeight = iMax;
        arrayList4.add(item9);
        if (!z2 || (selectorAdapter = this.selectorAdapter) == null) {
            return;
        }
        if (z) {
            selectorAdapter.setItems(arrayList3, arrayList4);
        } else {
            selectorAdapter.notifyDataSetChanged();
        }
    }

    public final void updateList(boolean z, boolean z2) {
        int childAdapterPosition;
        int childAdapterPosition2;
        updateItems(z, z2);
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < this.recyclerListView.getChildCount(); i3++) {
            View childAt = this.recyclerListView.getChildAt(i3);
            if ((childAt instanceof SelectorUserCell) && (childAdapterPosition2 = (childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt)) - 1) >= 0) {
                ArrayList arrayList = this.items;
                if (childAdapterPosition2 < arrayList.size()) {
                    if (i == -1) {
                        i = childAdapterPosition;
                    }
                    SelectorAdapter.Item item = (SelectorAdapter.Item) arrayList.get(childAdapterPosition2);
                    SelectorUserCell selectorUserCell = (SelectorUserCell) childAt;
                    selectorUserCell.setChecked(item.checked, z);
                    TLRPC.Chat chat = item.chat;
                    if (chat != null) {
                        selectorUserCell.setCheckboxAlpha(this.selectorAdapter.getParticipantsCount$2(chat) > 200 ? 0.3f : 1.0f, z);
                    } else {
                        selectorUserCell.setCheckboxAlpha(1.0f, z);
                    }
                    i2 = childAdapterPosition;
                }
            }
        }
        if (z) {
            this.selectorAdapter.notifyItemRangeChanged(0, i);
            SelectorAdapter selectorAdapter = this.selectorAdapter;
            selectorAdapter.notifyItemRangeChanged(i2, selectorAdapter.getItemCount() - i2);
        }
        updateActionButton$1(z);
    }
}
