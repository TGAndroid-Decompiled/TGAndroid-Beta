package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;

public final class PhonebookShareAlert extends BottomSheet {
    public static final int $r8$clinit = 0;
    public final AnonymousClass3 actionBar;
    public AnimatorSet actionBarAnimation;
    public final View actionBarShadow;
    public final Paint backgroundPaint;
    public final TextView buttonTextView;
    public final TLRPC.TL_userContact_old2 currentUser;
    public ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate delegate;
    public boolean inLayout;
    public final boolean isImport;
    public final LinearLayout linearLayout;
    public final ListAdapter listAdapter;
    public final ArrayList other;
    public final BaseFragment parentFragment;
    public final int phoneEndRow;
    public final int phoneStartRow;
    public final ArrayList phones;
    public final int rowCount;
    public int scrollOffsetY;
    public final AnonymousClass2 scrollView;
    public final View shadow;
    public AnimatorSet shadowAnimation;
    public final int vcardEndRow;
    public final int vcardStartRow;

    public final class AnonymousClass3 extends ActionBar {
        public AnonymousClass3(Activity activity) {
            super(activity, null);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            ((BottomSheet) PhonebookShareAlert.this).containerView.invalidate();
        }
    }

    public final class ListAdapter {
        public ListAdapter() {
        }

