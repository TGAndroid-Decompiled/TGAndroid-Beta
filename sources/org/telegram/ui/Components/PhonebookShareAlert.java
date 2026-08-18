package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;

public class PhonebookShareAlert extends BottomSheet {
    private ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private View actionBarShadow;
    private Paint backgroundPaint;
    private TextView buttonTextView;
    private TLRPC.User currentUser;
    private ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate delegate;
    private boolean inLayout;
    private boolean isImport;
    private LinearLayout linearLayout;
    private ListAdapter listAdapter;
    private ArrayList other;
    private BaseFragment parentFragment;
    private int phoneEndRow;
    private int phoneStartRow;
    private ArrayList phones;
    private int rowCount;
    private int scrollOffsetY;
    private NestedScrollView scrollView;
    private View shadow;
    private AnimatorSet shadowAnimation;
    private int userRow;
    private int vcardEndRow;
    private int vcardStartRow;

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public class UserCell extends LinearLayout {
        public UserCell(Context context) {
            String userStatus;
            boolean z;
            super(context);
            setOrientation(1);
            if (PhonebookShareAlert.this.phones.size() != 1 || PhonebookShareAlert.this.other.size() != 0) {
                userStatus = (PhonebookShareAlert.this.currentUser.status == null || PhonebookShareAlert.this.currentUser.status.expires == 0) ? null : LocaleController.formatUserStatus(((BottomSheet) PhonebookShareAlert.this).currentAccount, PhonebookShareAlert.this.currentUser);
                z = true;
            } else {
                userStatus = ((AndroidUtilities.VcardItem) PhonebookShareAlert.this.phones.get(0)).getValue(true);
                z = false;
            }
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setTextSize(AndroidUtilities.dp(30.0f));
            avatarDrawable.setInfo(((BottomSheet) PhonebookShareAlert.this).currentAccount, PhonebookShareAlert.this.currentUser);
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setRoundRadius(AndroidUtilities.dp(40.0f));
            backupImageView.setForUserOrChat(PhonebookShareAlert.this.currentUser, avatarDrawable);
            addView(backupImageView, LayoutHelper.createLinear(80, 80, 49, 0, 32, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 17.0f);
            textView.setTextColor(PhonebookShareAlert.this.getThemedColor(Theme.key_dialogTextBlack));
            textView.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setText(ContactsController.formatName(PhonebookShareAlert.this.currentUser.first_name, PhonebookShareAlert.this.currentUser.last_name));
            addView(textView, LayoutHelper.createLinear(-2, -2, 49, 10, 10, 10, userStatus != null ? 0 : 27));
            if (userStatus != null) {
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(PhonebookShareAlert.this.getThemedColor(Theme.key_dialogTextGray3));
                textView2.setSingleLine(true);
                textView2.setEllipsize(truncateAt);
                textView2.setText(userStatus);
                addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 10, 3, 10, z ? 27 : 11));
            }
        }
    }

    public class TextCheckBoxCell extends FrameLayout {
        private Switch checkBox;
        private ImageView imageView;
        private boolean needDivider;
        private TextView textView;
        private TextView valueTextView;

        public TextCheckBoxCell(Context context) {
            float f;
            float f2;
            float f3;
            float f4;
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(PhonebookShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setSingleLine(false);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.textView;
            boolean z = LocaleController.isRTL;
            int i = (z ? 5 : 3) | 48;
            if (z) {
                f = PhonebookShareAlert.this.isImport ? 17 : 64;
            } else {
                f = 72.0f;
            }
            if (LocaleController.isRTL) {
                f2 = 72.0f;
            } else {
                f2 = PhonebookShareAlert.this.isImport ? 17 : 64;
            }
            addView(textView2, LayoutHelper.createFrame(-1, -1.0f, i, f, 10.0f, f2, 0.0f));
            TextView textView3 = new TextView(context);
            this.valueTextView = textView3;
            textView3.setTextColor(PhonebookShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
            this.valueTextView.setTextSize(1, 13.0f);
            this.valueTextView.setLines(1);
            this.valueTextView.setMaxLines(1);
            this.valueTextView.setSingleLine(true);
            this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            TextView textView4 = this.valueTextView;
            boolean z2 = LocaleController.isRTL;
            int i2 = z2 ? 5 : 3;
            if (z2) {
                f3 = PhonebookShareAlert.this.isImport ? 17 : 64;
            } else {
                f3 = 72.0f;
            }
            if (LocaleController.isRTL) {
                f4 = 72.0f;
            } else {
                f4 = PhonebookShareAlert.this.isImport ? 17 : 64;
            }
            addView(textView4, LayoutHelper.createFrame(-2, -2.0f, i2, f3, 35.0f, f4, 0.0f));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(PhonebookShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayIcon), PorterDuff.Mode.MULTIPLY));
            ImageView imageView2 = this.imageView;
            boolean z3 = LocaleController.isRTL;
            addView(imageView2, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 20.0f, 20.0f, z3 ? 20.0f : 0.0f, 0.0f));
            if (PhonebookShareAlert.this.isImport) {
                return;
            }
            Switch r1 = new Switch(context);
            this.checkBox = r1;
            int i3 = Theme.key_switchTrack;
            int i4 = Theme.key_switchTrackChecked;
            int i5 = Theme.key_windowBackgroundWhite;
            r1.setColors(i3, i4, i5, i5);
            addView(this.checkBox, LayoutHelper.createFrame(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }

        @Override
        public void invalidate() {
            super.invalidate();
            Switch r0 = this.checkBox;
            if (r0 != null) {
                r0.invalidate();
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            measureChildWithMargins(this.textView, i, 0, i2, 0);
            measureChildWithMargins(this.valueTextView, i, 0, i2, 0);
            measureChildWithMargins(this.imageView, i, 0, i2, 0);
            Switch r7 = this.checkBox;
            if (r7 != null) {
                measureChildWithMargins(r7, i, 0, i2, 0);
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), Math.max(AndroidUtilities.dp(64.0f), this.textView.getMeasuredHeight() + this.valueTextView.getMeasuredHeight() + AndroidUtilities.dp(20.0f)) + (this.needDivider ? 1 : 0));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int measuredHeight = this.textView.getMeasuredHeight() + AndroidUtilities.dp(13.0f);
            TextView textView = this.valueTextView;
            textView.layout(textView.getLeft(), measuredHeight, this.valueTextView.getRight(), this.valueTextView.getMeasuredHeight() + measuredHeight);
        }

        public void setVCardItem(AndroidUtilities.VcardItem vcardItem, int i, boolean z) {
            this.textView.setText(vcardItem.getValue(true));
            this.valueTextView.setText(vcardItem.getType());
            Switch r0 = this.checkBox;
            if (r0 != null) {
                r0.setChecked(vcardItem.checked, false);
            }
            if (i != 0) {
                this.imageView.setImageResource(i);
            } else {
                this.imageView.setImageDrawable(null);
            }
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        public void setChecked(boolean z) {
            Switch r0 = this.checkBox;
            if (r0 != null) {
                r0.setChecked(z, true);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    public PhonebookShareAlert(BaseFragment baseFragment, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2) {
        this(baseFragment, contact, user, uri, file, (String) null, str, str2);
    }

    public PhonebookShareAlert(BaseFragment baseFragment, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2, String str3) {
        this(baseFragment, contact, user, uri, file, str, str2, str3, null);
    }

    public PhonebookShareAlert(BaseFragment baseFragment, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        this(baseFragment, contact, user, uri, file, null, str, str2, resourcesProvider);
    }

    public PhonebookShareAlert(BaseFragment baseFragment, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final Theme.ResourcesProvider resourcesProvider) {
        ArrayList<TLRPC.User> arrayListLoadVCardFromStream;
        String str4;
        String str5;
        ArrayList<TLRPC.RestrictionReason> arrayList;
        super(baseFragment.getParentActivity(), false, resourcesProvider);
        this.backgroundPaint = new Paint(1);
        this.other = new ArrayList();
        this.phones = new ArrayList();
        String name = ContactsController.formatName(str2, str3);
        ArrayList arrayList2 = new ArrayList();
        if (uri != null) {
            arrayListLoadVCardFromStream = AndroidUtilities.loadVCardFromStream(uri, this.currentAccount, false, arrayList2, name);
        } else if (file != null) {
            arrayListLoadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.fromFile(file), this.currentAccount, false, arrayList2, name);
            file.delete();
            this.isImport = true;
        } else {
            if (str != null) {
                AndroidUtilities.VcardItem vcardItem = new AndroidUtilities.VcardItem();
                vcardItem.type = 0;
                ArrayList<String> arrayList3 = vcardItem.vcardData;
                String str6 = "TEL;MOBILE:+" + str;
                vcardItem.fullData = str6;
                arrayList3.add(str6);
                this.phones.add(vcardItem);
                this.isImport = true;
            } else {
                String str7 = contact.key;
                if (str7 != null) {
                    arrayListLoadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str7), this.currentAccount, true, arrayList2, name);
                } else {
                    AndroidUtilities.VcardItem vcardItem2 = new AndroidUtilities.VcardItem();
                    vcardItem2.type = 0;
                    ArrayList<String> arrayList4 = vcardItem2.vcardData;
                    String str8 = "TEL;MOBILE:+" + contact.user.phone;
                    vcardItem2.fullData = str8;
                    arrayList4.add(str8);
                    this.phones.add(vcardItem2);
                }
            }
            arrayListLoadVCardFromStream = null;
        }
        TLRPC.User user2 = (user != null || contact == null) ? user : contact.user;
        if (arrayListLoadVCardFromStream != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) arrayList2.get(i);
                if (vcardItem3.type == 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.phones.size()) {
                            if (((AndroidUtilities.VcardItem) this.phones.get(i2)).getValue(false).equals(vcardItem3.getValue(false))) {
                                vcardItem3.checked = false;
                                break;
                            }
                            i2++;
                        } else {
                            this.phones.add(vcardItem3);
                            break;
                        }
                    }
                } else {
                    this.other.add(vcardItem3);
                }
            }
            if (arrayListLoadVCardFromStream.isEmpty()) {
                str4 = str2;
                str5 = str3;
                arrayList = null;
            } else {
                TLRPC.User user3 = arrayListLoadVCardFromStream.get(0);
                arrayList = user3.restriction_reason;
                if (TextUtils.isEmpty(str2)) {
                    str4 = user3.first_name;
                    str5 = user3.last_name;
                } else {
                    str4 = str2;
                    str5 = str3;
                }
            }
        } else {
            str4 = str2;
            str5 = str3;
            arrayList = null;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
        this.currentUser = tL_userContact_old2;
        if (user2 != null) {
            tL_userContact_old2.id = user2.id;
            tL_userContact_old2.access_hash = user2.access_hash;
            tL_userContact_old2.photo = user2.photo;
            tL_userContact_old2.status = user2.status;
            tL_userContact_old2.first_name = user2.first_name;
            tL_userContact_old2.last_name = user2.last_name;
            tL_userContact_old2.phone = user2.phone;
            if (arrayList != null) {
                tL_userContact_old2.restriction_reason = arrayList;
            }
        } else {
            tL_userContact_old2.first_name = str4;
            tL_userContact_old2.last_name = str5;
        }
        this.parentFragment = baseFragment;
        final Activity parentActivity = baseFragment.getParentActivity();
        updateRows();
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            private boolean ignoreLayout;
            private RectF rect = new RectF();

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && PhonebookShareAlert.this.scrollOffsetY != 0 && motionEvent.getY() < PhonebookShareAlert.this.scrollOffsetY && PhonebookShareAlert.this.actionBar.getAlpha() == 0.0f) {
                    PhonebookShareAlert.this.lambda$new$0();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !PhonebookShareAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onMeasure(int i3, int i4) {
                int size = View.MeasureSpec.getSize(i4);
                this.ignoreLayout = true;
                setPadding(((BottomSheet) PhonebookShareAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) PhonebookShareAlert.this).backgroundPaddingLeft, 0);
                this.ignoreLayout = false;
                int paddingTop = size - getPaddingTop();
                View.MeasureSpec.getSize(i3);
                int unused = ((BottomSheet) PhonebookShareAlert.this).backgroundPaddingLeft;
                ((FrameLayout.LayoutParams) PhonebookShareAlert.this.actionBarShadow.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                this.ignoreLayout = true;
                int iDp = AndroidUtilities.dp(80.0f);
                int itemCount = PhonebookShareAlert.this.listAdapter.getItemCount();
                for (int i5 = 0; i5 < itemCount; i5++) {
                    View viewCreateView = PhonebookShareAlert.this.listAdapter.createView(parentActivity, i5);
                    viewCreateView.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                    iDp += viewCreateView.getMeasuredHeight();
                }
                int i6 = iDp < paddingTop ? paddingTop - iDp : paddingTop / 5;
                if (PhonebookShareAlert.this.scrollView.getPaddingTop() != i6) {
                    PhonebookShareAlert.this.scrollView.getPaddingTop();
                    PhonebookShareAlert.this.scrollView.setPadding(0, i6, 0, 0);
                }
                this.ignoreLayout = false;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }

            @Override
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                PhonebookShareAlert.this.inLayout = true;
                super.onLayout(z, i3, i4, i5, i6);
                PhonebookShareAlert.this.inLayout = false;
                PhonebookShareAlert.this.updateLayout(false);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onDraw(Canvas canvas) {
                int i3 = PhonebookShareAlert.this.scrollOffsetY - ((BottomSheet) PhonebookShareAlert.this).backgroundPaddingTop;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(30.0f) + ((BottomSheet) PhonebookShareAlert.this).backgroundPaddingTop;
                float fDp = AndroidUtilities.dp(12.0f);
                float fMin = ((float) (((BottomSheet) PhonebookShareAlert.this).backgroundPaddingTop + i3)) < fDp ? 1.0f - Math.min(1.0f, ((fDp - i3) - ((BottomSheet) PhonebookShareAlert.this).backgroundPaddingTop) / fDp) : 1.0f;
                int i4 = AndroidUtilities.statusBarHeight;
                int i5 = i3 + i4;
                ((BottomSheet) PhonebookShareAlert.this).shadowDrawable.setBounds(0, i5, getMeasuredWidth(), measuredHeight - i4);
                ((BottomSheet) PhonebookShareAlert.this).shadowDrawable.draw(canvas);
                if (fMin != 1.0f) {
                    PhonebookShareAlert.this.backgroundPaint.setColor(PhonebookShareAlert.this.getThemedColor(Theme.key_dialogBackground));
                    this.rect.set(((BottomSheet) PhonebookShareAlert.this).backgroundPaddingLeft, ((BottomSheet) PhonebookShareAlert.this).backgroundPaddingTop + i5, getMeasuredWidth() - ((BottomSheet) PhonebookShareAlert.this).backgroundPaddingLeft, ((BottomSheet) PhonebookShareAlert.this).backgroundPaddingTop + i5 + AndroidUtilities.dp(24.0f));
                    float f = fDp * fMin;
                    canvas.drawRoundRect(this.rect, f, f, PhonebookShareAlert.this.backgroundPaint);
                }
                int themedColor = PhonebookShareAlert.this.getThemedColor(Theme.key_dialogBackground);
                PhonebookShareAlert.this.backgroundPaint.setColor(Color.argb((int) (PhonebookShareAlert.this.actionBar.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
                canvas.drawRect(((BottomSheet) PhonebookShareAlert.this).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) PhonebookShareAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, PhonebookShareAlert.this.backgroundPaint);
            }
        };
        frameLayout.setWillNotDraw(false);
        this.containerView = frameLayout;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.listAdapter = new ListAdapter();
        NestedScrollView nestedScrollView = new NestedScrollView(parentActivity) {
            private View focusingView;

            @Override
            public void requestChildFocus(View view, View view2) {
                this.focusingView = view2;
                super.requestChildFocus(view, view2);
            }

            @Override
            protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
                if (this.focusingView == null || PhonebookShareAlert.this.linearLayout.getTop() != getPaddingTop()) {
                    return 0;
                }
                int iComputeScrollDeltaToGetChildRectOnScreen = super.computeScrollDeltaToGetChildRectOnScreen(rect);
                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() - (((this.focusingView.getTop() - getScrollY()) + rect.top) + iComputeScrollDeltaToGetChildRectOnScreen);
                return currentActionBarHeight > 0 ? iComputeScrollDeltaToGetChildRectOnScreen - (currentActionBarHeight + AndroidUtilities.dp(10.0f)) : iComputeScrollDeltaToGetChildRectOnScreen;
            }
        };
        this.scrollView = nestedScrollView;
        nestedScrollView.setClipToPadding(false);
        this.scrollView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.scrollView.addView(this.linearLayout, LayoutHelper.createScroll(-1, -1, 51));
        this.scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public final void onScrollChange(NestedScrollView nestedScrollView2, int i3, int i4, int i5, int i6) {
                this.f$0.lambda$new$0(nestedScrollView2, i3, i4, i5, i6);
            }
        });
        int itemCount = this.listAdapter.getItemCount();
        for (final int i3 = 0; i3 < itemCount; i3++) {
            final View viewCreateView = this.listAdapter.createView(parentActivity, i3);
            this.linearLayout.addView(viewCreateView, LayoutHelper.createLinear(-1, -2));
            if ((i3 >= this.phoneStartRow && i3 < this.phoneEndRow) || (i3 >= this.vcardStartRow && i3 < this.vcardEndRow)) {
                viewCreateView.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                viewCreateView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$new$2(i3, viewCreateView, view);
                    }
                });
                viewCreateView.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        return this.f$0.lambda$new$3(i3, resourcesProvider, parentActivity, view);
                    }
                });
            }
        }
        ActionBar actionBar = new ActionBar(parentActivity) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                ((BottomSheet) PhonebookShareAlert.this).containerView.invalidate();
            }
        };
        this.actionBar = actionBar;
        actionBar.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ActionBar actionBar2 = this.actionBar;
        int i4 = Theme.key_dialogTextBlack;
        actionBar2.setItemsColor(getThemedColor(i4), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_dialogButtonSelector), false);
        this.actionBar.setTitleColor(getThemedColor(i4));
        this.actionBar.setOccupyStatusBar(false);
        this.actionBar.setAlpha(0.0f);
        if (this.isImport) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddContactPhonebookTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.ShareContactTitle));
        }
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i5) {
                if (i5 == -1) {
                    PhonebookShareAlert.this.lambda$new$0();
                }
            }
        });
        View view = new View(parentActivity);
        this.actionBarShadow = view;
        view.setAlpha(0.0f);
        View view2 = this.actionBarShadow;
        int i5 = Theme.key_dialogShadowLine;
        view2.setBackgroundColor(getThemedColor(i5));
        this.containerView.addView(this.actionBarShadow, LayoutHelper.createFrame(-1, 1.0f));
        View view3 = new View(parentActivity);
        this.shadow = view3;
        view3.setBackgroundColor(getThemedColor(i5));
        this.shadow.setAlpha(0.0f);
        this.containerView.addView(this.shadow, LayoutHelper.createFrame(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView = new TextView(parentActivity);
        this.buttonTextView = textView;
        textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        this.buttonTextView.setTextSize(1, 14.0f);
        if (this.isImport) {
            this.buttonTextView.setText(LocaleController.getString(R.string.AddContactPhonebookTitle));
        } else {
            this.buttonTextView.setText(LocaleController.getString(R.string.ShareContactTitle));
        }
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        this.buttonTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), getThemedColor(Theme.key_featuredStickers_addButton), getThemedColor(Theme.key_featuredStickers_addButtonPressed)));
        frameLayout.addView(this.buttonTextView, LayoutHelper.createFrame(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        this.buttonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$new$6(resourcesProvider, view4);
            }
        });
    }

    public void lambda$new$0(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        updateLayout(!this.inLayout);
    }

    public void lambda$new$2(int i, View view, View view2) {
        final AndroidUtilities.VcardItem vcardItem;
        boolean z = false;
        int i2 = this.phoneStartRow;
        if (i >= i2 && i < this.phoneEndRow) {
            vcardItem = (AndroidUtilities.VcardItem) this.phones.get(i - i2);
        } else {
            int i3 = this.vcardStartRow;
            vcardItem = (i < i3 || i >= this.vcardEndRow) ? null : (AndroidUtilities.VcardItem) this.other.get(i - i3);
        }
        if (vcardItem == null) {
            return;
        }
        if (this.isImport) {
            int i4 = vcardItem.type;
            if (i4 == 0) {
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                    intent.addFlags(268435456);
                    this.parentFragment.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (i4 == 1) {
                Browser.openUrl(this.parentFragment.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                return;
            }
            if (i4 == 3) {
                String value = vcardItem.getValue(false);
                if (!value.startsWith("http")) {
                    value = "http://" + value;
                }
                Browser.openUrl(this.parentFragment.getParentActivity(), value);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.parentFragment.getParentActivity());
            builder.setItems(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    this.f$0.lambda$new$1(vcardItem, dialogInterface, i5);
                }
            });
            builder.show();
            return;
        }
        vcardItem.checked = !vcardItem.checked;
        if (i >= this.phoneStartRow && i < this.phoneEndRow) {
            for (int i5 = 0; i5 < this.phones.size(); i5++) {
                if (((AndroidUtilities.VcardItem) this.phones.get(i5)).checked) {
                    z = true;
                    break;
                }
            }
            int themedColor = getThemedColor(Theme.key_featuredStickers_buttonText);
            this.buttonTextView.setEnabled(z);
            TextView textView = this.buttonTextView;
            if (!z) {
                themedColor &= Integer.MAX_VALUE;
            }
            textView.setTextColor(themedColor);
        }
        ((TextCheckBoxCell) view).setChecked(vcardItem.checked);
    }

    public void lambda$new$1(AndroidUtilities.VcardItem vcardItem, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(this.parentFragment.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public boolean lambda$new$3(int i, Theme.ResourcesProvider resourcesProvider, Context context, View view) {
        AndroidUtilities.VcardItem vcardItem;
        int i2 = this.phoneStartRow;
        if (i >= i2 && i < this.phoneEndRow) {
            vcardItem = (AndroidUtilities.VcardItem) this.phones.get(i - i2);
        } else {
            int i3 = this.vcardStartRow;
            vcardItem = (i < i3 || i >= this.vcardEndRow) ? null : (AndroidUtilities.VcardItem) this.other.get(i - i3);
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (BulletinFactory.canShowBulletin(this.parentFragment)) {
            if (vcardItem.type == 3) {
                BulletinFactory.of((FrameLayout) this.containerView, resourcesProvider).createCopyLinkBulletin().show();
            } else {
                Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(context, resourcesProvider);
                int i4 = vcardItem.type;
                if (i4 == 0) {
                    simpleLayout.textView.setText(LocaleController.getString(R.string.PhoneCopied));
                    simpleLayout.imageView.setImageResource(R.drawable.msg_calls);
                } else if (i4 == 1) {
                    simpleLayout.textView.setText(LocaleController.getString(R.string.EmailCopied));
                    simpleLayout.imageView.setImageResource(R.drawable.msg_mention);
                } else {
                    simpleLayout.textView.setText(LocaleController.getString(R.string.TextCopied));
                    simpleLayout.imageView.setImageResource(R.drawable.msg_info);
                }
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Bulletin.make((FrameLayout) this.containerView, simpleLayout, 1500).show();
                }
            }
        }
        return true;
    }

    public void lambda$new$6(Theme.ResourcesProvider resourcesProvider, View view) {
        StringBuilder sb;
        if (this.isImport) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setTitle(LocaleController.getString(R.string.AddContactTitle));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.setItems(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new DialogInterface.OnClickListener() {
                private void fillRowWithType(String str, ContentValues contentValues) {
                    if (str.startsWith("X-")) {
                        contentValues.put("data2", (Integer) 0);
                        contentValues.put("data3", str.substring(2));
                        return;
                    }
                    if ("PREF".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 12);
                        return;
                    }
                    if ("HOME".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 1);
                        return;
                    }
                    if ("MOBILE".equalsIgnoreCase(str) || "CELL".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 2);
                        return;
                    }
                    if ("OTHER".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 7);
                        return;
                    }
                    if ("WORK".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 3);
                        return;
                    }
                    if ("RADIO".equalsIgnoreCase(str) || "VOICE".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 14);
                        return;
                    }
                    if ("PAGER".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 6);
                        return;
                    }
                    if ("CALLBACK".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 8);
                        return;
                    }
                    if ("CAR".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 9);
                        return;
                    }
                    if ("ASSISTANT".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 19);
                        return;
                    }
                    if ("MMS".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 20);
                    } else if (str.startsWith("FAX")) {
                        contentValues.put("data2", (Integer) 4);
                    } else {
                        contentValues.put("data2", (Integer) 0);
                        contentValues.put("data3", str);
                    }
                }

                private void fillUrlRowWithType(String str, ContentValues contentValues) {
                    if (str.startsWith("X-")) {
                        contentValues.put("data2", (Integer) 0);
                        contentValues.put("data3", str.substring(2));
                        return;
                    }
                    if ("HOMEPAGE".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 1);
                        return;
                    }
                    if ("BLOG".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 2);
                        return;
                    }
                    if ("PROFILE".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 3);
                        return;
                    }
                    if ("HOME".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 4);
                        return;
                    }
                    if ("WORK".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 5);
                        return;
                    }
                    if ("FTP".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 6);
                    } else if ("OTHER".equalsIgnoreCase(str)) {
                        contentValues.put("data2", (Integer) 7);
                    } else {
                        contentValues.put("data2", (Integer) 0);
                        contentValues.put("data3", str);
                    }
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent;
                    Intent intent2;
                    int i2;
                    boolean z;
                    AnonymousClass5 anonymousClass5 = this;
                    int i3 = 1;
                    if (i == 0) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else if (i == 1) {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    } else {
                        intent = null;
                    }
                    intent.putExtra("name", ContactsController.formatName(PhonebookShareAlert.this.currentUser.first_name, PhonebookShareAlert.this.currentUser.last_name));
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    boolean z2 = false;
                    for (int i4 = 0; i4 < PhonebookShareAlert.this.phones.size(); i4++) {
                        AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) PhonebookShareAlert.this.phones.get(i4);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                        contentValues.put("data1", vcardItem.getValue(false));
                        anonymousClass5.fillRowWithType(vcardItem.getRawType(false), contentValues);
                        arrayList.add(contentValues);
                    }
                    int i5 = 0;
                    boolean z3 = false;
                    while (i5 < PhonebookShareAlert.this.other.size()) {
                        AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) PhonebookShareAlert.this.other.get(i5);
                        int i6 = vcardItem2.type;
                        if (i6 == i3) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("mimetype", "vnd.android.cursor.item/email_v2");
                            contentValues2.put("data1", vcardItem2.getValue(z2));
                            anonymousClass5.fillRowWithType(vcardItem2.getRawType(z2), contentValues2);
                            arrayList.add(contentValues2);
                        } else if (i6 == 3) {
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("mimetype", "vnd.android.cursor.item/website");
                            contentValues3.put("data1", vcardItem2.getValue(z2));
                            anonymousClass5.fillUrlRowWithType(vcardItem2.getRawType(z2), contentValues3);
                            arrayList.add(contentValues3);
                        } else if (i6 == 4) {
                            ContentValues contentValues4 = new ContentValues();
                            contentValues4.put("mimetype", "vnd.android.cursor.item/note");
                            contentValues4.put("data1", vcardItem2.getValue(z2));
                            arrayList.add(contentValues4);
                        } else {
                            if (i6 == 5) {
                                ContentValues contentValues5 = new ContentValues();
                                contentValues5.put("mimetype", "vnd.android.cursor.item/contact_event");
                                contentValues5.put("data1", vcardItem2.getValue(z2));
                                contentValues5.put("data2", (Integer) 3);
                                arrayList.add(contentValues5);
                            } else {
                                intent2 = intent;
                                i2 = i5;
                                if (i6 == 2) {
                                    ContentValues contentValues6 = new ContentValues();
                                    contentValues6.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
                                    String[] rawValue = vcardItem2.getRawValue();
                                    z = z3;
                                    if (rawValue.length > 0) {
                                        contentValues6.put("data5", rawValue[0]);
                                    }
                                    if (rawValue.length > 1) {
                                        contentValues6.put("data6", rawValue[1]);
                                    }
                                    if (rawValue.length > 2) {
                                        contentValues6.put("data4", rawValue[2]);
                                    }
                                    if (rawValue.length > 3) {
                                        contentValues6.put("data7", rawValue[3]);
                                    }
                                    if (rawValue.length > 4) {
                                        contentValues6.put("data8", rawValue[4]);
                                    }
                                    if (rawValue.length > 5) {
                                        contentValues6.put("data9", rawValue[5]);
                                    }
                                    if (rawValue.length > 6) {
                                        contentValues6.put("data10", rawValue[6]);
                                    }
                                    String rawType = vcardItem2.getRawType(false);
                                    if ("HOME".equalsIgnoreCase(rawType)) {
                                        contentValues6.put("data2", (Integer) 1);
                                    } else if ("WORK".equalsIgnoreCase(rawType)) {
                                        contentValues6.put("data2", (Integer) 2);
                                    } else if ("OTHER".equalsIgnoreCase(rawType)) {
                                        contentValues6.put("data2", (Integer) 3);
                                    }
                                    arrayList.add(contentValues6);
                                } else {
                                    z = z3;
                                    if (i6 == 20) {
                                        ContentValues contentValues7 = new ContentValues();
                                        contentValues7.put("mimetype", "vnd.android.cursor.item/im");
                                        String rawType2 = vcardItem2.getRawType(true);
                                        String rawType3 = vcardItem2.getRawType(false);
                                        contentValues7.put("data1", vcardItem2.getValue(false));
                                        if ("AIM".equalsIgnoreCase(rawType2)) {
                                            contentValues7.put("data5", (Integer) 0);
                                        } else if ("MSN".equalsIgnoreCase(rawType2)) {
                                            contentValues7.put("data5", (Integer) 1);
                                        } else if ("YAHOO".equalsIgnoreCase(rawType2)) {
                                            contentValues7.put("data5", (Integer) 2);
                                        } else if ("SKYPE".equalsIgnoreCase(rawType2)) {
                                            contentValues7.put("data5", (Integer) 3);
                                        } else if ("QQ".equalsIgnoreCase(rawType2)) {
                                            contentValues7.put("data5", (Integer) 4);
                                        } else if ("GOOGLE-TALK".equalsIgnoreCase(rawType2)) {
                                            contentValues7.put("data5", (Integer) 5);
                                        } else if ("ICQ".equalsIgnoreCase(rawType2)) {
                                            contentValues7.put("data5", (Integer) 6);
                                        } else if ("JABBER".equalsIgnoreCase(rawType2)) {
                                            contentValues7.put("data5", (Integer) 7);
                                        } else if ("NETMEETING".equalsIgnoreCase(rawType2)) {
                                            contentValues7.put("data5", (Integer) 8);
                                        } else {
                                            contentValues7.put("data5", (Integer) (-1));
                                            contentValues7.put("data6", vcardItem2.getRawType(true));
                                        }
                                        if ("HOME".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data2", (Integer) 1);
                                        } else if ("WORK".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data2", (Integer) 2);
                                        } else if ("OTHER".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data2", (Integer) 3);
                                        }
                                        arrayList.add(contentValues7);
                                    } else if (i6 == 6 && !z) {
                                        ContentValues contentValues8 = new ContentValues();
                                        contentValues8.put("mimetype", "vnd.android.cursor.item/organization");
                                        anonymousClass5 = this;
                                        for (int i7 = i2; i7 < PhonebookShareAlert.this.other.size(); i7++) {
                                            AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) PhonebookShareAlert.this.other.get(i7);
                                            if (vcardItem3.type == 6) {
                                                String rawType4 = vcardItem3.getRawType(true);
                                                if ("ORG".equalsIgnoreCase(rawType4)) {
                                                    String[] rawValue2 = vcardItem3.getRawValue();
                                                    if (rawValue2.length != 0) {
                                                        if (rawValue2.length >= 1) {
                                                            contentValues8.put("data1", rawValue2[0]);
                                                        }
                                                        if (rawValue2.length >= 2) {
                                                            contentValues8.put("data5", rawValue2[1]);
                                                        }
                                                    }
                                                } else if ("TITLE".equalsIgnoreCase(rawType4) || "ROLE".equalsIgnoreCase(rawType4)) {
                                                    contentValues8.put("data4", vcardItem3.getValue(false));
                                                }
                                                String rawType5 = vcardItem3.getRawType(true);
                                                if ("WORK".equalsIgnoreCase(rawType5)) {
                                                    contentValues8.put("data2", (Integer) 1);
                                                } else if ("OTHER".equalsIgnoreCase(rawType5)) {
                                                    contentValues8.put("data2", (Integer) 2);
                                                }
                                            }
                                        }
                                        arrayList.add(contentValues8);
                                        z3 = true;
                                    }
                                }
                                anonymousClass5 = this;
                                z3 = z;
                            }
                            i5 = i2 + 1;
                            intent = intent2;
                            i3 = 1;
                            z2 = false;
                        }
                        intent2 = intent;
                        i2 = i5;
                        z = z3;
                        z3 = z;
                        i5 = i2 + 1;
                        intent = intent2;
                        i3 = 1;
                        z2 = false;
                    }
                    Intent intent3 = intent;
                    intent3.putExtra("finishActivityOnSaveCompleted", true);
                    intent3.putParcelableArrayListExtra("data", arrayList);
                    try {
                        PhonebookShareAlert.this.parentFragment.getParentActivity().startActivity(intent3);
                        PhonebookShareAlert.this.lambda$new$0();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            });
            builder.show();
            return;
        }
        if (!this.currentUser.restriction_reason.isEmpty()) {
            sb = new StringBuilder(this.currentUser.restriction_reason.get(0).text);
        } else {
            Locale locale = Locale.US;
            TLRPC.User user = this.currentUser;
            sb = new StringBuilder(String.format(locale, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(user.first_name, user.last_name)));
        }
        int iLastIndexOf = sb.lastIndexOf("END:VCARD");
        if (iLastIndexOf >= 0) {
            this.currentUser.phone = null;
            for (int size = this.phones.size() - 1; size >= 0; size--) {
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.phones.get(size);
                if (vcardItem.checked) {
                    TLRPC.User user2 = this.currentUser;
                    if (user2.phone == null) {
                        user2.phone = vcardItem.getValue(false);
                    }
                    for (int i = 0; i < vcardItem.vcardData.size(); i++) {
                        sb.insert(iLastIndexOf, vcardItem.vcardData.get(i) + "\n");
                    }
                }
            }
            for (int size2 = this.other.size() - 1; size2 >= 0; size2--) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) this.other.get(size2);
                if (vcardItem2.checked) {
                    for (int size3 = vcardItem2.vcardData.size() - 1; size3 >= 0; size3 += -1) {
                        sb.insert(iLastIndexOf, vcardItem2.vcardData.get(size3) + "\n");
                    }
                }
            }
            this.currentUser.restriction_reason.clear();
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = sb.toString();
            restrictionReason.reason = "";
            restrictionReason.platform = "";
            this.currentUser.restriction_reason.add(restrictionReason);
        }
        BaseFragment baseFragment = this.parentFragment;
        if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.parentFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i2, int i3) {
                    this.f$0.lambda$new$4(z, i2, i3);
                }
            }, resourcesProvider);
        } else {
            BaseFragment baseFragment2 = this.parentFragment;
            AlertsCreator.ensurePaidMessageConfirmation(this.currentAccount, baseFragment2 instanceof ChatActivity ? ((ChatActivity) baseFragment2).getDialogId() : 0L, 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$new$5((Long) obj);
                }
            });
        }
    }

    public void lambda$new$4(boolean z, int i, int i2) {
        this.delegate.didSelectContact(this.currentUser, z, i, 0L, false, 0L);
        lambda$new$0();
    }

    public void lambda$new$5(Long l) {
        this.delegate.didSelectContact(this.currentUser, true, 0, 0L, false, l.longValue());
        lambda$new$0();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bulletin.addDelegate((FrameLayout) this.containerView, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                return AndroidUtilities.dp(74.0f);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Bulletin.removeDelegate((FrameLayout) this.containerView);
    }

    public void setDelegate(ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate phonebookShareAlertDelegate) {
        this.delegate = phonebookShareAlertDelegate;
    }

    public void updateLayout(boolean z) {
        View childAt = this.scrollView.getChildAt(0);
        int top = childAt.getTop() - this.scrollView.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z2 = top <= 0;
        if ((z2 && this.actionBar.getTag() == null) || (!z2 && this.actionBar.getTag() != null)) {
            this.actionBar.setTag(z2 ? 1 : null);
            AnimatorSet animatorSet = this.actionBarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.actionBarAnimation = null;
            }
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.actionBarAnimation = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.actionBarAnimation;
                ActionBar actionBar = this.actionBar;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property, z2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.actionBarShadow, (Property<View, Float>) property, z2 ? 1.0f : 0.0f));
                this.actionBarAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhonebookShareAlert.this.actionBarAnimation = null;
                    }
                });
                this.actionBarAnimation.start();
            } else {
                this.actionBar.setAlpha(z2 ? 1.0f : 0.0f);
                this.actionBarShadow.setAlpha(z2 ? 1.0f : 0.0f);
            }
        }
        if (this.scrollOffsetY != top) {
            this.scrollOffsetY = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        this.scrollView.getMeasuredHeight();
        boolean z3 = childAt.getBottom() - this.scrollView.getScrollY() > this.scrollView.getMeasuredHeight();
        if (!(z3 && this.shadow.getTag() == null) && (z3 || this.shadow.getTag() == null)) {
            return;
        }
        this.shadow.setTag(z3 ? 1 : null);
        AnimatorSet animatorSet4 = this.shadowAnimation;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.shadowAnimation = null;
        }
        if (z) {
            AnimatorSet animatorSet5 = new AnimatorSet();
            this.shadowAnimation = animatorSet5;
            animatorSet5.setDuration(180L);
            this.shadowAnimation.playTogether(ObjectAnimator.ofFloat(this.shadow, (Property<View, Float>) View.ALPHA, z3 ? 1.0f : 0.0f));
            this.shadowAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PhonebookShareAlert.this.shadowAnimation = null;
                }
            });
            this.shadowAnimation.start();
            return;
        }
        this.shadow.setAlpha(z3 ? 1.0f : 0.0f);
    }

    private void updateRows() {
        this.rowCount = 1;
        this.userRow = 0;
        if (this.phones.size() <= 1 && this.other.isEmpty()) {
            this.phoneStartRow = -1;
            this.phoneEndRow = -1;
            this.vcardStartRow = -1;
            this.vcardEndRow = -1;
            return;
        }
        if (this.phones.isEmpty()) {
            this.phoneStartRow = -1;
            this.phoneEndRow = -1;
        } else {
            int i = this.rowCount;
            this.phoneStartRow = i;
            int size = i + this.phones.size();
            this.rowCount = size;
            this.phoneEndRow = size;
        }
        if (this.other.isEmpty()) {
            this.vcardStartRow = -1;
            this.vcardEndRow = -1;
            return;
        }
        int i2 = this.rowCount;
        this.vcardStartRow = i2;
        int size2 = i2 + this.other.size();
        this.rowCount = size2;
        this.vcardEndRow = size2;
    }

    private class ListAdapter {
        private ListAdapter() {
        }

        public int getItemCount() {
            return PhonebookShareAlert.this.rowCount;
        }

        public void onBindViewHolder(View view, int i, int i2) {
            AndroidUtilities.VcardItem vcardItem;
            int i3;
            if (i2 == 1) {
                TextCheckBoxCell textCheckBoxCell = (TextCheckBoxCell) view;
                if (i < PhonebookShareAlert.this.phoneStartRow || i >= PhonebookShareAlert.this.phoneEndRow) {
                    vcardItem = (AndroidUtilities.VcardItem) PhonebookShareAlert.this.other.get(i - PhonebookShareAlert.this.vcardStartRow);
                    int i4 = vcardItem.type;
                    if (i4 == 1) {
                        i3 = R.drawable.msg_mention;
                    } else if (i4 == 2) {
                        i3 = R.drawable.msg_location;
                    } else if (i4 == 3) {
                        i3 = R.drawable.msg_link;
                    } else if (i4 == 4) {
                        i3 = R.drawable.msg_info;
                    } else if (i4 == 5) {
                        i3 = R.drawable.msg_calendar2;
                    } else if (i4 == 6) {
                        if ("ORG".equalsIgnoreCase(vcardItem.getRawType(true))) {
                            i3 = R.drawable.msg_work;
                        } else {
                            i3 = R.drawable.msg_jobtitle;
                        }
                    } else if (i4 == 20) {
                        i3 = R.drawable.msg_info;
                    } else {
                        i3 = R.drawable.msg_info;
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) PhonebookShareAlert.this.phones.get(i - PhonebookShareAlert.this.phoneStartRow);
                    i3 = R.drawable.msg_calls;
                }
                textCheckBoxCell.setVCardItem(vcardItem, i3, i != getItemCount() - 1);
            }
        }

        public View createView(Context context, int i) {
            View userCell;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                userCell = PhonebookShareAlert.this.new UserCell(context);
            } else {
                userCell = PhonebookShareAlert.this.new TextCheckBoxCell(context);
            }
            onBindViewHolder(userCell, i, itemViewType);
            return userCell;
        }

        public int getItemViewType(int i) {
            return i == PhonebookShareAlert.this.userRow ? 0 : 1;
        }
    }
}
