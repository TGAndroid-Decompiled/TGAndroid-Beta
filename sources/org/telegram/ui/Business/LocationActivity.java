package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.RendererCapabilities;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class LocationActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public String address;
    public boolean clearVisible;
    public TLRPC.TL_businessLocation currentLocation;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public AnonymousClass2 editText;
    public FrameLayout editTextContainer;
    public TLRPC.GeoPoint geo;
    public boolean ignoreEditText;
    public UniversalRecyclerView listView;
    public boolean mapAddress;
    public ClipRoundedDrawable mapLoadingDrawable;
    public AnonymousClass6 mapMarker;
    public UserCell.AnonymousClass2 mapPreview;
    public FrameLayout mapPreviewContainer;
    public int shiftDp;
    public boolean valueSet;

    public final class AnonymousClass4 implements InputFilter {
        @Override
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (charSequence == null) {
                return null;
            }
            String string = charSequence.toString();
            if (string.contains("\n")) {
                return string.replaceAll("\n", "");
            }
            return null;
        }
    }

    public LocationActivity() {
        super(null);
        this.shiftDp = -4;
    }

    public final void checkDone$2(boolean z) {
        if (this.doneButton == null) {
            return;
        }
        boolean zHasChanges = hasChanges();
        this.doneButton.setEnabled(zHasChanges);
        if (z) {
            this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
            this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
            this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || universalRecyclerView.adapter == null) {
            return;
        }
        if (this.clearVisible != ((this.currentLocation == null || (this.geo == null && TextUtils.isEmpty(this.address))) ? false : true)) {
            this.listView.adapter.update(true);
        }
    }

    @Override
    public final View createView(Context context) {
        int i = 3;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i2 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 9));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i3 = Theme.key_actionBarDefaultIcon;
        int i4 = 0;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i3, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone$2(false);
        FrameLayout frameLayout = new FrameLayout(context);
        int i5 = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(Theme.getColor(null, i5, false));
        ?? r6 = new EditTextBoldCursor(getParentActivity()) {
            public final AnimatedTextView.AnimatedTextDrawable limit;
            public final AnimatedColor limitColor = new AnimatedColor(this);
            public int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
                this.limit = animatedTextDrawable;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                animatedTextDrawable.moveAmplitude = 0.2f;
                animatedTextDrawable.animateDuration = 160L;
                animatedTextDrawable.animateWave = 1.0f;
                animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.33f));
                animatedTextDrawable.setCallback(this);
                animatedTextDrawable.gravity = 5;
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                int i6 = this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, LocationActivity.this.getResourceProvider()), false);
                animatedTextDrawable.textPaint.setColor(i6);
                animatedTextDrawable.alpha = Color.alpha(i6);
                animatedTextDrawable.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                animatedTextDrawable.draw(canvas);
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                super.onTextChanged(charSequence, i6, i7, i8);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                if (animatedTextDrawable != null) {
                    this.limitCount = 96 - charSequence.length();
                    animatedTextDrawable.cancelAnimation();
                    String str = "";
                    if (this.limitCount <= 12) {
                        str = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str, true, true);
                }
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        this.editText = r6;
        r6.setTextSize(1, 17.0f);
        setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        AnonymousClass2 anonymousClass2 = this.editText;
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        anonymousClass2.setTextColor(Theme.getColor(null, i6, false));
        setBackgroundDrawable(null);
        setMaxLines(5);
        setSingleLine(false);
        setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        setInputType(180225);
        setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        setCursorColor(Theme.getColor(null, i6, false));
        setCursorSize(AndroidUtilities.dp(19.0f));
        setCursorWidth(1.5f);
        addTextChangedListener(new ArticleViewer.AnonymousClass16(this, i));
        setFilters(new InputFilter[]{new AnonymousClass4()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.editTextContainer = frameLayout2;
        frameLayout2.addView(this.editText, LayoutHelper.createFrame(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.editTextContainer;
        int i7 = Theme.key_windowBackgroundWhite;
        frameLayout3.setBackgroundColor(getThemedColor(i7));
        AnonymousClass2 anonymousClass3 = this.editText;
        if (anonymousClass3 != null) {
            this.ignoreEditText = true;
            anonymousClass3.setText(this.address);
            AnonymousClass2 anonymousClass4 = this.editText;
            anonymousClass4.setSelection(anonymousClass4.getText().length());
            this.ignoreEditText = false;
        }
        this.mapPreview = new UserCell.AnonymousClass2(this, context, i2);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, Theme.key_chat_outLocationIcon, 0.2f);
        svgThumb.setColorKey(i6, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.mapPreview.getImageReceiver());
        ClipRoundedDrawable clipRoundedDrawable = new ClipRoundedDrawable(svgThumb);
        this.mapLoadingDrawable = clipRoundedDrawable;
        clipRoundedDrawable.setCallback(this.mapPreview);
        this.mapPreview.setBackgroundColor(getThemedColor(i7));
        this.mapMarker = new View(this, context) {
            public final ImageReceiver avatarImage;
            public final Drawable pin = getContext().getResources().getDrawable(R.drawable.map_pin_photo).mutate();

            {
                AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                ImageReceiver imageReceiver = new ImageReceiver(this);
                this.avatarImage = imageReceiver;
                avatarDrawable.setInfo(UserConfig.selectedAccount, this.getUserConfig().getCurrentUser());
                imageReceiver.setForUserOrChat(this.getUserConfig().getCurrentUser(), avatarDrawable);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                int iDp = AndroidUtilities.dp(62.0f);
                int iDp2 = AndroidUtilities.dp(85.0f);
                Drawable drawable = this.pin;
                drawable.setBounds(0, 0, iDp, iDp2);
                drawable.draw(canvas);
                ImageReceiver imageReceiver = this.avatarImage;
                imageReceiver.setRoundRadius(AndroidUtilities.dp(62.0f));
                imageReceiver.setImageCoords(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                imageReceiver.draw(canvas);
            }

            @Override
            public final void onMeasure(int i8, int i9) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(85.0f), 1073741824));
            }
        };
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.mapPreviewContainer = frameLayout4;
        frameLayout4.addView(this.mapPreview, LayoutHelper.createFrame(-1.0f, -1));
        this.mapPreviewContainer.addView(this.mapMarker, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        updateMapPreview();
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new CallLogActivity$$ExternalSyntheticLambda3(this, 8), new LocationActivity$$ExternalSyntheticLambda1(this, i4), null, getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        universalRecyclerView2.adapter.applyBackground = false;
        frameLayout.addView(universalRecyclerView2, LayoutHelper.createFrame(-1.0f, -1));
        ActionBar actionBar = this.actionBar;
        UniversalRecyclerView universalRecyclerView3 = this.listView;
        actionBar.getClass();
        actionBar.setAdaptiveBackground(universalRecyclerView3, true, i5, Theme.key_actionBarDefault);
        setValue$3();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue$3();
        }
    }

    public final boolean hasChanges() {
        TLRPC.GeoPoint geoPoint;
        if (((this.geo == null && TextUtils.isEmpty(this.address)) ? false : true) != (this.currentLocation != null)) {
            return true;
        }
        boolean z = (this.geo == null && TextUtils.isEmpty(this.address)) ? false : true;
        TLRPC.TL_businessLocation tL_businessLocation = this.currentLocation;
        if (z != ((tL_businessLocation == null || (tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) ? false : true)) {
            return true;
        }
        if (!TextUtils.equals(this.address, tL_businessLocation != null ? tL_businessLocation.address : "")) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.geo;
        boolean z2 = geoPoint2 != null;
        TLRPC.TL_businessLocation tL_businessLocation2 = this.currentLocation;
        if (z2 != ((tL_businessLocation2 == null || tL_businessLocation2.geo_point == null) ? false : true)) {
            return true;
        }
        return geoPoint2 != null && (tL_businessLocation2 == null || (geoPoint = tL_businessLocation2.geo_point) == null || !((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !hasChanges();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        boolean z2 = this.geo == null && TextUtils.isEmpty(this.address);
        if (!hasChanges() || z2) {
            return super.onBackPressed(z);
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.UnsavedChanges);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new LocationActivity$$ExternalSyntheticLambda1(this, 1));
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new LocationActivity$$ExternalSyntheticLambda1(this, 2));
            showDialog(alertDialog);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public final void processDone$3() {
        if (this.doneButtonDrawable.progress > 0.0f) {
            return;
        }
        boolean z = this.geo == null && TextUtils.isEmpty(this.address);
        if (!z) {
            if (!hasChanges()) {
                finishFragment();
                return;
            }
            String str = this.address;
            String strTrim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(strTrim) || strTrim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AnonymousClass2 anonymousClass2 = this.editText;
                int i = -this.shiftDp;
                this.shiftDp = i;
                AndroidUtilities.shakeViewSpring(anonymousClass2, i);
                return;
            }
        }
        this.doneButtonDrawable.animateToProgress(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z) {
            if (this.geo != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.geo;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.address;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.address;
                if (this.geo != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.geo;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new LocationActivity$$ExternalSyntheticLambda5(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void setValue$3() {
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.currentLocation = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.geo = tL_businessLocation.geo_point;
            this.address = tL_businessLocation.address;
        } else {
            this.geo = null;
            this.address = "";
        }
        AnonymousClass2 anonymousClass2 = this.editText;
        if (anonymousClass2 != null) {
            this.ignoreEditText = true;
            anonymousClass2.setText(this.address);
            AnonymousClass2 anonymousClass3 = this.editText;
            anonymousClass3.setSelection(anonymousClass3.getText().length());
            this.ignoreEditText = false;
        }
        updateMapPreview();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        this.valueSet = true;
    }

    public final void updateMapPreview() {
        UserCell.AnonymousClass2 anonymousClass2;
        AnonymousClass6 anonymousClass6 = this.mapMarker;
        if (anonymousClass6 == null || (anonymousClass2 = this.mapPreview) == null) {
            return;
        }
        if (this.geo == null) {
            anonymousClass2.setImageBitmap(null);
            return;
        }
        anonymousClass6.setAlpha(0.0f);
        setTranslationY(-AndroidUtilities.dp(12.0f));
        int measuredWidth = this.mapPreview.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : this.mapPreview.getMeasuredWidth();
        float f = AndroidUtilities.density;
        int i = (int) (measuredWidth / f);
        int iMin = Math.min(2, (int) Math.ceil(f));
        UserCell.AnonymousClass2 anonymousClass3 = this.mapPreview;
        TLRPC.GeoPoint geoPoint = this.geo;
        anonymousClass3.setImage$1(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, iMin * i, iMin * 240, 15, iMin)), RendererCapabilities.CC.m(i, "_240"), this.mapLoadingDrawable, null);
    }
}
