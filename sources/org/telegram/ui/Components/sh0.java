package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.location.Location;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class sh0 extends FrameLayout {
    public static final int N = 0;
    public boolean A;
    public er B;
    public fc0 C;
    public fc0 D;
    public org.telegram.ui.ac0 E;
    public qh0 F;
    public TextView G;
    public boolean H;
    public TLRPC.User I;
    public int J;
    public boolean K;
    public ph0 L;
    public org.telegram.ui.cc0 M;

    public VelocityTracker f32441a;

    public int f32442b;

    public int f32443c;
    public int d;

    public boolean f32444e;

    public boolean f32445f;
    public AnimatorSet h;

    public Rect f32446n;

    public boolean f32447r;

    public AnimatorSet f32448s;
    public oh0 v;

    public boolean f32449w;

    public int f32450x;

    public int f32451y;

    public final void a() {
        oh0 oh0Var = this.v;
        if (this.f32447r) {
            return;
        }
        this.f32447r = true;
        AnimatorSet animatorSet = this.f32448s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32448s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32448s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(oh0Var, (Property<oh0, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + oh0Var.getMeasuredHeight()));
        if (this.A) {
            float measuredHeight = oh0Var.getMeasuredHeight();
            this.f32448s.setDuration(Math.max(60, (int) (((measuredHeight - oh0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.A = false;
        } else {
            this.f32448s.setDuration(250L);
        }
        this.f32448s.setInterpolator(er.f28122f);
        this.f32448s.addListener(new rh0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f32448s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        oh0 oh0Var = this.v;
        int i10 = 0;
        if (!this.f32447r) {
            if (motionEvent == null || (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2) || this.f32445f || this.f32444e || motionEvent.getPointerCount() != 1)) {
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.f32441a == null) {
                        this.f32441a = VelocityTracker.obtain();
                    }
                    float fAbs = Math.abs((int) (motionEvent.getX() - this.f32442b));
                    float y10 = ((int) motionEvent.getY()) - this.f32443c;
                    this.f32441a.addMovement(motionEvent);
                    if (this.f32444e && !this.f32445f && y10 > 0.0f && y10 / 3.0f > Math.abs(fAbs) && Math.abs(y10) >= this.f32451y) {
                        this.f32443c = (int) motionEvent.getY();
                        this.f32444e = false;
                        this.f32445f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f32445f) {
                        float translationY = oh0Var.getTranslationY() + y10;
                        oh0Var.setTranslationY(translationY >= 0.0f ? translationY : 0.0f);
                        this.f32443c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f32441a == null) {
                        this.f32441a = VelocityTracker.obtain();
                    }
                    this.f32441a.computeCurrentVelocity(1000);
                    float translationY2 = oh0Var.getTranslationY();
                    if (this.f32445f || translationY2 != 0.0f) {
                        float xVelocity = this.f32441a.getXVelocity();
                        float yVelocity = this.f32441a.getYVelocity();
                        float translationY3 = oh0Var.getTranslationY();
                        if ((translationY3 >= AndroidUtilities.getPixelsInCM(0.8f, false) || (yVelocity >= 3500.0f && Math.abs(yVelocity) >= Math.abs(xVelocity))) && (yVelocity >= 0.0f || Math.abs(yVelocity) < 3500.0f)) {
                            this.A = true;
                            a();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.h = animatorSet;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(oh0Var, (Property<oh0, Float>) View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY3) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(er.f28123g);
                            this.h.addListener(new rh0(this, i10));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        }
                        this.f32445f = false;
                    } else {
                        this.f32444e = false;
                        this.f32445f = false;
                    }
                    VelocityTracker velocityTracker = this.f32441a;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f32441a = null;
                    }
                    this.d = -1;
                }
            } else {
                this.f32442b = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                this.f32443c = y11;
                if (y11 < oh0Var.getTop() || this.f32442b < oh0Var.getLeft() || this.f32442b > oh0Var.getRight()) {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
                this.d = motionEvent.getPointerId(0);
                this.f32444e = true;
                AnimatorSet animatorSet2 = this.h;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.h = null;
                }
                VelocityTracker velocityTracker2 = this.f32441a;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            if ((!z10 && this.f32444e) || this.f32445f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean z10) {
        boolean z11;
        TextView textView = this.G;
        TLRPC.User user = this.I;
        qh0 qh0Var = this.F;
        float value = getValue();
        String distance = LocaleController.formatDistance(value, 2, Boolean.valueOf(this.K));
        int i10 = (int) value;
        org.telegram.ui.tc0 tc0Var = this.E.f36507b;
        ArrayList arrayList = tc0Var.f42860c0;
        IMapsProvider.ICircle iCircle = tc0Var.K;
        if (iCircle != null) {
            iCircle.setRadius(i10);
            if (z10) {
                IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(tc0Var.f42880s0.getLatitude(), tc0Var.f42880s0.getLongitude()));
                try {
                    int iMax = Math.max(i10, 250);
                    IMapsProvider.LatLng center = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build().getCenter();
                    double d = iMax;
                    IMapsProvider.LatLng latLngP0 = org.telegram.ui.tc0.p0(center, d, d);
                    double d10 = -iMax;
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(org.telegram.ui.tc0.p0(center, d10, d10));
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(latLngP0);
                    IMapsProvider.ILatLngBounds iLatLngBoundsBuild = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build();
                    try {
                        tc0Var.E.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), (int) ((tc0Var.N.getCustomView().getMeasuredHeight() - AndroidUtilities.dp(40.0f)) + tc0Var.O.getTranslationY()));
                        tc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuild, 0), 500, null);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!DialogObject.isChatDialog(tc0Var.f42856a0)) {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z11 = false;
                    break;
                }
                org.telegram.ui.nc0 nc0Var = (org.telegram.ui.nc0) arrayList.get(i11);
                if (nc0Var.f40730b != null && !UserObject.isUserSelf(nc0Var.f40731c)) {
                    TLRPC.GeoPoint geoPoint = nc0Var.f40730b.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (tc0Var.f42880s0.distanceTo(location) > i10) {
                        z11 = true;
                        break;
                    }
                }
                i11++;
            }
        } else {
            z11 = true;
            break;
        }
        if (!z11 && user != null) {
            textView.setText(LocaleController.formatString("LocationNotifiationCloser", R.string.LocationNotifiationCloser, distance));
            if (qh0Var.getTag() == null) {
                qh0Var.setTag(1);
                qh0Var.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                textView.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                return;
            }
            return;
        }
        if (user == null) {
            qh0Var.setText(LocaleController.formatString("LocationNotifiationButtonGroup", R.string.LocationNotifiationButtonGroup, distance));
        } else {
            qh0Var.setText(LocaleController.formatString("LocationNotifiationButtonUser", R.string.LocationNotifiationButtonUser, TextUtils.ellipsize(UserObject.getFirstName(user), qh0Var.getPaint(), Math.max(AndroidUtilities.dp(10.0f), (int) (((this.J - AndroidUtilities.dp(94.0f)) * 1.5f) - ((int) Math.ceil(qh0Var.getPaint().measureText(LocaleController.getString(R.string.LocationNotifiationButtonUser)))))), TextUtils.TruncateAt.END), distance));
        }
        if (qh0Var.getTag() != null) {
            qh0Var.setTag(null);
            qh0Var.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
            textView.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f32447r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.L;
    }

    public boolean getRadiusSet() {
        return this.H;
    }

    public float getValue() {
        float f10;
        float value = this.C.getValue() * 1000;
        int value2 = this.D.getValue();
        boolean z10 = this.K;
        if (z10) {
            if (value2 == 1) {
                f10 = 47.349f;
            } else {
                if (value2 > 1) {
                    value2--;
                }
                f10 = value2 * 100;
            }
        } else if (value2 == 1) {
            f10 = 50.0f;
        } else {
            if (value2 > 1) {
                value2--;
            }
            f10 = value2 * 100;
        }
        float f11 = value + f10;
        return z10 ? f11 * 1.60934f : f11;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f32447r || b(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i13 - i11;
        oh0 oh0Var = this.v;
        int measuredHeight = i20 - oh0Var.getMeasuredHeight();
        int i21 = i12 - i10;
        int measuredWidth = (i21 - oh0Var.getMeasuredWidth()) / 2;
        oh0Var.layout(measuredWidth, measuredHeight, oh0Var.getMeasuredWidth() + measuredWidth, oh0Var.getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != oh0Var) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i23 = layoutParams.gravity;
                if (i23 == -1) {
                    i23 = 51;
                }
                int i24 = i23 & 112;
                int i25 = i23 & 7;
                if (i25 != 1) {
                    if (i25 != 5) {
                        i16 = layoutParams.leftMargin;
                    } else {
                        i14 = i12 - measuredWidth2;
                        i15 = layoutParams.rightMargin;
                    }
                    if (i24 != 16) {
                        if (i24 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = i20 - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((i20 - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                } else {
                    i14 = ((i21 - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i24 != 16) {
                    if (i24 != 80) {
                        i19 = layoutParams.topMargin;
                    } else {
                        i17 = i20 - measuredHeight2;
                        i18 = layoutParams.bottomMargin;
                    }
                    childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                } else {
                    i17 = ((i20 - measuredHeight2) / 2) + layoutParams.topMargin;
                    i18 = layoutParams.bottomMargin;
                }
                i19 = i17 - i18;
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f32446n);
        setMeasuredDimension(size, size2);
        oh0 oh0Var = this.v;
        oh0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f32450x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != oh0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f32447r || b(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f32444e && !this.f32445f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
