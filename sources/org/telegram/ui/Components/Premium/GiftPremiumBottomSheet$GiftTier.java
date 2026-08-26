package org.telegram.ui.Components.Premium;

import com.android.billingclient.api.ProductDetails;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;

public final class GiftPremiumBottomSheet$GiftTier {
    public int discount;
    public final TLRPC.TL_premiumGiftCodeOption giftCodeOption;
    public final TLRPC.TL_premiumGiftOption giftOption;
    public ProductDetails googlePlayProductDetails;
    public long pricePerMonth;
    public long pricePerMonthRegular;
    public final TLRPC.TL_premiumGiftCodeOption starsCodeOption;
    public final TLRPC.TL_premiumGiftOption starsOption;

    public GiftPremiumBottomSheet$GiftTier(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.giftOption = tL_premiumGiftOption;
        this.giftCodeOption = null;
        this.starsOption = null;
        this.starsCodeOption = null;
    }

    public final String getCurrency() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.giftOption;
        if (tL_premiumGiftOption == null) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.giftCodeOption;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        } else if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.currency;
        }
        ProductDetails productDetails = this.googlePlayProductDetails;
        return productDetails == null ? "" : productDetails.getOneTimePurchaseOfferDetails().zzc;
    }

    public final int getDiscount() {
        if (this.discount == 0) {
            if (getPricePerMonth() == 0) {
                return 0;
            }
            if (this.pricePerMonthRegular != 0) {
                int pricePerMonth = (int) ((1.0d - (getPricePerMonth() / this.pricePerMonthRegular)) * 100.0d);
                this.discount = pricePerMonth;
                if (pricePerMonth == 0) {
                    this.discount = -1;
                }
            }
        }
        return this.discount;
    }

    public final String getFormattedPrice() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (BuildVars.useInvoiceBilling() || (((tL_premiumGiftOption = this.giftOption) != null && tL_premiumGiftOption.store_product == null) || ((tL_premiumGiftCodeOption = this.giftCodeOption) != null && tL_premiumGiftCodeOption.store_product == null))) {
            return BillingController.getInstance().formatCurrency(getPrice(), getCurrency());
        }
        return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPrice(), getCurrency(), 6);
    }

    public final int getMonths() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.giftOption;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.giftCodeOption;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long getPrice() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.giftOption;
        if (tL_premiumGiftOption == null) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.giftCodeOption;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        } else if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.amount;
        }
        ProductDetails productDetails = this.googlePlayProductDetails;
        if (productDetails == null) {
            return 0L;
        }
        return productDetails.getOneTimePurchaseOfferDetails().zzb;
    }

    public final long getPricePerMonth() {
        if (this.pricePerMonth == 0) {
            long price = getPrice();
            if (price != 0) {
                this.pricePerMonth = price / ((long) getMonths());
            }
        }
        return this.pricePerMonth;
    }

    public GiftPremiumBottomSheet$GiftTier(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.giftOption = null;
        this.giftCodeOption = tL_premiumGiftCodeOption;
        this.starsOption = null;
        this.starsCodeOption = tL_premiumGiftCodeOption2 == null ? null : tL_premiumGiftCodeOption2;
    }
}