        public final ViewGroup createView(Activity activity, int i) {
            String userStatus;
            boolean z;
            ViewGroup viewGroup;
            AndroidUtilities.VcardItem vcardItem;
            int i2;
            TextCheckBoxCell textCheckBoxCell;
            PhonebookShareAlert phonebookShareAlert = PhonebookShareAlert.this;
            phonebookShareAlert.getClass();
            boolean z2 = i != 0;
            ArrayList arrayList = phonebookShareAlert.other;
            ArrayList arrayList2 = phonebookShareAlert.phones;
            if (z2) {
                textCheckBoxCell = new TextCheckBoxCell(phonebookShareAlert, activity);
            } else {
                UserCell userCell = new UserCell(activity);
                userCell.setOrientation(1);
                int size = arrayList2.size();
                TLRPC.TL_userContact_old2 tL_userContact_old2 = phonebookShareAlert.currentUser;
                if (size == 1 && arrayList.size() == 0) {
                    userStatus = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                    z = false;
                } else {
                    TLRPC.UserStatus userStatus2 = tL_userContact_old2.status;
                    userStatus = (userStatus2 == null || userStatus2.expires == 0) ? null : LocaleController.formatUserStatus(((BottomSheet) phonebookShareAlert).currentAccount, tL_userContact_old2);
                    z = true;
                }
                AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(30.0f));
                avatarDrawable.setInfo(((BottomSheet) phonebookShareAlert).currentAccount, (TLRPC.User) tL_userContact_old2);
                BackupImageView backupImageView = new BackupImageView(activity);
                backupImageView.setRoundRadius(AndroidUtilities.dp(40.0f));
                backupImageView.imageReceiver.setForUserOrChat(tL_userContact_old2, avatarDrawable);
                backupImageView.onNewImageSet();
                userCell.addView(backupImageView, LayoutHelper.createLinear(80, 80, 49, 0, 32, 0, 0));
                TextView textView = new TextView(activity);
                zzkh.m(17.0f, textView);
                textView.setTextColor(phonebookShareAlert.getThemedColor(Theme.key_dialogTextBlack));
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
                userCell.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 10, 10, 10, userStatus != null ? 0 : 27));
                viewGroup = userCell;
                if (userStatus != null) {
                    TextView textView2 = new TextView(activity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(phonebookShareAlert.getThemedColor(Theme.key_dialogTextGray3));
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setText(userStatus);
                    userCell.addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 10, 3, 10, z ? 27 : 11));
                    viewGroup = userCell;
                }
            }
            if (z2) {
                TextCheckBoxCell textCheckBoxCell2 = (TextCheckBoxCell) viewGroup;
                int i3 = phonebookShareAlert.phoneStartRow;
                if (i < i3 || i >= phonebookShareAlert.phoneEndRow) {
                    viewGroup = textCheckBoxCell;
                    viewGroup = textCheckBoxCell;
                    vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i - phonebookShareAlert.vcardStartRow);
                    int i4 = vcardItem.type;
                    if (i4 == 1) {
                        i2 = R.drawable.msg_mention;
                    } else if (i4 == 2) {
                        i2 = R.drawable.msg_location;
                    } else if (i4 == 3) {
                        i2 = R.drawable.msg_link;
                    } else if (i4 == 4) {
                        i2 = R.drawable.msg_info;
                    } else if (i4 == 5) {
                        i2 = R.drawable.msg_calendar2;
                    } else if (i4 == 6) {
                        i2 = "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle;
                    } else {
                        i2 = i4 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
                    }
                } else {
                    viewGroup = textCheckBoxCell;
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i - i3);
                    i2 = R.drawable.msg_calls;
                }
                boolean z3 = i != phonebookShareAlert.rowCount - 1;
                textCheckBoxCell2.textView.setText(vcardItem.getValue(true));
                textCheckBoxCell2.valueTextView.setText(vcardItem.getType());
                Switch r3 = textCheckBoxCell2.checkBox;
                if (r3 != null) {
                    r3.setChecked(r3.drawIconType, vcardItem.checked, false);
                }
                ImageView imageView = textCheckBoxCell2.imageView;
                if (i2 != 0) {
                    imageView.setImageResource(i2);
                } else {
                    imageView.setImageDrawable(null);
                }
                textCheckBoxCell2.needDivider = z3;
                textCheckBoxCell2.setWillNotDraw(!z3);
            }
            viewGroup = textCheckBoxCell;
            return viewGroup;
        }
    }

    public final class TextCheckBoxCell extends FrameLayout {
        public final Switch checkBox;
        public final ImageView imageView;
        public boolean needDivider;
        public final TextView textView;
        public final TextView valueTextView;

        public TextCheckBoxCell(PhonebookShareAlert phonebookShareAlert, Activity activity) {
            float f;
            float f2;
            float f3;
            float f4;
            super(activity);
            TextView textView = new TextView(activity);
            this.textView = textView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            int i2 = PhonebookShareAlert.$r8$clinit;
            textView.setTextColor(phonebookShareAlert.getThemedColor(i));
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z = LocaleController.isRTL;
            int i3 = (z ? 5 : 3) | 48;
            boolean z2 = phonebookShareAlert.isImport;
            if (z) {
                f = z2 ? 17 : 64;
            } else {
                f = 72.0f;
            }
            if (z) {
                f2 = 72.0f;
            } else {
                f2 = z2 ? 17 : 64;
            }
            addView(textView, LayoutHelper.createFrame(-1, -1.0f, i3, f, 10.0f, f2, 0.0f));
            TextView textView2 = new TextView(activity);
            this.valueTextView = textView2;
            textView2.setTextColor(phonebookShareAlert.getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z3 = LocaleController.isRTL;
            int i4 = z3 ? 5 : 3;
            if (z3) {
                f3 = z2 ? 17 : 64;
            } else {
                f3 = 72.0f;
            }
            if (z3) {
                f4 = 72.0f;
            } else {
                f4 = z2 ? 17 : 64;
            }
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, i4, f3, 35.0f, f4, 0.0f));
            ImageView imageView = new ImageView(activity);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(phonebookShareAlert.getThemedColor(Theme.key_windowBackgroundWhiteGrayIcon), PorterDuff.Mode.MULTIPLY));
            boolean z4 = LocaleController.isRTL;
            addView(imageView, LayoutHelper.createFrame(-2, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 20.0f, 20.0f, z4 ? 20.0f : 0.0f, 0.0f));
            if (z2) {
                return;
            }
            Switch r1 = new Switch(activity, null);
            this.checkBox = r1;
            int i5 = Theme.key_switchTrack;
            int i6 = Theme.key_switchTrackChecked;
            int i7 = Theme.key_windowBackgroundWhite;
            r1.trackColorKey = i5;
            r1.trackCheckedColorKey = i6;
            r1.thumbColorKey = i7;
            r1.thumbCheckedColorKey = i7;
            addView(r1, LayoutHelper.createFrame(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            Switch r0 = this.checkBox;
            if (r0 != null) {
                r0.invalidate();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int iDp = AndroidUtilities.dp(13.0f) + this.textView.getMeasuredHeight();
            TextView textView = this.valueTextView;
            textView.layout(textView.getLeft(), iDp, textView.getRight(), textView.getMeasuredHeight() + iDp);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            TextView textView = this.textView;
            measureChildWithMargins(textView, i, 0, i2, 0);
            TextView textView2 = this.valueTextView;
            measureChildWithMargins(textView2, i, 0, i2, 0);
            measureChildWithMargins(this.imageView, i, 0, i2, 0);
            Switch r7 = this.checkBox;
            if (r7 != null) {
                measureChildWithMargins(r7, i, 0, i2, 0);
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), MessageObject$$ExternalSyntheticOutline0.m(textView2.getMeasuredHeight() + textView.getMeasuredHeight(), 20.0f, AndroidUtilities.dp(64.0f)) + (this.needDivider ? 1 : 0));
        }

        public void setChecked(boolean z) {
            Switch r0 = this.checkBox;
            if (r0 != null) {
                r0.setChecked(r0.drawIconType, z, true);
            }
        }
    }

    public final class UserCell extends LinearLayout {
    }

    public PhonebookShareAlert(BaseFragment baseFragment, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final Theme.ResourcesProvider resourcesProvider) {
        ArrayList<TLRPC.User> arrayListLoadVCardFromStream;
        String str4;
        String str5;
        super(baseFragment.getParentActivity(), resourcesProvider, false, false);
        this.backgroundPaint = new Paint(1);
        this.other = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.phones = arrayList;
        String name = ContactsController.formatName(str2, str3);
        ArrayList arrayList2 = new ArrayList();
        ArrayList<TLRPC.RestrictionReason> arrayList3 = null;
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
                ArrayList<String> arrayList4 = vcardItem.vcardData;
                String strConcat = "TEL;MOBILE:+".concat(str);
                vcardItem.fullData = strConcat;
                arrayList4.add(strConcat);
                arrayList.add(vcardItem);
                this.isImport = true;
            } else {
                String str6 = contact.key;
                if (str6 != null) {
                    arrayListLoadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str6), this.currentAccount, true, arrayList2, name);
                } else {
                    AndroidUtilities.VcardItem vcardItem2 = new AndroidUtilities.VcardItem();
                    vcardItem2.type = 0;
                    ArrayList<String> arrayList5 = vcardItem2.vcardData;
                    String str7 = "TEL;MOBILE:+" + contact.user.phone;
                    vcardItem2.fullData = str7;
                    arrayList5.add(str7);
                    arrayList.add(vcardItem2);
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
                        if (i2 >= this.phones.size()) {
                            this.phones.add(vcardItem3);
                            break;
                        } else {
                            if (((AndroidUtilities.VcardItem) this.phones.get(i2)).getValue(false).equals(vcardItem3.getValue(false))) {
                                vcardItem3.checked = false;
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    this.other.add(vcardItem3);
                }
            }
            if (arrayListLoadVCardFromStream.isEmpty()) {
                str4 = str2;
                str5 = str3;
            } else {
                TLRPC.User user3 = arrayListLoadVCardFromStream.get(0);
                arrayList3 = user3.restriction_reason;
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
            if (arrayList3 != null) {
                tL_userContact_old2.restriction_reason = arrayList3;
            }
        } else {
            tL_userContact_old2.first_name = str4;
            tL_userContact_old2.last_name = str5;
        }
        this.parentFragment = baseFragment;
        final Activity parentActivity = baseFragment.getParentActivity();
        this.rowCount = 1;
        if (this.phones.size() > 1 || !this.other.isEmpty()) {
            if (this.phones.isEmpty()) {
                this.phoneStartRow = -1;
                this.phoneEndRow = -1;
            } else {
                this.phoneStartRow = 1;
                int size = this.phones.size() + 1;
                this.rowCount = size;
                this.phoneEndRow = size;
            }
            if (this.other.isEmpty()) {
                this.vcardStartRow = -1;
                this.vcardEndRow = -1;
            } else {
                int i3 = this.rowCount;
                this.vcardStartRow = i3;
                int size2 = this.other.size() + i3;
                this.rowCount = size2;
                this.vcardEndRow = size2;
            }
        } else {
            this.phoneStartRow = -1;
            this.phoneEndRow = -1;
            this.vcardStartRow = -1;
            this.vcardEndRow = -1;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            public boolean ignoreLayout;
            public final RectF rect = new RectF();

            @Override
            public final void onDraw(Canvas canvas) {
                PhonebookShareAlert phonebookShareAlert = PhonebookShareAlert.this;
                int i4 = phonebookShareAlert.scrollOffsetY - ((BottomSheet) phonebookShareAlert).backgroundPaddingTop;
                int iDp = ((BottomSheet) phonebookShareAlert).backgroundPaddingTop + AndroidUtilities.dp(30.0f) + getMeasuredHeight();
                float fDp = AndroidUtilities.dp(12.0f);
                float fMin = ((float) (((BottomSheet) phonebookShareAlert).backgroundPaddingTop + i4)) < fDp ? 1.0f - Math.min(1.0f, ((fDp - i4) - ((BottomSheet) phonebookShareAlert).backgroundPaddingTop) / fDp) : 1.0f;
                int i5 = AndroidUtilities.statusBarHeight;
                int i6 = i4 + i5;
                ((BottomSheet) phonebookShareAlert).shadowDrawable.setBounds(0, i6, getMeasuredWidth(), iDp - i5);
                ((BottomSheet) phonebookShareAlert).shadowDrawable.draw(canvas);
                Paint paint = phonebookShareAlert.backgroundPaint;
                if (fMin != 1.0f) {
                    paint.setColor(phonebookShareAlert.getThemedColor(Theme.key_dialogBackground));
                    RectF rectF = this.rect;
                    rectF.set(((BottomSheet) phonebookShareAlert).backgroundPaddingLeft, ((BottomSheet) phonebookShareAlert).backgroundPaddingTop + i6, getMeasuredWidth() - ((BottomSheet) phonebookShareAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) phonebookShareAlert).backgroundPaddingTop + i6);
                    float f = fDp * fMin;
                    canvas.drawRoundRect(rectF, f, f, paint);
                }
                int themedColor = phonebookShareAlert.getThemedColor(Theme.key_dialogBackground);
                paint.setColor(Color.argb((int) (phonebookShareAlert.actionBar.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
                canvas.drawRect(((BottomSheet) phonebookShareAlert).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) phonebookShareAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, paint);
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    PhonebookShareAlert phonebookShareAlert = PhonebookShareAlert.this;
                    if (phonebookShareAlert.scrollOffsetY != 0 && motionEvent.getY() < phonebookShareAlert.scrollOffsetY && phonebookShareAlert.actionBar.getAlpha() == 0.0f) {
                        phonebookShareAlert.lambda$showGiftOfferSheet$15();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                PhonebookShareAlert phonebookShareAlert = PhonebookShareAlert.this;
                phonebookShareAlert.inLayout = true;
                super.onLayout(z, i4, i5, i6, i7);
                phonebookShareAlert.inLayout = false;
                phonebookShareAlert.updateLayout$1(false);
            }

            @Override
            public final void onMeasure(int i4, int i5) {
                int size3 = View.MeasureSpec.getSize(i5);
                this.ignoreLayout = true;
                PhonebookShareAlert phonebookShareAlert = PhonebookShareAlert.this;
                setPadding(((BottomSheet) phonebookShareAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) phonebookShareAlert).backgroundPaddingLeft, 0);
                this.ignoreLayout = false;
                int paddingTop = size3 - getPaddingTop();
                View.MeasureSpec.getSize(i4);
                ((BottomSheet) phonebookShareAlert).backgroundPaddingLeft;
                ((FrameLayout.LayoutParams) phonebookShareAlert.actionBarShadow.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                this.ignoreLayout = true;
                int iDp = AndroidUtilities.dp(80.0f);
                ListAdapter listAdapter = phonebookShareAlert.listAdapter;
                int i6 = PhonebookShareAlert.this.rowCount;
                for (int i7 = 0; i7 < i6; i7++) {
                    ViewGroup viewGroupCreateView = listAdapter.createView(parentActivity, i7);
                    viewGroupCreateView.measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
                    iDp += viewGroupCreateView.getMeasuredHeight();
                }
                int i8 = iDp < paddingTop ? paddingTop - iDp : paddingTop / 5;
                AnonymousClass2 anonymousClass2 = phonebookShareAlert.scrollView;
                if (anonymousClass2.getPaddingTop() != i8) {
                    anonymousClass2.getPaddingTop();
                    anonymousClass2.setPadding(0, i8, 0, 0);
                }
                this.ignoreLayout = false;
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return !PhonebookShareAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        frameLayout.setWillNotDraw(false);
        this.containerView = frameLayout;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.listAdapter = new ListAdapter();
        ?? r2 = new NestedScrollView(parentActivity) {
            public View focusingView;

            @Override
            public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
                if (this.focusingView == null || PhonebookShareAlert.this.linearLayout.getTop() != getPaddingTop()) {
                    return 0;
                }
                int iComputeScrollDeltaToGetChildRectOnScreen = super.computeScrollDeltaToGetChildRectOnScreen(rect);
                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() - (((this.focusingView.getTop() - getScrollY()) + rect.top) + iComputeScrollDeltaToGetChildRectOnScreen);
                return currentActionBarHeight > 0 ? OKLCH.m$1(10.0f, currentActionBarHeight, iComputeScrollDeltaToGetChildRectOnScreen) : iComputeScrollDeltaToGetChildRectOnScreen;
            }

            @Override
            public final void requestChildFocus(View view, View view2) {
                this.focusingView = view2;
                super.requestChildFocus(view, view2);
            }
        };
        this.scrollView = r2;
        r2.setClipToPadding(false);
        r2.setVerticalScrollBarEnabled(false);
        frameLayout.addView((View) r2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        r2.addView(linearLayout, LayoutHelper.createScroll(-1, -1, 51));
        r2.setOnScrollChangeListener(new PhonebookShareAlert$$ExternalSyntheticLambda0(this));
        int i4 = this.rowCount;
        for (final int i5 = 0; i5 < i4; i5++) {
            ViewGroup viewGroupCreateView = this.listAdapter.createView(parentActivity, i5);
            this.linearLayout.addView(viewGroupCreateView, LayoutHelper.createLinear(-1, -2));
            if ((i5 >= this.phoneStartRow && i5 < this.phoneEndRow) || (i5 >= this.vcardStartRow && i5 < this.vcardEndRow)) {
                viewGroupCreateView.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                viewGroupCreateView.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(this, i5, viewGroupCreateView, 10));
                viewGroupCreateView.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        return this.f$0.lambda$new$3(i5, parentActivity, resourcesProvider);
                    }
                });
            }
        }
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(parentActivity);
        this.actionBar = anonymousClass3;
        anonymousClass3.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        anonymousClass3.setBackButtonImage(R.drawable.ic_ab_back);
        int i6 = Theme.key_dialogTextBlack;
        anonymousClass3.setItemsColor(getThemedColor(i6), false);
        anonymousClass3.setItemsBackgroundColor(getThemedColor(Theme.key_dialogButtonSelector), false);
        anonymousClass3.setTitleColor(getThemedColor(i6));
        anonymousClass3.setOccupyStatusBar(false);
        anonymousClass3.setAlpha(0.0f);
        if (this.isImport) {
            anonymousClass3.setTitle(LocaleController.getString(R.string.AddContactPhonebookTitle));
        } else {
            anonymousClass3.setTitle(LocaleController.getString(R.string.ShareContactTitle));
        }
        this.containerView.addView(anonymousClass3, LayoutHelper.createFrame(-2.0f, -1));
        anonymousClass3.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i7) {
                if (i7 == -1) {
                    PhonebookShareAlert.this.lambda$showGiftOfferSheet$15();
                }
            }
        });
        View view = new View(parentActivity);
        this.actionBarShadow = view;
        view.setAlpha(0.0f);
        int i7 = Theme.key_dialogShadowLine;
        view.setBackgroundColor(getThemedColor(i7));
        this.containerView.addView(view, LayoutHelper.createFrame(1.0f, -1));
        View view2 = new View(parentActivity);
        this.shadow = view2;
        view2.setBackgroundColor(getThemedColor(i7));
        view2.setAlpha(0.0f);
        this.containerView.addView(view2, LayoutHelper.createFrame(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView = new TextView(parentActivity);
        this.buttonTextView = textView;
        textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView.setGravity(17);
        textView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        textView.setTextSize(1, 14.0f);
        if (this.isImport) {
            textView.setText(LocaleController.getString(R.string.AddContactPhonebookTitle));
        } else {
            textView.setText(LocaleController.getString(R.string.ShareContactTitle));
        }
        textView.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        int themedColor = getThemedColor(Theme.key_featuredStickers_addButton);
        int themedColor2 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, themedColor, themedColor2, themedColor2));
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(4, this, resourcesProvider));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final boolean lambda$new$3(int i, Activity activity, Theme.ResourcesProvider resourcesProvider) {
        AndroidUtilities.VcardItem vcardItem;
        int i2 = this.phoneStartRow;
        if (i < i2 || i >= this.phoneEndRow) {
            int i3 = this.vcardStartRow;
            vcardItem = (i < i3 || i >= this.vcardEndRow) ? null : (AndroidUtilities.VcardItem) this.other.get(i - i3);
        } else {
            vcardItem = (AndroidUtilities.VcardItem) this.phones.get(i - i2);
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (BulletinFactory.canShowBulletin(this.parentFragment)) {
            if (vcardItem.type == 3) {
                new BulletinFactory((FrameLayout) this.containerView, resourcesProvider).createCopyLinkBulletin(false).show();
                return true;
            }
            Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(activity, resourcesProvider);
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
        return true;
    }

    public final void lambda$new$6$1(Theme.ResourcesProvider resourcesProvider) {
        if (this.isImport) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
            builder.alertDialog.title = LocaleController.getString(R.string.AddContactTitle);
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.setItems(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new DialogInterface.OnClickListener() {
                public static void fillRowWithType(String str, ContentValues contentValues) {
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

                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent;
                    int i2;
                    boolean z;
                    Intent intent2;
                    PhonebookShareAlert phonebookShareAlert;
                    PhonebookShareAlert phonebookShareAlert2;
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
                    PhonebookShareAlert phonebookShareAlert3 = PhonebookShareAlert.this;
                    TLRPC.TL_userContact_old2 tL_userContact_old2 = phonebookShareAlert3.currentUser;
                    intent.putExtra("name", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    boolean z2 = false;
                    for (int i4 = 0; i4 < phonebookShareAlert3.phones.size(); i4++) {
                        AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) phonebookShareAlert3.phones.get(i4);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                        contentValues.put("data1", vcardItem.getValue(false));
                        fillRowWithType(vcardItem.getRawType(false), contentValues);
                        arrayList.add(contentValues);
                    }
                    int i5 = 0;
                    boolean z3 = false;
                    while (i5 < phonebookShareAlert3.other.size()) {
                        AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) phonebookShareAlert3.other.get(i5);
                        int i6 = vcardItem2.type;
                        if (i6 == i3) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("mimetype", "vnd.android.cursor.item/email_v2");
                            contentValues2.put("data1", vcardItem2.getValue(z2));
                            fillRowWithType(vcardItem2.getRawType(z2), contentValues2);
                            arrayList.add(contentValues2);
                        } else if (i6 == 3) {
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("mimetype", "vnd.android.cursor.item/website");
                            contentValues3.put("data1", vcardItem2.getValue(false));
                            String rawType = vcardItem2.getRawType(false);
                            if (rawType.startsWith("X-")) {
                                contentValues3.put("data2", (Integer) 0);
                                contentValues3.put("data3", rawType.substring(2));
                            } else if ("HOMEPAGE".equalsIgnoreCase(rawType)) {
                                contentValues3.put("data2", (Integer) 1);
                            } else if ("BLOG".equalsIgnoreCase(rawType)) {
                                contentValues3.put("data2", (Integer) 2);
                            } else if ("PROFILE".equalsIgnoreCase(rawType)) {
                                contentValues3.put("data2", (Integer) 3);
                            } else if ("HOME".equalsIgnoreCase(rawType)) {
                                contentValues3.put("data2", (Integer) 4);
                            } else if ("WORK".equalsIgnoreCase(rawType)) {
                                contentValues3.put("data2", (Integer) 5);
                            } else if ("FTP".equalsIgnoreCase(rawType)) {
                                contentValues3.put("data2", (Integer) 6);
                            } else {
                                if ("OTHER".equalsIgnoreCase(rawType)) {
                                    contentValues3.put("data2", (Integer) 7);
                                } else {
                                    contentValues3.put("data2", (Integer) 0);
                                    contentValues3.put("data3", rawType);
                                }
                                arrayList.add(contentValues3);
                            }
                            arrayList.add(contentValues3);
                        } else if (i6 == 4) {
                            ContentValues contentValues4 = new ContentValues();
                            contentValues4.put("mimetype", "vnd.android.cursor.item/note");
                            contentValues4.put("data1", vcardItem2.getValue(false));
                            arrayList.add(contentValues4);
                        } else {
                            if (i6 == 5) {
                                ContentValues contentValues5 = new ContentValues();
                                contentValues5.put("mimetype", "vnd.android.cursor.item/contact_event");
                                contentValues5.put("data1", vcardItem2.getValue(false));
                                contentValues5.put("data2", (Integer) 3);
                                arrayList.add(contentValues5);
                            } else {
                                i2 = i5;
                                z = z3;
                                if (i6 == 2) {
                                    ContentValues contentValues6 = new ContentValues();
                                    contentValues6.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
                                    String[] rawValue = vcardItem2.getRawValue();
                                    intent2 = intent;
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
                                    String rawType2 = vcardItem2.getRawType(false);
                                    if ("HOME".equalsIgnoreCase(rawType2)) {
                                        contentValues6.put("data2", (Integer) 1);
                                    } else if ("WORK".equalsIgnoreCase(rawType2)) {
                                        contentValues6.put("data2", (Integer) 2);
                                    } else if ("OTHER".equalsIgnoreCase(rawType2)) {
                                        contentValues6.put("data2", (Integer) 3);
                                    }
                                    arrayList.add(contentValues6);
                                    phonebookShareAlert2 = phonebookShareAlert3;
                                } else {
                                    intent2 = intent;
                                    if (i6 == 20) {
                                        ContentValues contentValues7 = new ContentValues();
                                        contentValues7.put("mimetype", "vnd.android.cursor.item/im");
                                        String rawType3 = vcardItem2.getRawType(true);
                                        String rawType4 = vcardItem2.getRawType(false);
                                        phonebookShareAlert = phonebookShareAlert3;
                                        contentValues7.put("data1", vcardItem2.getValue(false));
                                        if ("AIM".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 0);
                                        } else if ("MSN".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 1);
                                        } else if ("YAHOO".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 2);
                                        } else if ("SKYPE".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 3);
                                        } else if ("QQ".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 4);
                                        } else if ("GOOGLE-TALK".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 5);
                                        } else if ("ICQ".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 6);
                                        } else if ("JABBER".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 7);
                                        } else if ("NETMEETING".equalsIgnoreCase(rawType3)) {
                                            contentValues7.put("data5", (Integer) 8);
                                        } else {
                                            contentValues7.put("data5", (Integer) (-1));
                                            contentValues7.put("data6", vcardItem2.getRawType(true));
                                        }
                                        if ("HOME".equalsIgnoreCase(rawType4)) {
                                            contentValues7.put("data2", (Integer) 1);
                                        } else if ("WORK".equalsIgnoreCase(rawType4)) {
                                            contentValues7.put("data2", (Integer) 2);
                                        } else if ("OTHER".equalsIgnoreCase(rawType4)) {
                                            contentValues7.put("data2", (Integer) 3);
                                        }
                                        arrayList.add(contentValues7);
                                    } else {
                                        phonebookShareAlert = phonebookShareAlert3;
                                        if (i6 == 6 && !z) {
                                            ContentValues contentValues8 = new ContentValues();
                                            contentValues8.put("mimetype", "vnd.android.cursor.item/organization");
                                            phonebookShareAlert2 = phonebookShareAlert;
                                            for (int i7 = i2; i7 < phonebookShareAlert2.other.size(); i7++) {
                                                AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) phonebookShareAlert2.other.get(i7);
                                                if (vcardItem3.type == 6) {
                                                    String rawType5 = vcardItem3.getRawType(true);
                                                    if ("ORG".equalsIgnoreCase(rawType5)) {
                                                        String[] rawValue2 = vcardItem3.getRawValue();
                                                        if (rawValue2.length != 0) {
                                                            if (rawValue2.length >= 1) {
                                                                contentValues8.put("data1", rawValue2[0]);
                                                            }
                                                            if (rawValue2.length >= 2) {
                                                                contentValues8.put("data5", rawValue2[1]);
                                                            }
                                                        }
                                                    } else if ("TITLE".equalsIgnoreCase(rawType5) || "ROLE".equalsIgnoreCase(rawType5)) {
                                                        contentValues8.put("data4", vcardItem3.getValue(false));
                                                    }
                                                    String rawType6 = vcardItem3.getRawType(true);
                                                    if ("WORK".equalsIgnoreCase(rawType6)) {
                                                        contentValues8.put("data2", (Integer) 1);
                                                    } else if ("OTHER".equalsIgnoreCase(rawType6)) {
                                                        contentValues8.put("data2", (Integer) 2);
                                                    }
                                                }
                                            }
                                            arrayList.add(contentValues8);
                                            z3 = true;
                                        }
                                    }
                                    phonebookShareAlert2 = phonebookShareAlert;
                                }
                                z3 = z;
                            }
                            i5 = i2 + 1;
                            phonebookShareAlert3 = phonebookShareAlert2;
                            intent = intent2;
                            i3 = 1;
                            z2 = false;
                        }
                        intent2 = intent;
                        phonebookShareAlert2 = phonebookShareAlert3;
                        i2 = i5;
                        z = z3;
                        z3 = z;
                        i5 = i2 + 1;
                        phonebookShareAlert3 = phonebookShareAlert2;
                        intent = intent2;
                        i3 = 1;
                        z2 = false;
                    }
                    Intent intent3 = intent;
                    PhonebookShareAlert phonebookShareAlert4 = phonebookShareAlert3;
                    intent3.putExtra("finishActivityOnSaveCompleted", true);
                    intent3.putParcelableArrayListExtra("data", arrayList);
                    try {
                        phonebookShareAlert4.parentFragment.getParentActivity().startActivity(intent3);
                        phonebookShareAlert4.lambda$showGiftOfferSheet$15();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            });
            builder.show();
            return;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = this.currentUser;
        StringBuilder sb = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
        int iLastIndexOf = sb.lastIndexOf("END:VCARD");
        if (iLastIndexOf >= 0) {
            tL_userContact_old2.phone = null;
            ArrayList arrayList = this.phones;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) arrayList.get(size);
                if (vcardItem.checked) {
                    if (tL_userContact_old2.phone == null) {
                        tL_userContact_old2.phone = vcardItem.getValue(false);
                    }
                    for (int i = 0; i < vcardItem.vcardData.size(); i++) {
                        sb.insert(iLastIndexOf, vcardItem.vcardData.get(i) + "\n");
                    }
                }
            }
            ArrayList arrayList2 = this.other;
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList2.get(size2);
                if (vcardItem2.checked) {
                    for (int size3 = vcardItem2.vcardData.size() - 1; size3 >= 0; size3 += -1) {
                        sb.insert(iLastIndexOf, vcardItem2.vcardData.get(size3) + "\n");
                    }
                }
            }
            tL_userContact_old2.restriction_reason.clear();
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = sb.toString();
            restrictionReason.reason = "";
            restrictionReason.platform = "";
            tL_userContact_old2.restriction_reason.add(restrictionReason);
        }
        BaseFragment baseFragment = this.parentFragment;
        boolean z = baseFragment instanceof ChatActivity;
        if (z) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            if (chatActivity.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getContext(), chatActivity.getDialogId(), -1L, 0, new PhonebookShareAlert$$ExternalSyntheticLambda0(this), null, resourcesProvider);
                return;
            }
        }
        AlertsCreator.ensurePaidMessageConfirmation(this.currentAccount, z ? ((ChatActivity) baseFragment).getDialogId() : 0L, 1, new DialogCell$$ExternalSyntheticLambda6(this, 25), 0L);
    }

    @Override
    public final void onStart() {
        super.onStart();
        Bulletin.addDelegate((FrameLayout) this.containerView, new LaunchActivity.AnonymousClass7(4));
    }

    @Override
    public final void onStop() {
        super.onStop();
        Bulletin.removeDelegate((FrameLayout) this.containerView);
    }

    public final void updateLayout$1(boolean z) {
        final int i = 1;
        AnonymousClass2 anonymousClass2 = this.scrollView;
        final int i2 = 0;
        View childAt = anonymousClass2.getChildAt(0);
        int top = childAt.getTop() - anonymousClass2.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z2 = top <= 0;
        AnonymousClass3 anonymousClass3 = this.actionBar;
        if ((z2 && anonymousClass3.getTag() == null) || (!z2 && anonymousClass3.getTag() != null)) {
            anonymousClass3.setTag(z2 ? 1 : null);
            AnimatorSet animatorSet = this.actionBarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.actionBarAnimation = null;
            }
            View view = this.actionBarShadow;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.actionBarAnimation = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.actionBarAnimation;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(anonymousClass3, (Property<AnonymousClass3, Float>) property, z2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z2 ? 1.0f : 0.0f));
                this.actionBarAnimation.addListener(new AnimatorListenerAdapter(this) {
                    public final PhonebookShareAlert this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i2) {
                            case 0:
                                this.this$0.actionBarAnimation = null;
                                break;
                            default:
                                this.this$0.shadowAnimation = null;
                                break;
                        }
                    }
                });
                this.actionBarAnimation.start();
            } else {
                anonymousClass3.setAlpha(z2 ? 1.0f : 0.0f);
                view.setAlpha(z2 ? 1.0f : 0.0f);
            }
        }
        if (this.scrollOffsetY != top) {
            this.scrollOffsetY = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        anonymousClass2.getMeasuredHeight();
        boolean z3 = childAt.getBottom() - anonymousClass2.getScrollY() > anonymousClass2.getMeasuredHeight();
        View view2 = this.shadow;
        if (!(z3 && view2.getTag() == null) && (z3 || view2.getTag() == null)) {
            return;
        }
        view2.setTag(z3 ? 1 : null);
        AnimatorSet animatorSet4 = this.shadowAnimation;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.shadowAnimation = null;
        }
        if (!z) {
            view2.setAlpha(z3 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.shadowAnimation = animatorSet5;
        animatorSet5.setDuration(180L);
        this.shadowAnimation.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z3 ? 1.0f : 0.0f));
        this.shadowAnimation.addListener(new AnimatorListenerAdapter(this) {
            public final PhonebookShareAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (i) {
                    case 0:
                        this.this$0.actionBarAnimation = null;
                        break;
                    default:
                        this.this$0.shadowAnimation = null;
                        break;
                }
            }
        });
        this.shadowAnimation.start();
    }
}
